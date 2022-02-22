package Lesson5.fourthPart;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Cat cat = new Cat();
        Dog dog =new Dog();

        test(cat);
        test(animal);
        test(dog);
    }

    public static void test(Animal animal){
        animal.eat();
    }
    ////Полиморфизм
}
