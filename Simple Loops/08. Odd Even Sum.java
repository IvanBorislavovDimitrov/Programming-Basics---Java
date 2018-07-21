import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int evenSum = 0, oddSum = 0;
        for (int i = 0; i < n; ++i){
            int number = input.nextInt();
            if (i % 2 == 0){
                evenSum += number;
            }
            else {
                oddSum += number;
            }
        }
        if (evenSum == oddSum){
            System.out.printf("Yes Sum = %d\n", evenSum);
        }
        else {
            System.out.printf("No Diff = %d\n", Math.abs(evenSum - oddSum));
        }
    }
}
