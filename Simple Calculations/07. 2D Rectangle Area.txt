    import java.util.Scanner;

    public class Main {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            double x1 = Double.parseDouble(input.nextLine());
            double y1 = Double.parseDouble(input.nextLine());
            double x2 = Double.parseDouble(input.nextLine());
            double y2 = Double.parseDouble(input.nextLine());
            double a = Math.abs(x2 - x1);
            double b = Math.abs(y2 - y1);
            System.out.println(a * b);
            System.out.println(2 * (a + b));
        }
    }
