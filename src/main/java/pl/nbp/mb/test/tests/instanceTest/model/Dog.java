package pl.nbp.mb.test.tests.instanceTest.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
public class Dog extends Animal {

    private DogRace race;

    public Dog(String name, DogRace race) {
        super(name, Kind.DOG);
        this.race = race;
    }

    @Override
    public void sound() {
        System.out.println( "Bark" );
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Dog dog = (Dog) o;
        return race == dog.race;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + Objects.hashCode(race);
        return result;
    }

    public boolean baseEquals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        return  super.equals(o);

    }
}
