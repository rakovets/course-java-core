package oop.inheritance;

public class Home {
    public static void main(String[] args) {
        Person person = new Person(9);
        Cat cat = new Siamese("Murka");
        Cat cat1 =new Sphynx("Lusui");
        cat1.purr(person);
        cat1.mew(person);
//        Cat cat2 =new Persian("Iolobai");
//        cat2.mew(person);
//        cat2.purr(person);
//        System.out.println(cat.getName());
//        System.out.println(person.getHappiness());
//        cat.mew(person);
//        System.out.println(person.getHappiness());
//        cat.purr(person);
//        System.out.println(person.getHappiness());
    }
}

