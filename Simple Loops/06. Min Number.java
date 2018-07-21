import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int number;
        int maxNumber = Integer.MAX_VALUE;
        for (int i = 0; i < n; ++i){
            number = input.nextInt();
            if (maxNumber > number)
                maxNumber = number;
        }
        System.out.println(maxNumber);
    }
}
