import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double inches = Double.parseDouble(input.nextLine());
        System.out.println(inches * 2.54);
    }
}
