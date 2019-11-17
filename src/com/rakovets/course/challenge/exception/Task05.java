package com.rakovets.course.challenge.exception;

public class Task05 {
    public static void main(String[] args) {
        JdkException jdkException = new JdkException("NullPointerException");
        jdkException.setException1(true);
        try {
            jdkException.findException();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }

    }

    public static class JdkException extends NullPointerException {
        private String name;
        private boolean exception1;

        JdkException(String name) {
            this.name = name;
        }

        public void setException1(boolean exception1) {
            System.out.println("String cannot be null!");
            this.exception1 = exception1;

        }

        public void findException() throws Exception {
            if (exception1 == false) {
                System.out.println("String cannot be zero");
            } else {
                System.out.println("It s a true");
            }
        }

        static class NullString {
            public static String getString(String string) throws NullPointerException {
                String result = string;
                if (string == null) {
                    throw new NullPointerException("The String equally null");
                } else if (string == string) {
                    System.out.println("True cuz String always equally string");
                }
                return result;
            }
        }
    }
}
