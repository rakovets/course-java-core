package com.rakovets.course.java.core.practice.generics;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class CustomArrayList<T> {
    private T[] data;
    private int size;
    private int capacity;

    /**
     * Default constructor.
     */
    public CustomArrayList() {
        this(10);
    }

    /**
     * Constructor.
     *
     * @param capacity sets the initial capacity of the array.
     */
    @SuppressWarnings("unchecked")
    public CustomArrayList(int capacity) {
        this.capacity = capacity;
        size = 0;
        data = (T[]) new Object[capacity];
    }

    /**
     * Checks if there is enough memory reserve to store the number of elements specified in the parameter.
     * <li> If the parameter value is less than the current capacity, then nothing happens.
     * <li> If the value of the parameter is greater than the current capacity,
     * then the array is recreated, memory is allocated 1.5 times + 1 more element.
     * Existing elements should not be lost, they are transferred to the new array.
     */
    @SuppressWarnings("unchecked")
    private void ensureCapacity() {
        double multiplier = 1.5;
        int element = 1;
        int i = 0;

        if (size == capacity) {
            capacity = (int) ((capacity * multiplier) + element);
            T[] array = (T[]) new Object[capacity];
            for (T object : data) {
                array[i] = object;
                i++;
            }
            data = array;
        }
    }

    /**
     * Adding an element to the end of an array.
     *
     * @param value element to add to the end of the array.
     * @throws NullPointerException null object received.
     */
    public void pushBack(T value) throws NullPointerException {
        if (value == null) {
            throw new NullPointerException("NullPointerException.");
        }
        ensureCapacity();

        data[size] = value;
        size++;
    }

    /**
     * Removing the first element from the array.
     */
    public void popFront() {
        System.arraycopy(data, 1, data, 0, size);

        size = capacity - 1;
    }

    /**
     * Adding a new element to the beginning of the array.
     *
     * @param value new element.
     * @throws NullPointerException null object received.
     */
    @SuppressWarnings("unchecked")
    public void pushFront(T value) throws NullPointerException {
        if (value == null) {
            throw new NullPointerException("NullPointerException.");
        }
        ensureCapacity();

        T[] array = (T[]) new Object[capacity];
        array[0] = value;

        if (data.length - 1 >= 0) {
            System.arraycopy(data, 0, array, 1, data.length - 1);
        }
        data = array;
        size++;
    }

    /**
     * Inserting a new element into the array at the specified index, checking if the array is out of bounds.
     * <li> The method cannot expand the array.
     * <p>
     *
     * @param value new element to the array.
     * @param index to insert a new element.
     * @throws ArrayIndexOutOfBoundsException throws an error if the index is out of range of the array.
     * @throws NullPointerException           null object received.
     */
    public void insert(T value, int index) throws ArrayIndexOutOfBoundsException, NullPointerException {
        if (value == null) {
            throw new NullPointerException("NullPointerException.");
        }
        ensureCapacity();

        if (size - index >= 0) {
            System.arraycopy(data, index, data, index + 1, size - index);
        }
        if (index >= capacity) {
            throw new ArrayIndexOutOfBoundsException("ArrayIndexOutOfBoundsException.");
        }
        data[index] = value;
    }

    /**
     * Deleting one element at the specified index.
     *
     * @param index to remove an element.
     * @throws ArrayIndexOutOfBoundsException throws an error if we're out of array.
     */
    public void removeAt(int index) throws ArrayIndexOutOfBoundsException {
        if (index >= capacity || index < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        for (int i = index; i < capacity - 1; i++) {
            data[i] = data[i + 1];
        }
        data[capacity - 1] = null;
        size = capacity - 1;
    }

    /**
     * Removing a single element whose value matches the value of the passed parameter.
     *
     * @param value element to remove.
     * @throws NullPointerException null object received.
     */
    @SuppressWarnings("unchecked")
    public void remove(T value) throws NullPointerException {
        if (value == null) {
            throw new NullPointerException("NullPointerException.");
        }
        int index = 0;

        T[] array = (T[]) new Object[capacity];

        while (data[index] != value && index < size) {
            array[index] = data[index];
            index++;
        }
        if (index < size) {
            size--;

            int i = index;
            while (i < data.length - 1) {
                array[i] = data[i + 1];
                i++;
            }
        }
        data = array;
    }

    /**
     * Removing all elements whose values match the value of the passed parameter
     *
     * @param value element to remove.
     * @throws NullPointerException null object received.
     */
    @SuppressWarnings("unchecked")
    public void removeAll(T value) throws NullPointerException {
        if (value == null) {
            throw new NullPointerException("NullPointerException.");
        }
        T[] array = (T[]) new Object[capacity];

        int j = 0;

        for (T datum : data) {
            if (datum != value) {
                array[j] = datum;
                j++;
                size--;
            }
        }
        data = array;
    }

    /**
     * Removing the last element from the array.
     */
    @SuppressWarnings("unchecked")
    public void popBack() {
        T[] newArray = (T[]) new Object[capacity];

        if (size - 1 >= 0) {
            System.arraycopy(data, 0, newArray, 0, size - 1);
        }

        size--;
        data = newArray;
    }

    /**
     * Zeroing an array.
     * <p>All elements of the array at indexes from 0 to size - 1 are assigned the value null,
     * the size field is assigned the value 0.
     */
    public void clear() {
        for (int i = 0; i < size; i++) {
            data[i] = null;
        }
        size = 0;
    }

    /**
     * Checks an array for emptiness.
     *
     * @return true - array empty, false - array is not empty.
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * The method adjusts the value of capacity to size, naturally reducing the size of the used memory.
     */
    @SuppressWarnings("unchecked")
    public void trimToSize() {
        if (size < capacity) {
            Object[] newData = new Object[size];
            System.arraycopy(data, 0, newData, 0, size);
            data = (T[]) newData;
            capacity = size;
        }
    }

    /**
     * Linear search from left to right for the first occurrence in the array of the specified value.
     *
     * @param value element to search.
     * @return the index of the found element, and if nothing is found, returns -1.
     */
    public int indexOf(T value) {
        int index = -1;

        for (int i = 0; i < data.length; i++) {
            if (data[i] == value) {
                index = i;
                break;
            }
        }
        return index;
    }

    /**
     * Reverses the order of elements in an array.
     */
    @SuppressWarnings("unchecked")
    public void reverse() {
        T[] array = (T[]) new Object[capacity];

        for (int i = 0; i < size; i++) {
            array[i] = data[size - 1 - i];
        }
        data = array;
    }

    /**
     * Random shuffling of array elements.
     */
    public void shuffle() {
        Random random = ThreadLocalRandom.current();

        for (int i = data.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);

            T j = data[index];
            data[index] = data[i];
            data[i] = j;
        }
    }

    /**
     * Linear search from right to left for an array entry of the specified value.
     *
     * @param value element to search.
     * @return the index of the found element, and if nothing is found, returns -1.
     */
    public int lastIndexOf(T value) {
        int index = -1;

        for (int i = data.length - 1; i >= 0; i--) {
            if (data[i] == value) {
                index = i;
                break;
            }
        }
        return index;
    }

    /**
     * Returns copies of the array element at the specified index, checking for array out of bounds.
     *
     * @param element the given element.
     * @return the required element.
     */
    public T getElementAt(int element) throws IndexOutOfBoundsException {
        if (element < 0 || element > capacity) {
            throw new IndexOutOfBoundsException();
        }
        return data[element];
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CustomArrayList)) {
            return false;
        }
        CustomArrayList<?> that = (CustomArrayList<?>) o;

        return size == that.size && capacity == that.capacity && Arrays.equals(data, that.data);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(size, capacity);
        result = 31 * result + Arrays.hashCode(data);

        return result;
    }

    @Override
    public String toString() {
        return "CustomArrayList " + Arrays.toString(data);
    }

    public int getSize() {
        return size;
    }
}
