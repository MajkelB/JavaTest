package pl.nbp.mb.test.tests.instance.model;

public class HidingSub extends HidingBase {

    public void doSomethingPrivate() {
        System.out.println( "Sub Class Private" );
    }

    public void doSomething() {
        System.out.println( "Sub Class" );
    }
}
