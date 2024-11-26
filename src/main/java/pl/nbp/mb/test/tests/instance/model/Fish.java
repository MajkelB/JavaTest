package pl.nbp.mb.test.tests.instance.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
public class Fish extends Animal {

    public int length = 20;
    public static String color = "Silver";

    public Fish( String name, int length ) {
        super(name, Kind.COD);
        this.length = length;
    }

    public static String getColor() {
        return color;
    }

    public int getCLength() {
        return this.length;
    }

    @Override
    public void sound() {
        System.out.println( "Bul bul" );
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Fish fish = (Fish) o;
        return fish.length == this.length;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + Objects.hashCode(length);
        return result;
    }

    public boolean baseEquals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        return  super.equals(o);
    }
}
