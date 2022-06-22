package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class Atm {
    private int numberBanknotes20 = 0;
    private int numberBanknotes50 = 0;
    private int numberBanknotes100 = 0;
    private int[] arrDigit20 = new int[100];
    private int[] arrDigit50 = new int[100];
    private int[] arrDigit100 = new int[100];

    public Atm(int numberBanknotes20, int numberBanknotes50, int numberBanknotes100) throws IllegalArgumentException {
        if(numberBanknotes20 < 0 || numberBanknotes50 < 0 || numberBanknotes100 < 0) {
            throw new IllegalArgumentException();
        } else {
            this.numberBanknotes20 = numberBanknotes20;
            this.numberBanknotes50 = numberBanknotes50;
            this.numberBanknotes100 = numberBanknotes100;
        }
    }

    public boolean isPossibleIssue(int amount) {
        int newDigit100 = 0;
        int countDigit100 = 0;
        int countDigit50 = 0;
        int countDigit20 = 0;
        while (newDigit100 < amount) {
            if (newDigit100 > amount) {
                break;
            }
            int newDigit50 = newDigit100;
            while (newDigit50 < amount) {
                newDigit50 += 50;
                if (newDigit50 > amount) {
                    break;
                }
                if (numberBanknotes50 < countDigit50) {
                    break;
                }
                countDigit50++;
                int newDigit20 = newDigit50;
                while (newDigit20 % 20 != 0) {
                    newDigit20 += 20;
                    if (newDigit20 > amount) {
                        break;
                    }
                    if (newDigit20 == amount) {
                        countDigit20 = (newDigit20 - newDigit50) / 20;
                        break;
                    }
                    if (numberBanknotes20 < countDigit20) {
                        break;
                    }
                }
                if (newDigit20 % 20 == 0) {
                    countDigit20 = (amount - newDigit20) / 20;
                }
                if (numberBanknotes20 < countDigit20) {
                    break;
                }
                int result = countDigit20 * 20 + countDigit50 * 50 + countDigit100 * 100;
                if (result == amount) {
                    return true;
                }
                countDigit20 = 0;
            }
            countDigit50 = 0;
            int newDigit20 = newDigit100;
            while (newDigit20 < amount) {
                if ((amount - newDigit20) % 20 == 0) {
                    countDigit20 = (amount - newDigit20) / 20;
                }
                if (numberBanknotes20 < countDigit20) {
                    break;
                }
                int result = countDigit20 * 20 + countDigit50 * 50 + countDigit100 * 100;
                if (result == amount) {
                    return true;
                }
                newDigit20 += 20;
                if (newDigit20 > amount) {
                    break;
                }
            }
            newDigit100 += 100;
            countDigit100++;
            if (numberBanknotes100 < countDigit100) {
                break;
            }
        }
        return false;
    }

    public void getOptionsCombinationBanknotes(int amount) {
        int newDigit100 = 0;
        int countDigit100 = 0;
        int countDigit50 = 0;
        int countDigit20 = 0;
        int count = 0;
        while (newDigit100 < amount) {
            if (newDigit100 > amount) {
                break;
            }
            int newDigit50 = newDigit100;
            while (newDigit50 < amount) {
                newDigit50 += 50;
                if (newDigit50 > amount) {
                    break;
                }
                if (numberBanknotes50 < countDigit50) {
                    break;
                }
                countDigit50++;
                int newDigit20 = newDigit50;
                while (newDigit20 % 20 != 0) {
                    newDigit20 += 20;
                    if (newDigit20 > amount) {
                        break;
                    }
                    if (newDigit20 == amount) {
                        countDigit20 = (newDigit20 - newDigit50) / 20;
                        break;
                    }
                    if (numberBanknotes20 < countDigit20) {
                        break;
                    }
                }
                if (newDigit20 % 20 == 0) {
                    countDigit20 = (amount - newDigit20) / 20;
                }
                if (numberBanknotes20 < countDigit20) {
                    break;
                }
                int result = countDigit20 * 20 + countDigit50 * 50 + countDigit100 * 100;
                if (result == amount) {
                    System.out.println(countDigit20 + " 20$ " + countDigit50 + " 50$ " + countDigit100 + " 100$ ");
                    arrDigit20[count] = countDigit20;
                    arrDigit50[count] = countDigit50;
                    arrDigit100[count] = countDigit100;
                    count++;
                }
                countDigit20 = 0;
            }
            countDigit50 = 0;
            int newDigit20 = newDigit100;
            while (newDigit20 < amount) {
                if ((amount - newDigit20) % 20 == 0) {
                    countDigit20 = (amount - newDigit20) / 20;
                }
                if (numberBanknotes20 < countDigit20) {
                    break;
                }
                int result = countDigit20 * 20 + countDigit50 * 50 + countDigit100 * 100;
                if (result == amount) {
                    System.out.println(countDigit20 + " 20$ " + countDigit50 + " 50$ " + countDigit100 + " 100$ ");
                    arrDigit20[count] = countDigit20;
                    arrDigit50[count] = countDigit50;
                    arrDigit100[count] = countDigit100;
                    count++;
                }
                newDigit20 += 20;
                if (newDigit20 > amount) {
                    break;
                }
            }
            newDigit100 += 100;
            countDigit100++;
            if (numberBanknotes100 < countDigit100) {
                break;
            }
        }
    }

    public void getCash(int option) {
        for (int i = 0; i < 100; i++) {
            if (i == option - 1) {
                numberBanknotes20 -= arrDigit20[i];
                numberBanknotes50 -= arrDigit50[i];
                numberBanknotes100 -= arrDigit100[i];
            }
        }
        System.out.println("Here....You can take your money!");
    }

    public void addBanknotes20(int number) {
        this.numberBanknotes20 += number;
    }

    public void addBanknotes50(int number) {
        this.numberBanknotes50 += number;
    }

    public void addBanknotes100(int number) {
        this.numberBanknotes100 += number;
    }
}
