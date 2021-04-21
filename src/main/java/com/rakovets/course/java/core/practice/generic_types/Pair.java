package com.rakovets.course.java.core.practice.generic_types;

public class Pair<K, V> {
    private K fieldK;
    private V fieldV;

    public Pair(K fieldK, V fieldV) {
        this.fieldK = fieldK;
        this.fieldV = fieldV;
    }

    public static <K, V> Pair<V, K> swap(Pair<K, V> pair) {
        return new Pair(pair.getFieldV(),pair.getFieldK());
    }

    public Pair <V, K> getSwapped() {
        return new Pair(this.fieldV, this.fieldK);


    }



    public K getFieldK() {
        return fieldK;
    }

    public void setFieldK(K fieldK) {
        this.fieldK = fieldK;
    }

    public V getFieldV() {
        return fieldV;
    }

    public void setFieldV(V fieldV) {
        this.fieldV = fieldV;
    }
}



/*


=== Specification of task 2

Добавить методы:

* статический обобщенный `swap()`, принимающий пару и возвращать пару, где значения в паре поменяли местами
* обобщенный `getSwapped()`, который возвращает текущую пару (т.е. он не принимает значения из вне, а использует хранимые), где элементы пары поменяли местами



 */
