    import java.util.Scanner;

    public class Main {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            String town, firstName, lastName;
            int age;
            firstName = input.nextLine();
            lastName = input.nextLine();
            age = Integer.parseInt(input.nextLine());
            town = input.nextLine();
            System.out.printf("You are %s %s, a %d-years old person from %s.\n", firstName, lastName, age, town);
        }
    }
