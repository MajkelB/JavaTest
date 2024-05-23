package pl.nbp.mb.test.instanceTest.model;

public class Cat extends Animal {

    private int whiskers;

    public Cat(String name, int whiskers) {
        super(name, Kind.CAT);
        this.whiskers = whiskers;
    }

    @Override
    public void sound() {
        System.out.println( "Meow" );
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Cat cat = (Cat) o;
        return whiskers == cat.whiskers;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + whiskers;
        return result;
    }
}
