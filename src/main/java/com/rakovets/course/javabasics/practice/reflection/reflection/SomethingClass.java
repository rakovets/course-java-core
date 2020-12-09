package com.rakovets.course.javabasics.practice.reflection.reflection;

import java.util.Objects;

public class SomethingClass {
    private int field1;
    private int field2;
    private int field3;

    public SomethingClass(int field1, int field2, int field3) {
        this.field1 = field1;
        this.field2 = field2;
        this.field3 = field3;
    }

    public int getField1() {
        return field1;
    }

    public void setField1(int field1) {
        this.field1 = field1;
    }

    public int getField2() {
        return field2;
    }

    public void setField2(int field2) {
        this.field2 = field2;
    }

    public int getField3() {
        return field3;
    }

    public void setField3(int field3) {
        this.field3 = field3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SomethingClass)) return false;
        SomethingClass that = (SomethingClass) o;
        return field1 == that.field1 &&
                field2 == that.field2 &&
                field3 == that.field3;
    }

    @Override
    public int hashCode() {
        return Objects.hash(field1, field2, field3);
    }

    @Override
    public String toString() {
        return "SomethingClass{" +
                "field1=" + field1 +
                ", field2='" + field2 + '\'' +
                ", field3=" + field3 +
                '}';
    }

    public void sayHello() {
        System.out.println("Hello");
    }
}
