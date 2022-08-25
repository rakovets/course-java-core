package com.rakovets.course.java.core.practice.concurrent_utilities;

import java.io.IOException;

public class Consumer implements Runnable{

    @Override
    public void run() {
        Common common=new Common();
        while (true){
        try {
            common.consume();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}}
