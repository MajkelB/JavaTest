package pl.nbp.mb.test;

import pl.nbp.mb.test.dict.OnOff;
import pl.nbp.mb.test.tests.collections.CollectionsTest;
import pl.nbp.mb.test.tests.datesTest.DatesTest;
import pl.nbp.mb.test.tests.instanceTest.InstanceTest;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class Main{

    final static Map<Class<? extends Test>, OnOff> testsMap = new HashMap<>();

    {
        testsMap.put(CollectionsTest.class, OnOff.ON);
        testsMap.put(DatesTest.class, OnOff.ON);
        testsMap.put(InstanceTest.class, OnOff.OFF);
    }

    final static boolean RUN_ALL = false; // for quickly running all tests

    @SuppressWarnings("All")
    public static void main(String[] args) {

        System.out.println( "Run tests" );
        testsMap.forEach((t, o) -> { runTest( t, o ); });
    }

    // Reflections
    private static void runTest( Class<? extends Test> clazz, OnOff switcher ) {
        System.out.println( "*************************************************************** Processing: " + clazz.getName() + " is " + switcher.name() );
        if ( RUN_ALL || switcher.isOn() ) {
            try {
                m(clazz).invoke(null);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        }
    }

    private static <T extends Test> Method m(Class<T> clazz) {
        try {
            return clazz.getMethod("run", null);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return null;
    }
}