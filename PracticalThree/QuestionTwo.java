package PracticalThree;

import java.util.Scanner;
class InsufficientBalanceException extends Exception{
    private int amountDetail;
    InsufficientBalanceException(int amountDetail){
        this.amountDetail=amountDetail;
    }
}
class AccountInfo{
    private int totalAmount;
    public void deposit(int amount){
        totalAmount=totalAmount+amount;
    }
    public void withdraw(int withdrawalAmount) throws InsufficientBalanceException{

            if(withdrawalAmount>totalAmount)
                throw new InsufficientBalanceException(withdrawalAmount);
            else
                totalAmount=totalAmount-withdrawalAmount;

    }
    public void display(){
        System.out.println("The total amount in the account is "+totalAmount);
    }
}
public class QuestionTwo {
    public static void main(String[] args){
          AccountInfo accountInfo = new AccountInfo();
          accountInfo.deposit(5000);
          try {
              accountInfo.withdraw(3000);
          }catch(InsufficientBalanceException e){
              System.out.println("Insufficient balance...Please Deposit Amount");
          }
          accountInfo.display();

    }
}
