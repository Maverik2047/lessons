package Lesson5;

public class Cat extends Animal{
    int liveCount;



    public Cat(String name,int age) {
        super(name,age);
    }

    public int getLiveCount(){
        return liveCount;
    }
    public void setLiveCount(int liveCount){
        this.liveCount=liveCount;
    }

    @Override
    public void makeSound() {
        System.out.println("Gaw");
    }
}
