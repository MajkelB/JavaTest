package pl.nbp.mb.test.tests.instanceTest.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
public class Animal {

    private String name;
    private Kind kind;

    public void sound() { }

    public Animal(String name) {
        this.name = name;
        this.kind = Kind.UNKNOWN;
    }

    public Animal(String name, Kind kind) {
        this.name = name;
        this.kind = kind;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Animal animal = (Animal) o;
        return Objects.equals(name, animal.name) && kind == animal.kind;
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(name);
        result = 31 * result + Objects.hashCode(kind);
        return result;
    }
}
