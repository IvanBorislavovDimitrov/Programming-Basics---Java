import java.util.Scanner;

public class GreaterNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOne = input.nextInt();
        int secondNumber = input.nextInt();
        if (numberOne > secondNumber)
            System.out.println(numberOne);
        else
            System.out.println(secondNumber);
    }
}
