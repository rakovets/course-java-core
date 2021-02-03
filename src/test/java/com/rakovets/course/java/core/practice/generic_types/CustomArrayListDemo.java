package com.rakovets.course.java.core.practice.generic_types;

class CustomArrayListDemo {
    public static void main(String[] args){

        CustomArrayList<Integer> data = new CustomArrayList<>(Integer[].class, 10);

        data.pushBack(1);
        System.out.println("PUSH BACK   " + "Size: " + data.getSize() + "   " + "Capacity: " + data.getCapacity());
        data.printArray();

        data.pushBack(2);
        System.out.println("PUSH BACK   " + "Size: " + data.getSize() + "   " + "Capacity: " + data.getCapacity());
        data.printArray();

        data.pushBack(3);
        System.out.println("PUSH BACK   " + "Size: " + data.getSize() + "   " + "Capacity: " + data.getCapacity());
        data.printArray();

        data.popFront();
        System.out.println("POP FRONT   " + "Size: " + data.getSize() + "   " + "Capacity: " + data.getCapacity());
        data.printArray();

        data.pushFront(0, 5);
        System.out.println("PUSH FRONT   " + "Size: " + data.getSize() + "   " + "Capacity: " + data.getCapacity());
        data.printArray();

        data.insert(2,4);
        System.out.println("INSERT   " + "Size: " + data.getSize() + "   " + "Capacity: " + data.getCapacity());
        data.printArray();

        data.removeAt(2);
        System.out.println("REMOVE AT   " + "Size: " + data.getSize() + "   " + "Capacity: " + data.getCapacity());
        data.printArray();

        data.pushBack(3);
        System.out.println("PUSH BACK   " + "Size: " + data.getSize() + "   " + "Capacity: " + data.getCapacity());
        data.printArray();

        data.pushBack(3);
        System.out.println("PUSH BACK   " + "Size: " + data.getSize() + "   " + "Capacity: " + data.getCapacity());
        data.printArray();

        data.removeAll(3);
        System.out.println("REMOVE ALL   " + "Size: " + data.getSize() + "   " + "Capacity: " + data.getCapacity());
        data.printArray();

        data.pushBack(4);
        System.out.println("PUSH BACK   " + "Size: " + data.getSize() + "   " + "Capacity: " + data.getCapacity());
        data.printArray();

        data.pushBack(5);
        System.out.println("PUSH BACK   " + "Size: " + data.getSize() + "   " + "Capacity: " + data.getCapacity());
        data.printArray();

        data.pushBack(6);
        System.out.println("PUSH BACK   " + "Size: " + data.getSize() + "   " + "Capacity: " + data.getCapacity());
        data.printArray();

        data.pushBack(7);
        System.out.println("PUSH BACK   " + "Size: " + data.getSize() + "   " + "Capacity: " + data.getCapacity());
        data.printArray();

        data.pushBack(8);
        System.out.println("PUSH BACK   " + "Size: " + data.getSize() + "   " + "Capacity: " + data.getCapacity());
        data.printArray();

        data.popBack();
        System.out.println("POP BACK   " + "Size: " + data.getSize() + "   " + "Capacity: " + data.getCapacity());
        data.printArray();

        data.clear();
        System.out.println("CLEAR   " + "Size: " + data.getSize() + "   " + "Capacity: " + data.getCapacity());
        data.printArray();

        data.isEmpty();
        System.out.println("IS EMPTY");
        System.out.println(data.getSize() == 0);

        data.pushBack(1);
        System.out.println("PUSH BACK   " + "Size: " + data.getSize() + "   " + "Capacity: " + data.getCapacity());
        data.printArray();

        data.isEmpty();
        System.out.println("IS EMPTY");
        System.out.println(data.getSize() == 0);

        data.trimToSize();
        System.out.println("TRIM TO SIZE   " + "Size: " + data.getSize() + "   " + "Capacity: " + data.getCapacity());
        data.printArray();

        data.pushBack(2);
        System.out.println("PUSH BACK   " + "Size: " + data.getSize() + "   " + "Capacity: " + data.getCapacity());
        data.printArray();

        data.pushBack(3);
        System.out.println("PUSH BACK   " + "Size: " + data.getSize() + "   " + "Capacity: " + data.getCapacity());
        data.printArray();

        data.pushBack(2);
        System.out.println("PUSH BACK   " + "Size: " + data.getSize() + "   " + "Capacity: " + data.getCapacity());
        data.printArray();

        data.indexOf(2);
        System.out.println("INDEX OF");
        System.out.println(data.indexOf(2));
        data.printArray();

        data.lastIndexOf(2);
        System.out.println("LAST INDEX OF");
        System.out.println(data.lastIndexOf(2));
        data.printArray();

        data.pushBack(5);
        System.out.println("PUSH BACK   " + "Size: " + data.getSize() + "   " + "Capacity: " + data.getCapacity());
        data.printArray();

        data.pushBack(10);
        System.out.println("PUSH BACK   " + "Size: " + data.getSize() + "   " + "Capacity: " + data.getCapacity());
        data.printArray();

        data.reverse();
        System.out.println("REVERSE   " + "Size: " + data.getSize() + "   " + "Capacity: " + data.getCapacity());
        data.printArray();

        data.shuffle();
        System.out.println("SHUFFLE   " + "Size: " + data.getSize() + "   " + "Capacity: " + data.getCapacity());
        data.printArray();
    }
}
