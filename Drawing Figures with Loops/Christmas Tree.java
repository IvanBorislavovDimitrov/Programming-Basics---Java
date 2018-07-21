import java.util.Scanner;

public class ChristmasTree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 0; i <= n; ++i){
            System.out.printf("%s%s | %s\n", repeatString(" ", n - i),
                    repeatString("*", i),
                    repeatString("*", i));
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
