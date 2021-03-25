package PracticalThree;

class NumberNotInRangeException extends Exception{
    private int votersAge;
    NumberNotInRangeException(int votersAge){
        this.votersAge=votersAge;
    }
}
class VotingMachine{
    private int voteCount;
    private final int votersAge=18;
    public void vote(int age) throws NumberNotInRangeException{
        if(age<votersAge)
            throw new NumberNotInRangeException(age);
        else
            voteCount++;
    }
    public void display(){
        System.out.println("Vote Count : "+voteCount);
    }
}
public class QuestionFour {
    public static void main(String[] args){
        VotingMachine votevote = new VotingMachine();
        try {
            votevote.vote(15);
        }catch(NumberNotInRangeException e){
            System.out.print("Number not in range");
        }
    }
}
