import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int countOfStars = 1;
        int dashes = 1;
        if (n % 2 == 0) {
            countOfStars = 2;
            dashes = 2;
        }
        if (n == 1 || n == 2)
            System.out.println(repeatString("*", countOfStars));
        else {
            System.out.printf("%s%s%s\n", repeatString("-", (n - 1) / 2),
                    repeatString("*", countOfStars),
                    repeatString("-", (n - 1) / 2));
            for (int i = 1; i <= (n - 1) / 2; ++i){
                System.out.printf("%s*%s*%s\n", repeatString("-", (n - 1) / 2 - i),
                        repeatString("-", dashes),
                        repeatString("-", (n - 1) / 2 - i));
                dashes += 2;
            }
            dashes -= 4;
            for (int i = (n - 1) / 2 - 1; i > 0; --i){
                System.out.printf("%s*%s*%s\n", repeatString("-", (n - 1) / 2 - i),
                        repeatString("-", dashes),
                        repeatString("-", (n - 1) / 2 - i));
                dashes -= 2;
            }
            System.out.printf("%s%s%s\n", repeatString("-", (n - 1) / 2),
                    repeatString("*", countOfStars),
                    repeatString("-", (n - 1) / 2));
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
