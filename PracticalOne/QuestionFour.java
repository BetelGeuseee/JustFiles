package PracticalOne;

//Question number 4 : Demonstration of SubClass(Inheritance)
class Boy{
    private int height,weight;

    public Boy(int height,int weight){
        this.height=height;
        this.weight=weight;
    }
    public void displayOne(){
        System.out.println("The height and weight of boy is "+height+" and "+weight+" respectively ");
    }
}
public class QuestionFour extends Boy{
    private String address;
    public QuestionFour(int height, int weight,String address) {
        super(height, weight);
        this.address=address;
    }
    public void displayTwo(){
        System.out.println("The address is "+address);
    }
    public static void main(String[] args){
        QuestionFour questionFour = new QuestionFour(6,70,"Hetauda");
        questionFour.displayOne();
        questionFour.displayTwo();
    }
}
