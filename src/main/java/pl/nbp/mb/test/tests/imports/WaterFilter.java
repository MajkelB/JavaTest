package pl.nbp.mb.test.tests.imports;

// 1 - OK
import pl.nbp.mb.test.tests.imports.aquarium.*;

// 2 - OK
//import pl.nbp.mb.test.tests.imports.aquarium.Water;
//import pl.nbp.mb.test.tests.imports.aquarium.jellies.*;

// 3 - OK
//import pl.nbp.mb.test.tests.imports.aquarium.*;
//import pl.nbp.mb.test.tests.imports.aquarium.jellies.Water;

// 4 - NOT OK - doesn't know what the Water is
//import pl.nbp.mb.test.tests.imports.aquarium.*;
//import pl.nbp.mb.test.tests.imports.aquarium.jellies.*;

// 5 - NOT OK - doesn't know what the Water is
//import pl.nbp.mb.test.tests.imports.aquarium.Water;
//import pl.nbp.mb.test.tests.imports.aquarium.jellies.Water;

@SuppressWarnings("unused")
public class WaterFilter {

    Water water;
}
