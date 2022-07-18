package com.rakovets.course.java.core.practice.generics;

public class CustomArrayListDemo {
    public static void main(String[] args) {
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("Adding an element to the end of an array.");
        CustomArrayList<Integer> array = new CustomArrayList<>(2);
        System.out.println(array);
        array.pushBack(1);
        System.out.println(array);
        array.pushBack(2);
        System.out.println(array);
        array.pushBack(3);
        System.out.println(array);
        array.pushBack(4);
        System.out.println(array);
        array.pushBack(5);
        System.out.println(array);
        array.pushBack(6);
        System.out.println(array);
        array.pushBack(7);
        System.out.println(array);
        array.pushBack(8);
        System.out.println(array);
        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("Removing the first element from the array.");
        System.out.println(array);
        array.popFront();
        System.out.println(array);
        array.popFront();
        System.out.println(array);
        array.popFront();
        System.out.println(array);
        array.popFront();
        System.out.println(array);
        array.popFront();
        System.out.println(array);
        array.popFront();
        System.out.println(array);
        array.popFront();
        System.out.println(array);
        array.popFront();
        System.out.println(array);
        array.popFront();
        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("Adding a new element to the beginning of the array.");
        CustomArrayList<Byte> customArrayList = new CustomArrayList<>(2);
        System.out.println(customArrayList);
        customArrayList.pushFront((byte) 1);
        System.out.println(customArrayList);
        customArrayList.pushFront((byte) 2);
        System.out.println(customArrayList);
        customArrayList.pushFront((byte) 3);
        System.out.println(customArrayList);
        customArrayList.pushFront((byte) 4);
        System.out.println(customArrayList);
        customArrayList.pushFront((byte) 5);
        System.out.println(customArrayList);
        customArrayList.pushFront((byte) 6);
        System.out.println(customArrayList);
        customArrayList.pushFront((byte) 7);
        System.out.println(customArrayList);
        customArrayList.pushFront((byte) 8);
        System.out.println(customArrayList);
        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("Inserting an element into an array by index.");
        System.out.println(customArrayList);
        customArrayList.insert((byte) -4, 8);
        System.out.println(customArrayList);
        customArrayList.insert((byte) -5, 9);
        System.out.println(customArrayList);
        customArrayList.insert((byte) -6, 10);
        System.out.println(customArrayList);
        try {
            System.out.println("\nChecking for out of bounds array.");
            customArrayList.insert((byte) -7, 11);
            System.out.println(customArrayList);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("Remove one element at the specified index.");
        CustomArrayList<Short> shortCustomArrayList = new CustomArrayList<>(5);
        System.out.println(shortCustomArrayList);
        shortCustomArrayList.pushBack((short) 1);
        System.out.println(shortCustomArrayList);
        shortCustomArrayList.pushBack((short) 2);
        System.out.println(shortCustomArrayList);
        shortCustomArrayList.pushBack((short) 3);
        System.out.println(shortCustomArrayList);
        shortCustomArrayList.pushBack((short) 4);
        System.out.println(shortCustomArrayList);
        shortCustomArrayList.pushBack((short) 5);
        System.out.println(shortCustomArrayList);

        shortCustomArrayList.removeAt(2);
        System.out.println(shortCustomArrayList);
        shortCustomArrayList.removeAt(2);
        System.out.println(shortCustomArrayList);
        shortCustomArrayList.removeAt(2);
        System.out.println(shortCustomArrayList);
        shortCustomArrayList.removeAt(1);
        System.out.println(shortCustomArrayList);
        shortCustomArrayList.removeAt(0);
        System.out.println(shortCustomArrayList);
        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("Removing a single element whose value matches the value of the passed parameter.");
        CustomArrayList<String> stringCustomArrayList = new CustomArrayList<>(5);
        stringCustomArrayList.pushFront("Hello");
        System.out.println(stringCustomArrayList);
        stringCustomArrayList.pushFront("Hello");
        System.out.println(stringCustomArrayList);
        stringCustomArrayList.pushFront("By");
        System.out.println(stringCustomArrayList);
        stringCustomArrayList.pushFront("Hello");
        System.out.println(stringCustomArrayList);
        stringCustomArrayList.pushFront("Hello");
        System.out.println(stringCustomArrayList);
        stringCustomArrayList.pushFront("Hello");
        System.out.println(stringCustomArrayList);

        System.out.println("\nDelete one first \"Hello\".");
        stringCustomArrayList.remove("Hello");
        System.out.println(stringCustomArrayList);

        System.out.println("\nDelete all \"Hello\".");
        stringCustomArrayList.removeAll("Hello");
        System.out.println(stringCustomArrayList);

        System.out.println("\nRemoving the last element.");
        System.out.println(stringCustomArrayList);
        stringCustomArrayList.popBack();
        System.out.println(stringCustomArrayList);
        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("Filling an array of type long.");
        CustomArrayList<Long> longCustomArrayList = new CustomArrayList<>(2);
        System.out.println(longCustomArrayList);
        longCustomArrayList.pushBack(1L);
        System.out.println(longCustomArrayList);
        longCustomArrayList.pushBack(2L);
        System.out.println(longCustomArrayList);
        longCustomArrayList.pushBack(3L);
        System.out.println(longCustomArrayList);
        longCustomArrayList.pushBack(4L);
        System.out.println(longCustomArrayList);
        longCustomArrayList.pushBack(5L);
        System.out.println(longCustomArrayList);
        longCustomArrayList.pushBack(6L);
        System.out.println(longCustomArrayList);
        longCustomArrayList.pushBack(7L);
        System.out.println(longCustomArrayList);
        System.out.println("Array cleaning.");
        longCustomArrayList.clear();
        System.out.println(longCustomArrayList);
    }
}
