package PracticalTwo;

class Animal{
    public void sound(String animalSound){
        System.out.println("Override this method");
    }
}
class Cat extends Animal{
    @Override
    public void sound(String animalSound) {
        super.sound(animalSound);
        System.out.println(animalSound);
    }
}
public class QuestionTwo {
    public static void main(String[] args){
        Cat catOne = new Cat();
        catOne.sound("meowwwwww");
    }
}
