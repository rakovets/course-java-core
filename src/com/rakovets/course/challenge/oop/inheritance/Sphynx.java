package com.rakovets.course.challenge.oop.inheritance;

class Sphynx extends Cat {
    private String catBreed;

    public Sphynx(String name, String catBreed) {
        super(name);
        this.catBreed = catBreed;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.printf("%s's breed is Sphynx \n", getName());
    }

    @Override
    public void purr() {
        System.out.print("Sphynx: ");
        super.purr();
    }

    @Override
    public void mew() {
        System.out.print("Sphynx: ");
        super.mew();
    }
}
