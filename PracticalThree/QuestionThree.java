package PracticalThree;

import PracticalOne.QuestionFour;

import java.util.Scanner;
class NegativeNumberException extends Exception{
    private int negativeNumber;
    NegativeNumberException(int negativeNumber){
       this.negativeNumber=negativeNumber;
    }
}

public class QuestionThree {
    private int firstNumber,secondNumber,answer;
    private Scanner scan;
    public void calculation() throws NegativeNumberException{
        scan = new Scanner(System.in);
        firstNumber=scan.nextInt();
        secondNumber=scan.nextInt();
        answer=firstNumber-secondNumber;
        if(answer<0)
            throw new NegativeNumberException(answer);
        else
            System.out.println(answer);

    }
    public static void main(String[] args){
        QuestionThree object = new QuestionThree();
        try {
            object.calculation();
        }catch(NegativeNumberException e){
            System.out.println("Negative number Exception");
        }
    }
}
