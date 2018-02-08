    import java.util.Scanner;

    public class Main {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            double USD = Double.parseDouble(input.nextLine());
            System.out.printf("%.2f BGN", USD * 1.79549);
        }
    }
