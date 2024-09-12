package pl.nbp.mb.test.tests.strings;

import pl.nbp.mb.test.Test;

public class StringsTest extends Test {

    public static void run() {
        System.out.println("------ Strings test------: ");
        String s1 = "Rock&Roll2024";
        String s2 = "Rock" + "&" + "Roll" + 2024;
        String s3 = "Rock";
        s3 += "&Roll2024";
        String s4 = new String(s1);
        String s5 = s2;
        System.out.println("s1 == s2 -> " + (s1 == s2) );
        System.out.println("s1 == s3 -> " + (s1 == s3) );
        System.out.println("s1 == s4 -> " + (s1 == s4) );
        System.out.println("s1 == s5 -> " + (s1 == s5) );
        System.out.println("s1 equals s2 -> " + (s1.equals(s2)) );
        System.out.println("s1 equals s3 -> " + (s1.equals(s3)) );
        System.out.println("s1 equals s4 -> " + (s1.equals(s4)) );
        System.out.println("s1 equals s5 -> " + (s1.equals(s5)) );
    }
}
