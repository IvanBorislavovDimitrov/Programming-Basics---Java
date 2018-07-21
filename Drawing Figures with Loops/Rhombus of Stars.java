import java.util.Scanner;

public class RhombusOfStars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (n == 1){
            System.out.println("*");
        }
        else {
            System.out.printf("%s*\n", repeatString(" ", n - 1));
            for (int i = 0; i < n - 1; ++i) {
                System.out.printf("%s%s\n", repeatString(" ", n - 2 - i),
                        repeatString("* ", i + 2));
            }
            for (int i = n - 3; i >= 0; --i) {
                System.out.printf("%s%s\n", repeatString(" ", n - 2 - i),
                        repeatString("* ", i + 2));
            }
            System.out.printf("%s*\n", repeatString(" ", n - 1));
        }
    }
    private static String repeatString(String input, int count){
        StringBuilder text = new StringBuilder();
        for (int i = 0; i < count; ++i){
            text.append(input);
        }
        return text.toString();
    }
}
