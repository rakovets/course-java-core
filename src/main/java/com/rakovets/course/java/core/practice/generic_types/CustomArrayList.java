package com.rakovets.course.java.core.practice.generic_types;

import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class CustomArrayList<T> {
    private T[] data;
    private int size;
    private int capacity;

    public CustomArrayList(Class<T[]> type, int size) {
        data = type.cast(Array.newInstance(type.getComponentType(), size));
        capacity = 10;
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }

    public void printArray() {
        System.out.println(Arrays.toString(data));
    }

    // checks if there is enough memory to store the specified number of elements
    @SuppressWarnings("unchecked")
    private void ensureCapacity() {
        Object[] newData = new Object[(capacity * 3) / 2 + 1];
        if (capacity >= 0) System.arraycopy(data, 0, newData, 0, capacity);
        data = (T[]) newData;
        capacity = (capacity * 3) / 2 + 1;
    }

    // adding an element to the end of the array
    public void pushBack(T element) {
        // increasing the capacity if there isn't enough memory
        if (size == capacity)
            ensureCapacity();
        data[size] = element;
        size++;
    }

    // removing the first element from the array
    public void popFront() {
        System.arraycopy(data, 1, data, 0, size);
    }

    // adding a new element to the beginning of the array
    public void pushFront(int index, T element) {
        // increasing the capacity if there isn't enough memory
        if (size == capacity)
            ensureCapacity();
        // shifts all elements from the 0 index to the right
        if (size - index >= 0) System.arraycopy(data, index, data, index + 1, size - index);
        // inserting a new element to the beginning of the array
        data[0] = element;
        size++;
    }

    // inserting a new element at the specified index
    public void insert(int index, T element) {
        // increasing the capacity if there isn't enough memory
        if (size == capacity)
            ensureCapacity();
        // shifts all elements from the specified index to the right
        if (size - index >= 0) System.arraycopy(data, index, data, index + 1, size - index);
        // inserting a new element at the specified index
        data[index] = element;
        size++;
    }

    // removing element at the specified index
    public void removeAt(int index) {
        if (index >= size || index < 0)
            System.out.println("Index isn't valid");
        else
            if (size - 1 - index >= 0) System.arraycopy(data, index + 1, data, index, size - 1 - index);
            size--;
    }

    // removing elements whose values match the value of the passed parameter
    public void removeAll(T element) {
        int index = 0;
        for (int i = 0; i < data.length; i++)
            if (data[i] != element)
                data[index++] = data[i];
    }

    // removing the last element from the array
    public void popBack() {
        int index = size - 1;
        System.arraycopy(data, index + 1, data, index, size - 1 - index);
        data[size - 1] = null;
        size--;
    }

    // emptying the array
    public void clear() {
        Arrays.fill(data, null);
        size = 0;
    }

    // returns true if size = 0, and false otherwise
    public boolean isEmpty() {
        return size == 0;
    }

    // adjusts the capacity value to size
    @SuppressWarnings("unchecked")
    public void trimToSize() {
        if (size < capacity) {
            Object[] newData = new Object[size];
            System.arraycopy(data, 0, newData, 0, size);
            data = (T[]) newData;
            capacity = size;
        }
    }

    // searching first occurrence in array of the specified value
    public int indexOf(T element) {
        int index = -1;
        for (int i = 0; i < data.length; i++) {
            if (element != data[i])
                continue;
            if (index == -1)
                index = i;
        }
        return index;
    }

    // searching last occurrence in array of the specified value
    public int lastIndexOf(T element) {
        int index = 0;
        for (int i = data.length - 1; i >= 0; i--) {
            if (data[i] == element) {
                index = i;
                break;
            }
        }
        return index;
    }

    // changing the order of elements in an array to the opposite
    public void reverse() {
        // swapping the first element of array with the last element, second element with second last and so on
        int i;
        T temp;
        for (i = 0; i < size / 2; i++) {
            temp = data[i];
            data[i] = data[size - i - 1];
            data[size - i - 1] = temp;
        }
    }

    // random shuffling of array elements
    public void shuffle() {
        Random random = ThreadLocalRandom.current();
        for (int i = data.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            // swapping elements
            T j = data[index];
            data[index] = data[i];
            data[i] = j;
        }
    }

    // comparing arrays
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CustomArrayList)) return false;
        CustomArrayList that = (CustomArrayList) o;
        return getSize() == that.getSize() && getCapacity() == that.getCapacity() && Arrays.equals(data, that.data);
    }

    // creates an exact copy of the CustomArrayList
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
