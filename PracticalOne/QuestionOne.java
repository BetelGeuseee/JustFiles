package PracticalOne;

//Question number 1 : Constructor Overloading
 class Rectangle{
     private int length,breadth;
     public Rectangle(){
         this.length = 0 ;
         this.breadth=0;
         System.out.println("Initial area of rectangle is "+length*breadth);
     }
     public Rectangle(int len,int bre){
         this.length=len;
         this.breadth=bre;
     }
     public void display(){
         System.out.print("The area of rectangle is "+length*breadth);
     }
}
public class QuestionOne {
    public static void main(String[] args){
       Rectangle rectOne = new Rectangle();
       Rectangle rectTwo = new Rectangle(5,10);
       rectTwo.display();
    }
}
