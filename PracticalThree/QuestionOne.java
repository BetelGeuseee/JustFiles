package PracticalThree;

import java.util.Scanner;
public class QuestionOne {
    private static int firstNumber,secondNumber,answer;
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        firstNumber = scan.nextInt();
        secondNumber = scan.nextInt();

        try{
            answer=firstNumber/(firstNumber-secondNumber);
        }catch(ArithmeticException e){
            System.out.println("Infinite");
        }finally {
            System.out.println("hello world");
        }
    }
}
