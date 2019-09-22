package com.rakovets.course.examples.module3.using;

/**
 * 
 * Права доступа
 *
 */
public class Task02
{
    public static void main(String[] args)
    {
        final int EXECUTE = 0b001; //001 
        final int WRITE = 0b010; //010 
        final int READ = 0b100; //100 
        
        int usersAccess = EXECUTE | WRITE | READ;
        //int usersAccess = EXECUTE | READ | WRITE;

        //FIXME дописать отсальные case для всех возможных комбинаций прав доступа
        switch(usersAccess)
        {
            case EXECUTE: 
                System.out.println("EXECUTE");
                break;
            case EXECUTE | READ: 
                System.out.println("EXECUTE, READ");
                break;
            case 2: 
                System.out.println("WRITE");
                break;
            case 0b111: 
                System.out.println("EXECUTE, WRITE, READ");
                break;
        }

/*        usersAccess = usersAccess^EXECUTE;
        switch(usersAccess)
        {
            case 1: 
                System.out.println("EXECUTE");
                break;
            case 6: 
                System.out.println("WRITE, READ");
                break;
        }
*/    }
}
