package com.rakovets.course.java.core.practice.jcf_set.input_output_tools;

import com.rakovets.course.java.core.practice.jcf_set.web_service.Exceptions.WrongButtonNumberException;

import java.util.Scanner;

public class MenuButtonInputTool {
    static Scanner scanner = new Scanner(System.in);

    public static int button() throws WrongButtonNumberException {
        System.out.println("Button:");
        int button = scanner.nextInt();
        scanner.nextLine();
        if (button < 0 || button > 5){
            throw new WrongButtonNumberException();
        }
        return button;
    }
}
