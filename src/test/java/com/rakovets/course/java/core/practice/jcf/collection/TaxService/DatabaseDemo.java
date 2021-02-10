package com.rakovets.course.java.core.practice.jcf.collection.TaxService;

        import java.util.Map;
        import java.util.TreeMap;

public class DatabaseDemo {
    public static void main(String[] args) {

        TreeMap<Integer, Person> database = new TreeMap<>();

        database.put(1, new Person("Ivanov O.S.", "Nonpayment", "Minsk"));
        database.put(2, new Person("Below K.D.", "Violation of terms", "Minsk"));
        database.put(3, new Person("Drano H.L.", "Violation of terms", "Brest"));
        database.put(4, new Person("Baker A.P.", "Nonpayment", "Minsk"));
        database.put(5, new Person("Romanov P.K.", "Nonpayment", "Brest"));
        database.put(6, new Person("Dolphin T.O.", "Violation of terms", "Brest"));
        database.put(7, new Person("Krona G.T.", "Nonpayment", "Minsk"));

        System.out.println("\nPrint database\n");
        for (Map.Entry<Integer, Person> entry : database.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println("\nPrint data of a specific code\n");
        for (Map.Entry<Integer, Person> entry : database.entrySet()) {
            Integer key = entry.getKey();
            if (key.equals(1))
                System.out.println(key + " " + entry.getValue());
        }

        System.out.println("\nPrint data of a specific penalty type\n");
        for (Map.Entry<Integer, Person> entry : database.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue().getPenaltyType();
            if (value.equals("Nonpayment"))
                System.out.println(key + " " + entry.getValue());
        }

        System.out.println("\nPrint data of a specific city\n");
        for (Map.Entry<Integer, Person> entry : database.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue().getCity();
            if (value.equals("Minsk"))
                System.out.println(key + " " + entry.getValue());
        }

        System.out.println("\nPrint data about new person\n");
        System.out.println(database.lastEntry());

        System.out.println("\nRemoving data\n");
        database.remove(5);
        for (Map.Entry<Integer, Person> entry : database.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println("\nReplacing data\n");
        database.replace(2, new Person("Below K.D.", "Violation of terms", "Mogilev"));
        for (Map.Entry<Integer, Person> entry : database.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
