import java.util.Scanner;

public class AnimalClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String animal = input.nextLine();
        switch (animal){
            case "dog": {
                System.out.println("mammal");
                break;
            }
            case "crocodile":{
                System.out.println("reptile");
                break;
            }
            case "tortoise":{
                System.out.println("reptile");
                break;
            }
            case "snake":{
                System.out.println("reptile");
                break;
            }
            default:
                System.out.println("unknown");
        }
    }
}
