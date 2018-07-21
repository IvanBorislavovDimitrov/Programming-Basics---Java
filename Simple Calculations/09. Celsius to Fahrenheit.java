    import java.util.Scanner;

    public class Main {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            double celsius = Double.parseDouble(input.nextLine());
            System.out.printf("%.2f\n", celsius * 1.8 + 32);
        }
    }
