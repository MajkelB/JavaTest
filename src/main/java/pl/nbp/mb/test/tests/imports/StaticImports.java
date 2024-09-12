package pl.nbp.mb.test.tests.imports;


//import static java.util.Arrays.*; // imports all static members of the class
import static java.util.Arrays.asList; // imports specific static member of the class
import java.util.List;

@SuppressWarnings("unused")
public class StaticImports {

    List<String> list = asList( "shark", "whale" );


    private static List<String> asList( String... s1 ) {        // if the class has a method with the same name it will has a preference over the imported one
        return null;
    }

}

