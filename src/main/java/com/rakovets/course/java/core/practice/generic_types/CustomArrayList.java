package com.rakovets.course.java.core.practice.generic_types;

import java.util.Arrays;

public class CustomArrayList<T> {
    private T[] data;
    private int size = 0;
    private int capacity = 10;

    public CustomArrayList(int capacity){
        data = (T[]) new Object[capacity];
        this.capacity = capacity;
    }

    public CustomArrayList(){

    }

    private void insureCapacity(){
        if (size > capacity){
            capacity = (int)(capacity * 1.5 + 1);
            T[] tempArray = (T[]) new Object[capacity];
            int i =0;
            for(T value : data){
                tempArray[i] = value;
                i++;
            }
            data = tempArray;
        }
    }

    public void pushBack(T newValue){
        size ++;
        insureCapacity();
        data[size] = newValue;
    }

    public void popFront(){
        T[] tempArray = (T[]) new Object[capacity];
        for(int i = 1; i < size; i++){
            tempArray[i - 1] = data[i];
        }
        data = tempArray;
        size--;
    }

    public void pushFront(T newValue){
        size++;
        insureCapacity();
        T[] tempArray = (T[]) new Object[capacity];
        for(int i = 0; i < size; i++){
            tempArray[i + 1] = data[i];
        }
        tempArray[0] = newValue;
        data = tempArray;
    }

    public void insert(T newValue, int index) {
        if(index < 0 || index > size){
            throw new IndexOutOfBoundsException("Use Index between 0 and " + size);
        }
        size++;
        insureCapacity();
        T[] tempArray = (T[]) new Object[capacity];
        for(int i = 0; i < index; i++){
            tempArray[i] = data[i];
        }
        tempArray[index] = newValue;
        for(int i = index + 1; i < size; i++){
            tempArray[i] = data[i];
        }
        data = tempArray;

    }

    public void removeAt(int index){
        if (index < 0 || index > size --){
            throw new IndexOutOfBoundsException("Use Index between 0 and " + size--);
        }
        T[] tempArray = (T[]) new Object[capacity];
        for(int i = 0; i < index; i++){
            tempArray[i] = data[i];
        }
        for(int i = index + 1; i < size; i++){
            tempArray[i - 1] = data[i];
        }
        data = tempArray;
        size --;
    }

    public void remove(T remoningValue){
        int i = 0;
        T[] tempArray = (T[]) new Object[capacity];
        while(data[i] != remoningValue || i < size){
            tempArray[i] = data[i];
            i++;
        }
        if(i < size){
            for(int j = i + 1; j < size; j++){
            tempArray[j - 1] = data[j];
            }
        }
        data = tempArray;
        size --;
    }

    public void removeAll(T removeValue){
        T[] tempArray = (T[]) new Object[capacity];
        int j = 0;
        for(int i = 0; i < data.length; i++){
            if(data[i] != removeValue){
                tempArray[j] = data[i];
                j++;
            }else {
                size--;
            }
        }
    }

    public void popBack() {
        T[] tempArray = (T[]) new Object[capacity];
        for (int i = 0; i < size - 1; i++) {
            tempArray[i] = data[i];
        }
        data = tempArray;
        size--;
    }

    public void clear(){
        for(int i = 0; i < size; i++){
            data[i] = null;
        }
        size = 0;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void trimToSize(){
        capacity = size;
        T[] tempArray = (T[]) new Object[capacity];
        int i = 0;
        for(T value : data){
            tempArray[i] = value;
        }
        data = tempArray;
    }



    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                Arrays.toString(data) +
                '}';
    }


}
