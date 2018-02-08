import java.util.Scanner;

public class NumberInDiapason {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        do {
            System.out.printf("Enter a number in range [1...100]: ");
            n = input.nextInt();
            if (n <= 0 || n > 100){
                System.out.printf("Invalid number%n");
            }
        }while (n <= 0 || n > 100);
        System.out.printf("The number is: %d%n", n);
    }
}
