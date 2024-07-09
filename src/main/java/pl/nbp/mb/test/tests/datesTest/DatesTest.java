package pl.nbp.mb.test.tests.datesTest;

import pl.nbp.mb.test.Test;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

/* https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html */

public class DatesTest extends Test {

    public static void run() {
        LocalDate d1 = LocalDate.of( 2024, 9, 23 );
        LocalTime t1 = LocalTime.of( 11, 7, 33, 333 );
        LocalDateTime dt1 = LocalDateTime.of( 2024, 9, 23, 11, 7, 33, 333  );
        ZonedDateTime zdt1 = ZonedDateTime.of( 2024, 9, 23, 11, 7, 33, 333, ZoneId.of("Europe/Warsaw"));

        DateTimeFormatter fShort = DateTimeFormatter.ofLocalizedDate( FormatStyle.SHORT );  // ( DateTimeFormatter.ISO_LOCAL_DATE );
        DateTimeFormatter fMedium = DateTimeFormatter.ofLocalizedDate( FormatStyle.MEDIUM );  // ( DateTimeFormatter.ISO_LOCAL_DATE );
        DateTimeFormatter fLong = DateTimeFormatter.ofLocalizedDate( FormatStyle.LONG );  // ( DateTimeFormatter.ISO_LOCAL_DATE );
        DateTimeFormatter fFull = DateTimeFormatter.ofLocalizedDate( FormatStyle.FULL );  // ( DateTimeFormatter.ISO_LOCAL_DATE );

        DateTimeFormatter fTimeShort = DateTimeFormatter.ofLocalizedTime( FormatStyle.SHORT );
        DateTimeFormatter fTimeMedium = DateTimeFormatter.ofLocalizedTime( FormatStyle.MEDIUM );
//        DateTimeFormatter fTimeLong = DateTimeFormatter.ofLocalizedTime( FormatStyle.LONG );
//        DateTimeFormatter fTimeFull = DateTimeFormatter.ofLocalizedTime( FormatStyle.FULL );

        DateTimeFormatter fDateTimeShort = DateTimeFormatter.ofLocalizedDateTime( FormatStyle.SHORT );
        DateTimeFormatter fDateTimeMedium = DateTimeFormatter.ofLocalizedDateTime( FormatStyle.MEDIUM );
        DateTimeFormatter fDateTimeLong = DateTimeFormatter.ofLocalizedDateTime( FormatStyle.LONG );
        DateTimeFormatter fDateTimeFull = DateTimeFormatter.ofLocalizedDateTime( FormatStyle.FULL );



        System.out.println( "------ DATE ------: " );
        System.out.println( "SHORT: " + fShort.format( d1 ) );     // ==         System.out.println( "SHORT2: " + d1.format( fShort ) );
        System.out.println( "MEDIUM: " + fMedium.format( d1 ) );
        System.out.println( "LONG: " + fLong.format( d1 ) );
        System.out.println( "FULL: " + fFull.format( d1 ) );

        System.out.println( "------ TIME ------: " );
        System.out.println( "SHORT: " + fTimeShort.format( t1 ) );
        System.out.println( "MEDIUM: " + fTimeMedium.format( t1 ) );
//        System.out.println( "LONG: " + fTimeLong.format( t1 ) );
//        System.out.println( "FULL: " + fTimeFull.format( t1 ) );


        System.out.println( "------ DATETIME ------: " );
        System.out.println( "SHORT: " + fDateTimeShort.format( dt1 ) );
        System.out.println( "MEDIUM: " + fDateTimeMedium.format( dt1 ) );
//        System.out.println( "LONG: " + fDateTimeLong.format( dt1 ) );
//        System.out.println( "FULL: " + fDateTimeFull.format( dt1 ) );


        System.out.println( "------ ZONEDATETIME ------: " );
        System.out.println( "SHORT: " + fDateTimeShort.format( zdt1 ) );
        System.out.println( "MEDIUM: " + fDateTimeMedium.format( zdt1 ) );
        System.out.println( "LONG: " + fDateTimeLong.format( zdt1 ) );
        System.out.println( "FULL: " + fDateTimeFull.format( zdt1 ) );

        System.out.println( "------ ISO ------: " );
        System.out.println( "ISO_LOCAL_DATE: " + dt1.format(DateTimeFormatter.ISO_LOCAL_DATE) );
        System.out.println( "ISO_LOCAL_TIME: " + dt1.format(DateTimeFormatter.ISO_LOCAL_TIME) );
        System.out.println( "ISO_LOCAL_DATE_TIME: " + dt1.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME) );

        System.out.println( "------ CUSTOM PATTERN ------: " );
        DateTimeFormatter cf1 = DateTimeFormatter.ofPattern( "yyyy-MM-dd HH:mm:ss.SSS", Locale.US );
        DateTimeFormatter cf2 = DateTimeFormatter.ofPattern( "yy-MMM-dd EEE HH:m:ss.SSS", Locale.US );
        DateTimeFormatter cf3 = DateTimeFormatter.ofPattern( "yyyy-MMMM-dd EEEE HH:mm:ss.SSS", Locale.US );
        System.out.println( "Custom pattern1: " + dt1.format( cf1 ) );
        System.out.println( "Custom pattern2: " + dt1.format( cf2 ) );
        System.out.println( "Custom pattern3: " + dt1.format( cf3 ) );


    }
}
