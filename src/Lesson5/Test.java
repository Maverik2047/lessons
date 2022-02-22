package Lesson5;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat("d",44);
        Dog dog = new Dog("re",44);
        cat.eat();
        dog.eat();
        Animal animal = new Animal("dsds",455);

        Mountain everest = new Mountain("Everest",8000);
        Mountain elbrus = new Mountain("Elbrus",8000);


        System.out.println(everest.equals(elbrus));

        animal.makeSound();
        cat.makeSound();
        dog.makeSound();





    }

}
