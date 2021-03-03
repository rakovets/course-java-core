package com.rakovets.course.java.core.practice.io.project_computer_repair_workshop;

import java.io.Serializable;

public class Notebook extends Computer implements Serializable {
    private String brand;
    private Touchpad touchpad;
    private transient String userName;

    public Notebook(String cpu, String gpu, String resolution, Double size, String brand, Touchpad touchpad, String userName) {
        super(cpu, gpu, resolution, size);
        this.brand = brand;
        this.touchpad = touchpad;
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "cpu='" + cpu + '\'' +
                ", gpu='" + gpu + '\'' +
                ", resolution='" + resolution + '\'' +
                ", size=" + size +
                ", brand='" + brand + '\'' +
                ", touchpad=" + touchpad +
                ", userName='" + userName + '\'' +
                '}';
    }
}
