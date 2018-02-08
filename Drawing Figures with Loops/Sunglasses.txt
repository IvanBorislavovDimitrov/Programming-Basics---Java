import java.util.Scanner;

public class Sunglasses {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.printf("%s%s%s\n", repeatString("*", 2 * n),
                repeatString(" ", n),
                repeatString("*", 2 * n));
        for (int i = 1; i <= n - 2; ++i){
            if ((n - 1) / 2 == i){
                System.out.printf("*%s*%s*%s*\n", repeatString("/", 2 * n - 2),
                        repeatString("|", n),
                        repeatString("/", 2 * n - 2));
            }
            else {
                System.out.printf("*%s*%s*%s*\n", repeatString("/", 2 * n - 2),
                        repeatString(" ", n),
                        repeatString("/", 2 * n - 2));
            }
        }
        System.out.printf("%s%s%s\n", repeatString("*", 2 * n),
                repeatString(" ", n),
                repeatString("*", 2 * n));
    }
    private static String repeatString(String input, int count){
        StringBuilder text = new StringBuilder();
        for (int i = 0; i < count; ++i){
            text.append(input);
        }
        return text.toString();
    }
}
