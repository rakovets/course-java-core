package com.rakovets.course.java.core.practice.exception_handling.Task05;

class Age {
    private int age;

    public Age(int age) {
        this.age = age;
    }

    public void checkAge() throws AgeException {
        if (this.age < 18)
            throw new AgeException("You are a minor", "You don't have an access");
    }

    public static class AgeException extends Exception {
        private final String debugMessage;

        public AgeException(String message, String debugMessage) {
            super(message);
            this.debugMessage = debugMessage;
        }

        public String getDebugMessage() {
            return debugMessage;
        }
    }
}
