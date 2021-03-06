package PracticalOne;

//Question number 2 : Use of getter and setter

class Cube{
   private int length,breadth,height;
   public Cube(){
       this.length=0;
       this.breadth=0;
       this.height=0;
   }
   public void setLength(int len){
       this.length=len;
   }
   public void setBreadth(int bre){
       this.breadth=bre;
   }
   public void setHeight(int hei){
       this.height=hei;
   }
   public int getLength(){
       return length;
   }
   public int getBreadth(){
       return breadth;
   }
   public int getHeight(){
       return height;
   }
   public void display(){
       System.out.print("The volume of cube is "+getLength()*getBreadth()*getHeight());
   }
}
public class QuestionTwo {
    public static void main(String[] args){
        Cube cube = new Cube();
        cube.setLength(5);
        cube.setBreadth(2);
        cube.setHeight(3);
        cube.display();
    }
}