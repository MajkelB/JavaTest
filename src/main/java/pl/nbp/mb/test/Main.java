package pl.nbp.mb.test;

import pl.nbp.mb.test.tests.arrays.ArraysTest;
import pl.nbp.mb.test.dict.OnOff;
import pl.nbp.mb.test.tests.collections.CollectionsTest;
import pl.nbp.mb.test.tests.dates.DatesTest;
import pl.nbp.mb.test.tests.imports.ImportsTest;
import pl.nbp.mb.test.tests.initializations.InitializationsTest;
import pl.nbp.mb.test.tests.instance.InstanceTest;
import pl.nbp.mb.test.tests.others.FreeTest;
import pl.nbp.mb.test.tests.strings.StringsTest;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class Main{

    final static Map<Class<? extends Test>, OnOff> testsMap = new HashMap<>();

    static
    {
        testsMap.put(CollectionsTest.class, OnOff.OFF);
        testsMap.put(DatesTest.class, OnOff.OFF);
        testsMap.put(InstanceTest.class, OnOff.ON);
        testsMap.put(StringsTest.class, OnOff.OFF);
        testsMap.put(ImportsTest.class, OnOff.OFF);
        testsMap.put(InitializationsTest.class, OnOff.OFF);
        testsMap.put(ArraysTest.class, OnOff.ON);
        testsMap.put(FreeTest.class, OnOff.ON);

    }

    final static boolean RUN_ALL = false; // for quickly running all tests

    @SuppressWarnings("All")
    public static void main(String[] args) {

        System.out.println( "Run tests" );
        testsMap.forEach((t, o) -> { runTest( t, o ); });
    }

    // Reflections
    @SuppressWarnings("all")
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

    @SuppressWarnings("all")
    private static <T extends Test> Method m(Class<T> clazz) {
        try {
            return clazz.getMethod("run", null);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return null;
    }
}