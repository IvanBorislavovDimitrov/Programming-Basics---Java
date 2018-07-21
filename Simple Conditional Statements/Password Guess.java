import java.util.Scanner;

public class GuessThePassword {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String string = input.nextLine();
        if (string.equals("s3cr3t!P@ssw0rd"))
            System.out.println("Welcome");
        else
            System.out.println("Wrong password!");
    }
}
