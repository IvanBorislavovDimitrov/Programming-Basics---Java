    import java.util.Scanner;

    public class Main {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            double radians = Double.parseDouble(input.nextLine());
            double result = 180 / Math.PI;
            System.out.println((int)(result * radians));
        }
    }
