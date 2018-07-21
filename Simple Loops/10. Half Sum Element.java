import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int maxElement = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < n; ++i){
            int number = input.nextInt();
            if (maxElement < number)
                maxElement = number;
            sum += number;
        }
        sum -= maxElement;
        if (maxElement == sum){
            System.out.printf("Yes Sum = %d\n", sum);
        }
        else {
            System.out.printf("No Diff = %d\n", Math.abs(maxElement - sum));
        }
    }
}
