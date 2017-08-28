import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("\n****\nI'm done!!!\n****\n");
    }

    public static int divideInts (int a, int b) {
        try {
            return a/b;
        } catch(ArithmeticException ex) {
            System.out.println("Cannot divide by 0");
        }
        return Integer.parseInt(null);
    }

    public static int getSafeInt () {
        try {
            return Integer.parseInt(new Scanner(System.in).nextLine());
        } catch(InputMismatchException exception){
            System.out.println("You didn't enter a number, try again.");
            getSafeInt();
        }
        return Integer.parseInt(null);
    }

    public static int sumOfNumbers (int[] numbers, int length) {
        try{
            int total = 0;
            for (int num : numbers) {
                total += num;
            }
            return total;

            if(numbers.length != length){
                throw new incorrectLength();
            }
        } catch(incorrectLength ex){
            System.out.println("You didn't enter enough numbers");
        }
        return Integer.parseInt(null);

    }

    class incorrectLength extends Exception{

    }
}
