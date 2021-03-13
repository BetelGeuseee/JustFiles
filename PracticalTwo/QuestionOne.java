package PracticalTwo;

class Dog{
    private int weight;
    private String name;
    Dog(String name,int weight){
        this.weight=weight;
        this.name=name;
    }
    public void display(){
        System.out.println("The name of the dog is "+name);
        System.out.println("The weight of the dog is "+weight);
    }
}
public class QuestionOne {
    public static void main(String[] args){
         Dog[] dogObject = new Dog[3];
         dogObject[0] = new Dog("Pratish",33);
        dogObject[1] = new Dog("Ranjit",32);
        dogObject[2] = new Dog("Swarup",30);
        for(int i=0;i<3;i++){
            dogObject[i].display();
        }
    }
}
