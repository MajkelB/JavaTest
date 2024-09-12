package pl.nbp.mb.test.tests.instance;

import pl.nbp.mb.test.Test;
import pl.nbp.mb.test.tests.instance.model.Cat;
import pl.nbp.mb.test.tests.instance.model.Dog;
import pl.nbp.mb.test.tests.instance.model.Animal;
import pl.nbp.mb.test.tests.instance.model.DogRace;

public class InstanceTest extends Test {

    public static void run() {

        Cat cat = new Cat( "Mruczek", 8 );
        Animal animal = new Animal( "To" );

        System.out.println( "Is cat instance of Cat: " + (cat instanceof Cat) );
        System.out.println( "Is cat instance of Animal: " + (cat instanceof Animal) );
        System.out.println( "Is animal instance of Cat: " + (animal instanceof Cat ) );
        System.out.println( "Is animal instance of Animal: " + (animal instanceof Animal) );

        Dog dog1 = new Dog( "Reksio", DogRace.HUSKY );
        Dog dog2 = new Dog( "Reksio", DogRace.WOLF );
        Animal aDog1 = (Animal) dog1;
        Animal aDog2 = (Animal) dog2;

        System.out.println( "Dog1 equals Dog2: " + dog1.equals( dog2 ) );
        System.out.println( "Animal Dog1 equals Animal Dog2: " + aDog1.equals( aDog2 ) ); // wola i tak metode z klasy pochodnej mimo referencji z klasy bazowej
        System.out.println( "Dog1 baseEquals Dog2: " + dog1.baseEquals( dog2 ) ); // trzeba specjalna metode zrobic, zeby porownac obiekty klas bazowych

    }


}
