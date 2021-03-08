package com.rakovets.course.java.core.practice.concurrent.utilities.master_workers.controller;

import com.rakovets.course.java.core.practice.concurrent.utilities.master_workers.exceptions.UserInputException;
import com.rakovets.course.java.core.practice.concurrent.utilities.master_workers.repository.CommonResourceRepository;
import com.rakovets.course.java.core.practice.concurrent.utilities.master_workers.service.ThreadWorkerService;
import com.rakovets.course.java.core.practice.concurrent.utilities.master_workers.view.ThreadMasterViewConsole;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadMasterController {
    private final ThreadMasterViewConsole threadMasterViewConsole = new ThreadMasterViewConsole();
    private final CommonResourceRepository commonResourceRepository = new CommonResourceRepository();
    private final ThreadWorkerService threadWorkerService = new ThreadWorkerService(commonResourceRepository);
    public int number;

    public void start() {
        ExecutorService service = Executors.newSingleThreadExecutor();
        service.submit(threadWorkerService);
        Scanner input = new Scanner(System.in);
        while (true) {
            try {
                threadMasterViewConsole.enterNumber();
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
                threadMasterViewConsole.invalidInput();
            }
        }
    }
}
