package com.rakovets.course.java.core.practice.io.Files;

import java.io.File;
import java.io.IOException;

public class FilesCreator {
    public static void main(String[] args) {
        try {
            File file = Files.INPUT_FILE;
            if (file.exists()) {
                System.out.printf("File '%s' already exists", file.getName());
            } else {
                if (file.createNewFile()) {
                    System.out.printf("New file '%s' is created", file.getName());
                } else {
                    System.out.printf("New file '%s' isn't created", file.getName());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        try {
            File file1 = Files.OUTPUT_FILE;
            if (file1.exists()) {
                System.out.printf("File '%s' already exists.\n", file1.getName());
            } else {
                if (file1.createNewFile()) {
                    System.out.printf("New file '%s' is created", file1.getName());
                } else {
                    System.out.printf("New file '%s' isn't created", file1.getName());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            File file2 = Files.NUMBERS;
            if (file2.exists()) {
                System.out.printf("File '%s' already exists.\n", file2.getName());
            } else {
                if (file2.createNewFile()) {
                    System.out.printf("New file '%s' is created", file2.getName());
                } else {
                    System.out.printf("New file '%s' isn't created", file2.getName());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            File file3 = Files.SORTED_NUMBERS;
            if (file3.exists()) {
                System.out.printf("File '%s' already exists.\n", file3.getName());
            } else {
                if (file3.createNewFile()) {
                    System.out.printf("New file '%s' is created", file3.getName());
                } else {
                    System.out.printf("New file '%s' isn't created", file3.getName());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            File file4 = Files.STUDENTS;
            if (file4.exists()) {
                System.out.printf("File '%s' already exists.\n", file4.getName());
            } else {
                if (file4.createNewFile()) {
                    System.out.printf("New file '%s' is created", file4.getName());
                } else {
                    System.out.printf("New file '%s' isn't created", file4.getName());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            File file5 = Files.JAVA_CODE;
            if (file5.exists()) {
                System.out.printf("File '%s' already exists.\n", file5.getName());
            } else {
                if (file5.createNewFile()) {
                    System.out.printf("New file '%s' is created", file5.getName());
                } else {
                    System.out.printf("New file '%s' isn't created", file5.getName());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            File file6 = Files.JAVA_CODE_CHANGED;
            if (file6.exists()) {
                System.out.printf("File '%s' already exists.\n", file6.getName());
            } else {
                if (file6.createNewFile()) {
                    System.out.printf("New file '%s' is created", file6.getName());
                } else {
                    System.out.printf("New file '%s' isn't created", file6.getName());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            File file7 = Files.NUMBERS_SET;
            if (file7.exists()) {
                System.out.printf("File '%s' already exists.\n", file7.getName());
            } else {
                if (file7.createNewFile()) {
                    System.out.printf("New file '%s' is created", file7.getName());
                } else {
                    System.out.printf("New file '%s' isn't created", file7.getName());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
