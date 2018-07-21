import java.util.Scanner;

public class LeftAndRightSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int firstSum = 0, secondSum = 0;
        for (int i = 0; i < 2 * n; ++i){
            int number = input.nextInt();
            if (i < n){
                firstSum += number;
            }
            else {
                secondSum += number;
            }
        }
        if (firstSum == secondSum){
            System.out.printf("Yes, sum = %d\n", firstSum);
        }
        else {
            System.out.printf("No, diff = %d\n", Math.abs(firstSum - secondSum));
        }
    }
}
