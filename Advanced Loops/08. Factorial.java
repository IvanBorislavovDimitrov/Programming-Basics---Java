import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(factorial(input.nextInt()));
    }
    public static int factorial(int n){
        if (n == 1)
            return 1;
        return n * factorial(n - 1);
    }
}
