package org.logical.java8;

import java.util.Arrays;
import java.util.stream.Stream;

public class PrintFabonanci {
    public static void main(String[] args) {
        Stream.iterate(new int[]{0,1}, f->new int[]{f[1],f[0]+f[1]}).limit(10).map(f->f[0]).forEach(i->System.out.print(i+" "));
        System.out.println();

        Object[] objects = Stream.iterate(new int[]{0, 1}, f -> new int[]{f[1], f[0] + f[1]}).limit(10).map(f -> f[0]).toArray();
        System.out.println(Arrays.toString(objects));


    }
}
