import java.util.Scanner;

public class SquareFrame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.printf("+%s +\n", repeatString(" -", n - 2));
        for (int i = 0; i < n - 2; ++i){
            System.out.printf("|%s |\n", repeatString(" -", n - 2));
        }
        System.out.printf("+%s +\n", repeatString(" -", n - 2));
    }
    private static String repeatString(String input, int count){
        StringBuilder text = new StringBuilder();
        for (int i = 0; i < count; ++i){
            text.append(input);
        }
        return text.toString();
    }
}
