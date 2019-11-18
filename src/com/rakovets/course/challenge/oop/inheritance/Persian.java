package com.rakovets.course.challenge.oop.inheritance;

class Persian extends Cat {
    private String catBreed;

    public Persian(String name, String catBreed) {
        super(name);
        this.catBreed = catBreed;
    }

    @Override
    public void mew() {
        System.out.print("Persian: ");
        super.mew();
    }

    @Override
    public void mew(Person person) {
        System.out.print("Persian: ");
        super.mew();
        person.takeHappiness(-7);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.printf("%s's breed is Persian \n", getName());
    }

    @Override
    public void purr() {
        System.out.print("Persian: ");
        super.purr();
    }

    @Override
    public void purr(Person person) {
        System.out.print("Persian: ");
        super.purr();
        person.takeHappiness(7);
    }

}
