package com.rakovets.course.challenge.CatSolution;

public class Home {
    public static void main(String[] args) {
        //display();     //Демонстрация воздействия котов на радость человека
        //allCats();      //Демонстрация ситуации, в которой дома несколько котов
        //depression();   //Хозяин впал в депрессию
        //greatMood();  //Хозяин познал Дзэн
    }

    static void display() {
        Person james = new Person(50);

        Cat sphynx = new Sphynx("Sphy");    //Действие сфинкса на счастье человека
        System.out.println(sphynx.getName());
        System.out.println(james.getHappiness());
        sphynx.purr(james);
        System.out.println(james.getHappiness());
        sphynx.mew(james);
        System.out.println(james.getHappiness());

        james.setHappiness(50);     //Для наглядности, сбрасываю значение до значения по умолчанию

        Cat siamese = new Siamese("Siam");  //Действие сиамского кота на счастье человека
        System.out.println(siamese.getName());
        System.out.println(james.getHappiness());
        siamese.purr(james);
        System.out.println(james.getHappiness());
        siamese.mew(james);
        System.out.println(james.getHappiness());

        james.setHappiness(50);     //Для наглядности, сбрасываю значение до значения по умолчанию

        Cat persian = new Persian("Pers");
        System.out.println(persian.getName());      //Действие персидского кота на счастье человека
        System.out.println(james.getHappiness());
        persian.purr(james);
        System.out.println(james.getHappiness());
        persian.mew(james);
        System.out.println(james.getHappiness());

        james.setHappiness(50);     //Для наглядности, сбрасываю значение до значения по умолчанию
    }

    static void allCats() {
        Person james = new Person(50);
        Cat sphynx = new Sphynx("Sphy");
        Cat siamese = new Siamese("Siam");
        Cat persian = new Persian("Pers");


        james.setHappiness(30);
        System.out.println("    Хозяин пришел с работы. Все коты пошли к двери его встречать,");
        System.out.println("a его самый скучный и грусть несущий кот(Сиамский) как всегда лежит");
        System.out.println("на старом кубическом телике и жалостно мяукает");   //Для отслеживания настроения хозяина,
                                                 // после каждого взаимодействия программма выводит количество счастья

        System.out.println("    (" + james.getHappiness() + ") Первым он гладит своего любимчика-- сфинкса. Тот довольный отвечает мурлыканием.");
        sphynx.purr(james);
        System.out.println("    (" + james.getHappiness() + ") От ревнисти, Персидский кот начинает мяукать, намекая на поглаживание.");
        persian.mew(james);
        System.out.println("    (" + james.getHappiness() + ") Хозяин начинает гладить обоих котов. Они довольны :) ");
        persian.purr(james);
        sphynx.purr(james);
        System.out.println("    (" + james.getHappiness() + ") Казалось бы, всё отлично, но самый грустный кот испортил всю малину своим гадким мяуканием.");
        siamese.mew(james);
        System.out.println("    (" + james.getHappiness() + ")");
    }

    static void depression() {
        Person james = new Person(100);
        Cat sphynx = new Sphynx("Sphy");
        Cat siamese = new Siamese("Siam");
        Cat persian = new Persian("Pers");

        while (james.getHappiness() > 0) {
            sphynx.mew(james);
            siamese.mew(james);
            persian.mew(james);
            siamese.mew(james);
        }
        System.out.println("Owner is depressed  " + james.getHappiness());
    }

    static void greatMood() {
        Person james = new Person(0);
        Cat sphynx = new Sphynx("Sphy");
        Cat siamese = new Siamese("Siam");
        Cat persian = new Persian("Pers");

        while (james.getHappiness() < 100) {
            sphynx.purr(james);
            persian.purr(james);
            sphynx.purr(james);
        }
        System.out.println("Owner is in the best mood   " + james.getHappiness());
    }
}
