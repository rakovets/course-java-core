package com.rakovets.course.examples.module3.bits;

import com.rakovets.course.examples.module3.util.helper.BitOperationViewer;

import static com.rakovets.course.examples.module3.util.helper.Binary.printToBinary;

/*
 * Беззнаковый сдвиг вправо (знак не учитывается при сдвиге)
 */
public class Task09
{
    public static void main(String[] args)
    {
        int a = -7;
        int b = 1;
        printToBinary(a);
        System.out.println(" >>> ");
        printToBinary(b);
        System.out.println(" =");
        int i = a >>> b; // NOT
        printToBinary(i);
        System.out.println(i);
        System.out.println();
        // FIXME увеличь значение переменной b и проанализируй результат
        BitOperationViewer.main(new String[]{">>>"});
    }
}
