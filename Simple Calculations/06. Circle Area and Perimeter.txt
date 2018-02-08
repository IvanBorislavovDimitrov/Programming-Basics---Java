    import java.util.Scanner;

    public class Main {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            double r = Double.parseDouble(input.nextLine());
            System.out.println("Area = " + Math.PI * r * r);
            System.out.println("Perimeter = " + Math.PI * 2 * r);
        }
    }
