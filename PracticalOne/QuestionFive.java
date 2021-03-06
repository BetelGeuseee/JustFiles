package PracticalOne;

//Question number 5 : Demonstration of Inner class

class OuterClass{

    private class InnerClass{
        public void displayOfInner(){
            System.out.print("Inside the inner class");
        }
    }
    public void display(){
        InnerClass inner = new InnerClass();
        inner.displayOfInner();
    }
}
public class QuestionFive {
    public static void main(String[] args){
      OuterClass outerClass = new OuterClass();
      outerClass.display();
    }
}
