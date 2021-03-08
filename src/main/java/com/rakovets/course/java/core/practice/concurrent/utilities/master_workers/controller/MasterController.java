package com.rakovets.course.java.core.practice.concurrent.utilities.master_workers.controller;

import com.rakovets.course.java.core.practice.concurrent.utilities.master_workers.exceptions.UserInputException;
import com.rakovets.course.java.core.practice.concurrent.utilities.master_workers.repository.CommonResourceRepository;
import com.rakovets.course.java.core.practice.concurrent.utilities.master_workers.service.WorkerService;
import com.rakovets.course.java.core.practice.concurrent.utilities.master_workers.view.MasterViewConsole;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MasterController {
    private static final MasterViewConsole masterViewConsole;
    private static final CommonResourceRepository commonResourceRepository;
    private static final WorkerService workerService;
    public int number;

    static {

        masterViewConsole = new MasterViewConsole();
        commonResourceRepository = new CommonResourceRepository();
        workerService = new WorkerService(commonResourceRepository);

    }

    public void start() {
        ExecutorService service = Executors.newSingleThreadExecutor();
        service.submit(workerService);
        Scanner input = new Scanner(System.in);
        while (true) {
            try {
                masterViewConsole.enterNumber();
                number = Integer.parseInt(input.nextLine());
                commonResourceRepository.list.add(number);
                if (number == -1) {
                    service.shutdown();
                    break;
                } else if (number < -1)
                    try {
                        throw new UserInputException(number);
                    } catch (UserInputException e) {
                        e.printStackTrace();
                    }
            } catch (NumberFormatException e) {
                masterViewConsole.invalidInput();
            }
        }
    }
}
