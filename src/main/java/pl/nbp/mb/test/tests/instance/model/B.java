package pl.nbp.mb.test.tests.instance.model;

public class B extends A {


    public static void check() {
        A a = new B();

        System.out.println( "I1 = " + a.i1 );
        System.out.println( "I2 = " + a.i2 );
        System.out.println( "I3 = " + a.i3 );
//        System.out.println( "I4 = " + a.i4 );
    }
}
