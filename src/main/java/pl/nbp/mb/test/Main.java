package pl.nbp.mb.test;

import pl.nbp.mb.test.collections.CollectionsTest;
import pl.nbp.mb.test.datesTest.DatesTest;
import pl.nbp.mb.test.instanceTest.InstanceTest;

public class Main {

    @SuppressWarnings( "All" )
    public static void main(String[] args) {

//        final String test2Run = "Inheritance";
//        final String test2Run = "Dates";
        final String test2Run = "Collections";

        switch ( test2Run ) {

            case "Inheritance":         System.out.println("Instance test" );
                                        InstanceTest.run();
                                        break;

            case "Dates":               System.out.println("Dates test" );
                                        DatesTest.run();
                                        break;

            case "Collections":         System.out.println("Collections test" );
                                        CollectionsTest.run();
                                        break;

            default:                    System.out.println("Wrong test" );
        }





    }
}