package pl.nbp.mb.test.arrays;

import pl.nbp.mb.test.Test;

import java.util.Arrays;

public class ArraysTest extends Test {

    @SuppressWarnings("all")
    public static void run() {
        System.out.println("------ Arrays test------: ");
        int tab1[] = {1, 2, 3 };
        for( int a: tab1 ) System.out.println( "a="+a);
        System.out.println( "tab1.length="+tab1.length );
        System.out.println( "tab1="+Arrays.toString( tab1 ) );



    }
}
