package com.rakovets.course.java.core.practice.exception_handling;

public class Task1 {
    public static void main(String[] args) {
        String name = null;

        try {
            int i = name.length();
        } catch (NullPointerException e) {
            System.out.println("Exception message " + e.getMessage());
        }
    }
}

class Task2 {
    public static void main(String[] args) {
        int[] box = new int[]{10, 11, 12, 13, 14, 15};

        try {
            box[6] = 16;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception array " + e.getMessage());
        }
    }
}

class Task3 {
    public static void main(String[] args) {
        try {
            helloMessage(null);
        } catch (Task3StringException e) {
            System.err.println(e.getMessage());
        }
    }

    public static String helloMessage(Object name) throws Task3StringException {
        if (name == null) {
            throw new Task3StringException("Name is null");
        }
        return "Hello, " + name;
    }
}

class Task3StringException extends Exception {
    public Task3StringException(String message) {
        super(message);
    }
}

class Task4 {
    public static void main(String[] args) {
        String[] abc = new String[5];

        try {
            returnNextElement(abc, 6);
        } catch (Task4RunException e) {
            System.err.println(e.getMessage());
        }
    }

    public static String returnNextElement(String[] array, int index) throws Task4RunException {
        if (index >= array.length) {
            throw new Task4RunException("This number " + index + " not exist");
        }
        return array[index];
    }
}

class Task4RunException extends RuntimeException {
    public Task4RunException(String message) {
        super(message);
    }
}

class Task5 {
    public static char getFirstLetter(String nameBoss) throws Task5BossException {
        char ch;

        try {
            ch = nameBoss.charAt(0);
        } catch (NullPointerException e) {
            throw new Task5BossException(e.getMessage());
        }
        return ch;
    }
}

class Task5BossException extends Exception {
    public Task5BossException(String message) {
        super(message);
    }
}

class Task6 {
    public static void main(String[] args) {
        try {
            task6ThreeBox();
        } catch (NullPointerException e) {
            System.out.println("NullPointerException block");
            System.out.println(e.getMessage());
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("two exceptions block");
            System.out.println(e.getMessage());
        }
    }

    public static void task6ThreeBox() throws
            NullPointerException, ArithmeticException, ArrayIndexOutOfBoundsException {
        int i = (int) (Math.random() * 3);
        int[] box = new int[i];

        if (box.length == 0) {
            throw new NullPointerException();
        } else if (box.length == 2) {
            int result = box[0] / box[1];
            throw new ArithmeticException("ArithmeticException");
        } else {
            int result = box[4];
            throw new ArrayIndexOutOfBoundsException("ArrayIndexOutOfBoundsException");
        }
    }
}

class Task7 {
    public static void main(String[] args) {
        try {
            task7FiftyPercent();
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finally");
        }

    }

    public static void task7FiftyPercent() {
        int i = (int) (1 + Math.random() * 10);
        if ((i % 2) == 0) {
            double result = i / (i % 2);
            throw new ArithmeticException();
        }
    }
}
