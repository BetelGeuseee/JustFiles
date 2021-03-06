package PracticalOne;

//Question number 3 : Demonstration of Method Overloading\

class MethodOverloading{
    public void area(int length,int breadth){
        System.out.println("The area of rectangle is "+length*breadth);
    }
    public void area(int length){
        System.out.println("The area of Square is "+length*length);
    }
}
public class QuestionThree {
    public static void main(String[] args){
        MethodOverloading methodOverloading = new MethodOverloading();
        methodOverloading.area(4);
        methodOverloading.area(4,3);
    }
}
