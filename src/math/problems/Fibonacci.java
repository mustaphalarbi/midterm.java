package math.problems;

public class Fibonacci {
    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
         */
        int firstNumber = 0;
        int secondNumber = 1;
        int nextNumber ;

        for(int i=0; i<40; i++){
            System.out.print(firstNumber +"   ");
            nextNumber = firstNumber + secondNumber;
            firstNumber=secondNumber;
            secondNumber=nextNumber;
        }

    }
}
