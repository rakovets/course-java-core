package com.rakovets.course.java.core.practice.io.project_computer_repair_workshop;

import java.io.Serializable;

public class Computer implements Serializable {
    public String cpu;
    public String gpu;
    public String resolution;
    public Double size;

    public Computer(String cpu, String gpu, String resolution, Double size) {
        this.cpu = cpu;
        this.gpu = gpu;
        this.resolution = resolution;
        this.size = size;
    }

    public String getCpu() {
        return cpu;
    }

    public String getGpu() {
        return gpu;
    }

    public String getResolution() {
        return resolution;
    }

    public Double getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", gpu='" + gpu + '\'' +
                ", resolution='" + resolution + '\'' +
                ", size=" + size +
                '}';
    }
}
