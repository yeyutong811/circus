package Circus;

import Circus.animal.Animal;
import Circus.animal.Bird;
import Circus.animal.Duck;
import Circus.animal.Parrot;

public class Trainer {
    public static void main(String[] args) {
        Duck d = new Duck();
        getToSpeak(d);

        Bird b = (Bird)d;  // upcasting
        getToSpeak(b);

        Animal a = (Animal)b; // upcasting
        getToSpeak(a);

        Duck d2 = (Duck) a; // downcasting ->super class obj to sub class
        train(new Duck());
        train(new Parrot());
    //    Animal a2 = new Animal();
    //    Bird b2 = new Bird();
    }

    private static void getToSpeak(Animal animal) {
        System.out.println(animal.speak());
    }

    private static void train(Bird bird) {
        if (bird instanceof Duck) {
            Duck d = (Duck) bird;
            d.swim();
        }
    }
}
