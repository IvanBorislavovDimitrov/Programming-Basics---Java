    import java.util.Scanner;

    public class Main {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            double a = Double.parseDouble(input.nextLine());
            double b = Double.parseDouble(input.nextLine());
            double h = Double.parseDouble(input.nextLine());
            System.out.println("Trapezoid area = " + (a + b) * h / 2);
        }
    }
