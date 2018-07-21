import java.util.Scanner;

/**
 * Created by Ivan on 7/15/2017.
 */
public class IdenticalStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String firstWord = input.nextLine();
        String secondWord = input.nextLine();
        firstWord = firstWord.toLowerCase();
        secondWord = secondWord.toLowerCase();
        if (firstWord.equals(secondWord))
            System.out.println("yes");
        else
            System.out.println("no");
    }
}
