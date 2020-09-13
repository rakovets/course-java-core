package com.rakovets.course_java_basic.example.socket;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * InetAddress
 */
public class DemoInetAddress {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress adress = InetAddress.getLocalHost();
        System.out.println(adress);
        System.out.println(adress.getCanonicalHostName());
        System.out.println(adress.getHostName());
        System.out.println(adress.getHostAddress());
        System.out.println();

        adress = InetAddress.getByName("google.com");
        System.out.println(adress.getCanonicalHostName());
        System.out.println(adress.getHostName());
        System.out.println(adress.getHostAddress());
    }
}
