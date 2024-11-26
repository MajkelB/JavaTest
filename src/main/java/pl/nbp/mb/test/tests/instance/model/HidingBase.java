package pl.nbp.mb.test.tests.instance.model;

public class HidingBase {

    private void doSomethingPrivate() {
        System.out.println( "Base Class Private" );
    }

    public void doSomething() {
        System.out.println( "Base Class" );
    }

}
