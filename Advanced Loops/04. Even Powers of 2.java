import java.util.Scanner;

public class EvenPowersOfTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int power = 1;
        for (int i = 0; i <= n; ++i) {
            if (i % 2 == 0) {
                System.out.printf("%d%n", power);
            }
            power *= 2;
        }
    }
}
