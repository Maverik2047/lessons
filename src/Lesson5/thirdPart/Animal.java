package Lesson5.thirdPart;

public class Animal implements Info {
    private int id;

    public Animal(int id) {
        this.id = id;

    }
    public void sleep(){
        System.out.println("I am sleeping...");
    }

    @Override
    public void showInfo() {

    }
}
