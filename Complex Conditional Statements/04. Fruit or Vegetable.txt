import java.util.Scanner;

public class FruitOrVegetable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String fruitOrVeg = input.nextLine();
        fruitOrVeg = fruitOrVeg.toLowerCase();
        if (fruitOrVeg.equals("banana") || fruitOrVeg.equals("apple") || fruitOrVeg.equals("kiwi") ||
                fruitOrVeg.equals("cherry") || fruitOrVeg.equals("lemon") || fruitOrVeg.equals("grapes")){
            System.out.println("fruit");
        }
        else if (fruitOrVeg.equals("tomato") || fruitOrVeg.equals("cucumber") || fruitOrVeg.equals("pepper") ||
                fruitOrVeg.equals("carrot")){
            System.out.println("vegetable");
        }
        else {
            System.out.println("unknown");
        }
    }
}
