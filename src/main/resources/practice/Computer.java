package com.rakovets.course.java.core.practice.io.project_computer_repair_workshop;

public class Computer {
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
}
