package pl.nbp.mb.test.tests.initializations;

import pl.nbp.mb.test.Test;

public class InitializationsTest extends Test {

    int mi;
    Integer mI;
    long ml;
    Long mL;
    double md;
    Double mD;
    boolean mb;
    Boolean mB;
    String ms;

    @SuppressWarnings("all")
    public static void run() {
        System.out.println("------ Initializations test------: ");
//        int i = 1L;     // not allowed
        long j = 1;       // ok - promotion to bigger
        int a;            // not allowed - must be initialized

        InitializationsTest it = new InitializationsTest();

        System.out.println("Defaults class level");
        System.out.println("mi -> " + it.mi );
        System.out.println("mI -> " + it.mI );
        System.out.println("ml -> " + it.ml );
        System.out.println("mL -> " + it.mL );
        System.out.println("md -> " + it.md );
        System.out.println("mD -> " + it.mD );
        System.out.println("mb -> " + it.mb );
        System.out.println("mB -> " + it.mB );
        System.out.println("ms -> " + it.ms );
//        System.out.println("a -> " + a );

    }
}
