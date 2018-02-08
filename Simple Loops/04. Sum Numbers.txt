import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int number;
        int sum = 0;
        for (int i = 0; i < n; ++i){
            number = input.nextInt();
            sum += number;
        }
        System.out.println(sum);
    }
}
