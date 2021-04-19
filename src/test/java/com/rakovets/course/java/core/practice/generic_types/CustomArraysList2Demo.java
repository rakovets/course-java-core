package com.rakovets.course.java.core.practice.generic_types;

import java.util.ArrayList;

public class CustomArraysList2Demo {
    public static void main(String[] args) {

        //   CustomArraysList2<Integer> data = new CustomArraysList2<>(Integer[].class, 10);

        //  data.pushBack(1);
        //   System.out.println("PUSH BACK   " + "Size: " + data.getSize() + "   " + "Capacity: " + data.getCapacity());
        //   data.printArray();

        CustomArrayList<Integer> al = new CustomArrayList(10);
        al.pushFront(8);
        al.pushBack(9);
        al.pushBack(10);
        al.pushFront(1);
        al.pushFront(6);
        al.pushFront(5);
        al.pushFront(1);
        al.pushFront(8);
        al.pushFront(2);
        al.pushFront(1);
        al.pushFront(1221);
        al.popFront();
        al.insert(0, 0);
        al.insert(11, 11);
        al.remove(180);
        al.remove(0);
        al.remove(11);
        al.removeAll(1);
        al.popBack();
        al.popBack();
        //  al.clear();
        System.out.println("SizeOfMassive = " + al.getSize());
        al.trimToSize();
        al.pushFront(0);
        System.out.println("indexOf = " + al.indexOf(3));
        System.out.println("indexOf = " + al.indexOf(8));
        System.out.println("indexOf = " + al.lastIndexOf(3));
        System.out.println("indexOf = " + al.lastIndexOf(8));
        al.printCustomArray();
        al.reverse();
        al.printCustomArray();
        System.out.println("SizeOfMassive = " + al.getSize());
        al.shuffle();
        al.printCustomArray();


        System.out.println(al.isEmpty());
    }
}
/*
+pushBack() - добавление элемента в конец массива. Должна быть проверка, достаточно ли памяти! Если памяти недостаточно увеличить емкость массива данных
+popFront() - удаление первого элемента из массива
+pushFront() - добавление нового элемента в начало массива
+insert() - вставка нового элемента в массив по указанному индексу, с проверкой на выход за пределы массива
+removeAt() - удаление одного элемента по указанному индексу. Должна быть проверка на допустимость индекса
+remove() - удаление одного элемента, значение которого совпадает со значением переданного параметра
++removeAll() - удаление всех элементов, значения которых совпадает со значением переданного параметра
++popBack() - удаление последнего элемента из массива
++clear() - обнуление массива – всем элементам массива по индексам от 0 до size - 1 присвоить значение null, полю size присвоить значение 0 */
