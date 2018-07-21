import java.util.Scanner;

public class MrOrMiss {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double age = input.nextDouble();
        input.nextLine();
        char sex = input.nextLine().charAt(0);
        if (sex == 'm'){
            if (age >= 16){
                System.out.println("Mr.");
            }
            else{
                System.out.println("Master");
            }
        }
        else if (sex == 'f'){
            if (age >= 16){
                System.out.println("Ms.");
            }
            else{
                System.out.println("Miss");
            }
        }
    }
}
