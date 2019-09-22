package com.rakovets.course.examples.module3.condition;

public class Task07
{
    public static void main(String[] args)
    {
        final char test = '1';

        switch (test)
        {
            case 1:
                System.out.println("OK");
                break;
            default:
                System.out.println("BAD");
                System.exit(42);
        }
        // FIXME переделай программу таким образом, чтобы выводилось OK добавив
        // в код всего два символа
    }
}