package com.rakovets.course.challenge.CatsHome;

public class Home {

    public static void main(String[] args) {

        Sphynx sphynx = new Sphynx("Barsik");
        Siamese siamese = new Siamese("Garfield");
        Persian persian = new Persian("Murzik");
        Person person = new Person(50);

        System.out.printf("У человека дома живут 3 кота пород siamese, sphynx и persian с именами: %s, %s и %s.\n",
                sphynx.getName(), siamese.getName(), persian.getName());
        System.out.printf("Однажды, когда уровень счастья их хозяина был равен %s, все 3 кота мяукнули издав звуки: \n",
                person.getHappiness());
        siamese.mew(person);
        System.out.println(" - первый кот;");
        sphynx.mew(person);
        System.out.println(" - второй кот;");
        persian.mew(person);
        System.out.println(" - третий кот.");
        System.out.printf("Из-за чего уровень счастья их хозяина уменьшился до %s, и он впал в депрессию.\n\n", person.getHappiness());

        Person person1 = new Person();
        person1.setHappiness(40);
        Sphynx sphynx1 = new Sphynx();
        sphynx1.setName("Snow");
        Siamese siamese1 = new Siamese();
        siamese1.setName("Matroskin");
        Persian persian1 = new Persian();
        persian1.setName("Mr. Pringls");

        System.out.printf("А на другом конце города живет человек c 3 котами тех же пород, что и у первого человека, но с именами: %s, %s и %s.\n",
                sphynx1.getName(), siamese1.getName(), persian1.getName());
        System.out.printf("И в один прекрасный день, проснувшись c уровнем счастья %s, он обнаружил на себе своих котов, каждый из которых помурчал со звуком: \n",
                person1.getHappiness());
        siamese1.purr(person1);
        System.out.println(" - первый кот;");
        sphynx1.purr(person1);
        System.out.println(" - второй кот;");
        persian1.purr(person1);
        System.out.println(" - третий кот.");
        System.out.printf("Благодаря чему он познал дзен, и уровень его счастья поднялся до %s.", person1.getHappiness());
    }
}
