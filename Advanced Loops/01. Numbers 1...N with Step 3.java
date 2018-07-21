import java.util.Scanner;

public class From1ToNWithStep3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        for (int i = 1; i <= n; i += 3){
            System.out.printf("%d%n", i);
        }
    }
}
