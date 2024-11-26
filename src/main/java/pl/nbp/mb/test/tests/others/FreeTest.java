package pl.nbp.mb.test.tests.others;

import pl.nbp.mb.test.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FreeTest extends Test {

    @SuppressWarnings("all")
    public static void run() {
        System.out.println("------ Free test------: ");

        go();

    }

    public static void go() {
        int i = 1;
//        return;
        //i=3;


        List<Integer> ta = new ArrayList<>();
        ta.add( 1 );
        ta.add( 2 );
        ta.add( 3 );
        ta.remove( 2 );
        System.out.println( ta.toString() );
        final String game;

        game = "";
//        game = "1";

        int t;
//        System.out.println(t);
//        StringBuilder str = new StringBuilder( "alamakota");
//        System.out.println( str.substring( 2,1 ) );
        System.out.println( 81 );
//
//        String g = "alamakota";
//        System.out.println( "OOOO" + g.substring( 2,1) );
        String s = "java";
        StringBuilder bld = new StringBuilder( s );
//        if( s.equals( bld ) ) System.out.println( "equals");
//        else System.out.println( "not equals");
//
//        if( bld.equals( s ) ) System.out.println( "equals2");
//        else System.out.println( "not equals2");
        System.out.println( "Start");
        try {
            System.out.println( "Try");
            String a = null;
            a.length();
        } catch ( NullPointerException npe ) {
            System.out.println( "NullPointerException");
//            System.exit(0);
//            throw new RuntimeException();

        } finally {
            System.out.println( "Finally");
//            throw new ArithmeticException();
        }
        System.out.println( "End");

        int l = 5>7?4:9>12?2:1;
        System.out.println( l );

        int tab1[] = {1,2,3};
        int tab2[] = new int[] {1,2,3};

        System.out.println( Arrays.toString( tab1 ) );
        modTable( tab1 );
        System.out.println( Arrays.toString( tab1 ) );

        int tab3[] = null;
        System.out.println( tab3 );
        System.out.println( Arrays.toString( tab3 ) );
//        List<Integer> iList = new ArrayList<>();
//        iList.add( null );
//        for( int hh: iList ) ; // null na int -> Exception
    }

    private static void modTable( int t[] ) {
        for( int i = 0; i<t.length; i++ ) {
            t[i] = t[i] + 1;
        }
        System.out.println( Arrays.toString( t ) );
    }
}
