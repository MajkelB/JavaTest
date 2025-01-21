package pl.nbp.mb.test.tests.arrays;

import pl.nbp.mb.test.Test;

import java.util.Arrays;
import java.util.List;

public class ArraysTest extends Test {

    @SuppressWarnings("all")
    public static void run() {
        System.out.println("------ Arrays test------: ");
        int tab1[] = {1, 2, 3 };
        for( int a: tab1 ) System.out.println( "a="+a);
        System.out.println( "tab1.length="+tab1.length );
        System.out.println( "tab1="+Arrays.toString( tab1 ) );

        System.out.println( "--- Array 2 List" );
        String strTab[] = { "Red", "Green", "Blue", "Yellow", "Black" };
        List<String> strList = Arrays.asList( strTab );
        System.out.println( "strTab="+Arrays.toString( strTab ) );
        System.out.println( "strList="+ strList );

        System.out.println( "Change tab 2 White" );
        strTab[0] = "White";    // a change in the table changes value in the list
        System.out.println( "strTab="+Arrays.toString( strTab ) );
        System.out.println( "strList="+ strList );

        System.out.println( "--- List 2 Array" );

        String strTab2[] = new String[0];
        strTab2 = strList.toArray( strTab2 );
        System.out.println( "strTab2="+Arrays.toString( strTab2 ) );
        System.out.println( "strList="+ strList );


        System.out.println( "Change list 2 Pink" );
        strList.set( 4, "Pink" );   // this time a new table is created and is not connected with the list
        System.out.println( "strList="+ strList );
        System.out.println( "strTab2="+Arrays.toString( strTab2 ) );

        System.out.println( "--- Sorting and searching" );
        System.out.println( "Not sorted strTab="+Arrays.toString( strTab ) );
        System.out.println( "Searching Green: "+Arrays.binarySearch( strTab, "Green" ) ); // searching while not sorted
        Arrays.sort( strTab );
        System.out.println( "Sorted strTab="+Arrays.toString( strTab ) );


        System.out.println( "Searching Green: "+Arrays.binarySearch( strTab, "Green" ) ); // searching existent
        System.out.println( "Searching Orange: "+Arrays.binarySearch( strTab, "Orange" ) ); // searching not existent

        System.out.println( "--- Copy" );
        strTab2 = Arrays.copyOfRange( strTab, 1, 4 );   // without ending position
        System.out.println( "Copy 1-3 strTab2="+Arrays.toString( strTab2 ) );

        System.out.println( "--- Fill" );
        Arrays.fill( strTab2, "Blue" );
        System.out.println( "Filled with Blue strTab2="+Arrays.toString( strTab2 ) );

        System.out.println( "--- Equals" );
        strTab2 = Arrays.copyOf( strTab, strTab.length );
        System.out.println( "strTab="+Arrays.toString( strTab ) );
        System.out.println( "strTab2="+Arrays.toString( strTab2 ) );
        System.out.println( "Equals: "+Arrays.equals( strTab, strTab2 ) ); // equals
        System.out.println( "But not the same ==: "+ (strTab == strTab2 ) ); // not ==

        strTab2[3] = "Black";
        System.out.println( "strTab="+Arrays.toString( strTab ) );
        System.out.println( "strTab2="+Arrays.toString( strTab2 ) );
        System.out.println( "(Not) Equals: "+Arrays.equals( strTab, strTab2 ) ); // not equals
        System.out.println( "Compare: "+Arrays.compare( strTab, strTab2 ) ); // compare

        int it1[] = { 1 ,3 ,5 };
        int it2[] = { 2 ,4 };

        System.out.println( "it1="+Arrays.toString( it1 ) );
        System.out.println( "it2="+Arrays.toString( it2 ) );
        it2 = it1;
        System.out.println( "it2 (po przepisaniu)="+Arrays.toString( it2 ) );


    }

}
