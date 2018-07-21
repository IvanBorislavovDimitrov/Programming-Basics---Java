import java.util.Scanner;

public class House {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int countOfStars = 1;
        if (n != 2) {
            if (n % 2 == 0)
                countOfStars = 2;
            for (int i = 0; i < (n - 1) / 2; ++i) {
                System.out.printf("%s%s%s\n", repeatString("-", (n - 1) / 2 - i),
                        repeatString("*", countOfStars),
                        repeatString("-", (n - 1) / 2 - i));
                countOfStars += 2;
            }
            System.out.printf("%s\n", repeatString("*", n));
            for (int i = 0; i < n / 2; ++i){
                System.out.printf("|%s|\n", repeatString("*", n - 2));
            }
        }
        else {
            System.out.println("**");
            System.out.println("||");
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
