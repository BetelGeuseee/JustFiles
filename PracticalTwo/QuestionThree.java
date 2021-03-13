package PracticalTwo;

class Student{
    protected String name;
    protected int roll;
    Student(String name,int roll){
        this.name=name;
        this.roll=roll;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
class Marks extends Student{
    protected  int[] marks;

    Marks(int[] marks,String name, int roll) {
        super(name, roll);
        this.marks=marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public int[] getMarks() {
        return marks;
    }
}
class Result extends Marks{
    private int total;
    Result(int[] marks, String name, int roll) {
        super(marks, name, roll);
    }
    public void computeTotal(){
        for(int i=0;i<3;i++){
            total=marks[i]+total;
        }
    }
    public void display(){
        System.out.println("The name of the student is "+name);
        System.out.println("The roll number of the student is "+roll);
        System.out.println("The total marks is "+total);
    }
}
public class QuestionThree {
    public static void main(String[] args) {
        int[] marksOfSubject = {90,85,80};
        Result result = new Result(marksOfSubject,"Ram",181338);
        result.computeTotal();
        result.display();
    }

}
