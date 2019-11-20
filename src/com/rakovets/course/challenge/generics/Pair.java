package com.rakovets.course.challenge.generics;

class Pair<T, K> {
    private T male;
    private K female;

    public Pair(T male, K female) {
        this.male = male;
        this.female = female;
    }

    public T getMale() {
        return male;
    }

    public void setMale(T male) {
        this.male = male;
    }

    public K getFemale() {
        return female;
    }

    public void setFemale(K female) {
        this.female = female;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "male=" + male +
                ", female=" + female +
                '}';
    }

    public static void main(String[] args) {
        Pair<String, String> acount1 = new Pair<>("male", "female");
        String name = acount1.getFemale();
        String name1 = acount1.getMale();
        System.out.println("The gender of first person is : " + name + "\n" + "The second gender is:  " + name1);
    }
}
