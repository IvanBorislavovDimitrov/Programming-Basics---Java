import java.util.Scanner;

public class TwoKPlusOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 1; i <= n; i = 2 * i + 1){
            System.out.printf("%d%n", i);
        }
    }
}
