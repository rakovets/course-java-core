package com.rakovets.course.java.core.practice.generic_types;

public abstract class Math {
    public static Number findMaxParameter(Number par, Number par2, Number par3) {
        int a = par.intValue();
        int b = par2.intValue();
        int c = par3.intValue();
        return java.lang.Math.max(java.lang.Math.max(a, b), c);
    }

    public static Number findMinParameter(Number p1, Number p2, Number p3, Number p4, Number p5) {
        int a1 = p1.intValue();
        int a2 = p2.intValue();
        int a3 = p3.intValue();
        int a4 = p4.intValue();
        int a5 = p5.intValue();
        return java.lang.Math.min(java.lang.Math.min(java.lang.Math.min(java.lang.Math.min(a1, a2), a3), a4), a5);
    }


}
