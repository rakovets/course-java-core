package com.rakovets.course.challenge.exception;

class Task3 {
    public static int getDiameter(int d) throws DiameterException {
        if (d < 0) {
            throw new DiameterException("Диаметр меньше нуля! Ошибка!", d);
        }
        return d;
    }

    public static void main(String[] args) {
        try {
            int result = Task3.getDiameter(-1);
            System.out.println(result);
        } catch (DiameterException ex) {
            System.out.println(ex.getMessage());
            System.out.println(ex.getNumber());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

class DiameterException extends Exception {
    private int number;

    public int getNumber() {
        return number;
    }

    public DiameterException(String message, int d) {
        super(message);
        number = d;
    }
}