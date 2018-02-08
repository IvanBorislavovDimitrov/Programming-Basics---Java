import java.util.Scanner;

public class InvalidNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (!(n >= 100 && n <= 200 || n == 0)){
            System.out.println("Invalid");
        }
    }
}
