    import java.util.Scanner;

    public class Main {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            double c = Double.parseDouble(input.nextLine());
            double h = Double.parseDouble(input.nextLine());
            System.out.printf("Triangle area = %.2f\n", c * h / 2);
        }
    }
