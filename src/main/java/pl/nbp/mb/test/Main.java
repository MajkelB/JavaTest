package pl.nbp.mb.test;

import pl.nbp.mb.test.datesTest.DatesTest;
import pl.nbp.mb.test.instanceTest.InstanceTest;

public class Main {
    public static void main(String[] args) {

//        final String test2Run = "Inheritance";
        final String test2Run = "Dates";

        switch ( test2Run ) {

            case "Inheritance":         System.out.println("Instance test" );
                                        InstanceTest.run();
                                        break;

            case "Dates":               System.out.println("Dates test" );
                                        DatesTest.run();
                                        break;

            default:                    System.out.println("Wrong test" );
        }





    }
}