package pl.nbp.mb.test.tests.collections;

import pl.nbp.mb.test.Test;

import java.util.*;

public class CollectionsTest extends Test {

    @SuppressWarnings("unused")
    public static void run() {
        System.out.println( "------ ARRAY LIST ------: " );
        ArrayList<String> names = new ArrayList<>();
        addNames2List( names );
        System.out.println( "ArrayList initial: " + names );        // ordered
        Collections.sort( names );
        System.out.println( "ArrayList sorted: " + names );        // sorted
        System.out.println( "ArrayList binary search Ola: " + Collections.binarySearch( names, "Ola" ) );
        System.out.println( "ArrayList binary search Tola: " + Collections.binarySearch( names, "Tola" ) );

        System.out.println( "------ LINKED LIST ------: " );
        LinkedList<String> namesL = new LinkedList<>();
        addNames2List( namesL );
        System.out.println( "LinkedList initial: " + namesL );        // ordered

        System.out.println( "------ VECTOR ------: " );
        LinkedList<String> namesV = new LinkedList<>();
        addNames2List( namesV );
        System.out.println( "Vector initial: " + namesV );        // ordered - threadsafe

        System.out.println( "------ HASH SET ------: " );
        Set<String> namesHS = new HashSet<>();
        addNames2Set( namesHS );
        System.out.println( "HashSet initial: " + namesHS );        // random order

        System.out.println( "------ TREE SET ------: " );
        Set<String> namesTS = new TreeSet<>();
        addNames2Set( namesTS );
        System.out.println( "TreeSet initial: " + namesTS );        // ordered

        System.out.println( "------ HASH MAP ------: " );
        Map<String, Integer> namesHM = new HashMap<>();
        addNames2Map( namesHM );
        System.out.println( "HashMap initial: " + namesHM );        // random order

        System.out.println( "------ TREE MAP ------: " );
        Map<String, Integer> namesTM = new TreeMap<>();
        addNames2Map( namesTM );
        System.out.println( "TreeMap initial: " + namesTM );        // ordered and sorted

    }

    private static void addNames2List( List<String> list ) {
        if( list == null ) return;
        list.add( "Ala" );
        list.add( "Ola" );
        list.add( "Ela" );
        list.add( "Ula" );
    }

    private static void addNames2Set( Set<String> set ) {
        if( set == null ) return;
        set.add( "Ala" );
        set.add( "Ola" );
        set.add( "Ela" );
        set.add( "Ula" );
    }

    private static void addNames2Map( Map<String, Integer> map ) {
        if( map == null ) return;
        map.put( "Ala", 1 );
        map.put( "Ola", 2 );
        map.put( "Ela", 3 );
        map.put( "Ula", 4 );
        map.put( "Stefan", 5 );
        map.put( "Olaf", 6 );
        map.put( "Jon", 7 );
        map.put( "Alfred", 8 );
    }

}
