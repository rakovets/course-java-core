package com.rakovets.course.java.core.example.decision_making_statements;

public class Example6SwitchStatement {
    public static void main(String[] args) {
        int size = 5;

        String textSize;

        switch (size) {
            case 29:
            case 30:
            case 31:
                textSize = "Small";
                System.out.println("This is 'Small' size");
                break;
            case 42:
            case 43:
                textSize = "Medium";
                System.out.println("This is 'Medium' size");
                break;
            case 44:
            case 45:
            case 46:
                textSize = "Large";
                System.out.println("This is 'Large' size");
                break;
            case 48:
                textSize = "Extra Large";
                System.out.println("This is 'Extra Large' size");
                break;
            default:
                textSize = "Unknown";
                System.out.println("This is 'Unknown' size");
                break;
        }

        System.out.println(textSize);
    }
}
