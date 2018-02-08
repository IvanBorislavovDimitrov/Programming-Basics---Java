import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        int firstNum = 1;
        int secondNum = 1;
        int nNumber = 1;
        for (int i = 1; i < n; ++i){
            nNumber = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = nNumber;
        }
        System.out.println(nNumber);
    }
}
