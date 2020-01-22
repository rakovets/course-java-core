package com.rakovets.java.solid;

import java.util.Scanner;

public class ChooseSizePizzaForYourself {
    private int size = 18;
    public void chooseSize() {
        System.out.printf("Very well!) Now choose size of pizza: \n- 18\n- 25\n- 36");
        Scanner scanner = new Scanner(System.in);
        int sizeThatEnterClient = scanner.nextInt();
        if (sizeThatEnterClient == 18 || sizeThatEnterClient == 25 || sizeThatEnterClient == 36) {
            setSize(sizeThatEnterClient);
        } else {
            System.out.println("This size exist :(, choose another");
            chooseSize();
        }
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
