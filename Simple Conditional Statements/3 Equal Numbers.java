import java.util.Scanner;

/**
 * Created by Ivan on 7/15/2017.
 */
public class EquealNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double n1 = input.nextDouble();
        double n2 = input.nextDouble();
        double n3 = input.nextDouble();
        if ((n1 == n2) && (n1 == n3) && (n2 == n3))
            System.out.println("yes");
        else
            System.out.println("no");
    }
}
