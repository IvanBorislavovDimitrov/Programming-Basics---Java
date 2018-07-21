import java.util.Scanner;

public class EnterEvenNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 0;
        while (true) {
            try {
                n = Integer.parseInt(input.nextLine());
                if (n % 2 == 0) {
                    System.out.printf("Even number entered %d%n", n);
                    break;
                }

                System.out.println("This is not even number.");
            }
            catch (NumberFormatException e) {
                System.out.println("Invalid number!");
            }

        }
    }
}
