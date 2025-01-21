package pl.nbp.mb.test.tests.instance;

import pl.nbp.mb.test.Test;
import pl.nbp.mb.test.tests.instance.model.*;

public class InstanceTest extends Test {

    @SuppressWarnings("all")
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

        System.out.println( "Fields" );
        Fish fish1 = new Fish( "Nemo", 15 );
        Fish fish2 = new Fish( "Dory", 30 );
        Animal aFish1 = (Animal) fish1;
        Animal aFish2 = (Animal) fish2;
        System.out.println( fish1.getName() + ": " + fish1.length + " / color: " + fish1.color );
        System.out.println( fish2.getName() + ": " + fish2.length + " / color: " + fish2.color  );
        System.out.println( aFish1.getName() + ": " + aFish1.length + " / color: " + aFish1.color  );
        System.out.println( aFish2.getName() + ": " + aFish2.length + " / color: " + aFish2.color  );
        aFish1.length = 33; aFish1.color = "Brown";
        // odwolanie do pol. Sa 2 komplety w klasie bazowej i podklasie. Referencja decyduje, które pole bedzie uzyte
        System.out.println( "Animal: " + aFish1.getName() + ": " + aFish1.length + " / color: " + aFish1.color + " *** Fish: " + fish1.length + " / color: " + fish1.color   );
        // referencja przez klase bazowa przy uzyciu metody ale i tak uzywa wartosci z podklasy (getLength) dla statica to naturalne - referenc
        System.out.println( "Animal: " + aFish1.getName() + ": " + aFish1.getLength() + " / color: " + Fish.getColor() + " / color: " + Animal.getColor() );

        HidingBase hb = new HidingSub();
        hb.doSomething();

        B.check();
    }


}
