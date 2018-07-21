import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String fruit = input.nextLine();
        fruit = fruit.toLowerCase();
        String day = input.nextLine();
        day = day.toLowerCase();
        double quantity = input.nextDouble();

        if (day.equals("saturday") || day.equals("sunday")) {
            switch (fruit){
                case "banana":{
                    System.out.format("%.2f", 2.70 * quantity);
                    break;
                }
                case "apple":{
                    System.out.format("%.2f", 1.25 * quantity);
                    break;
                }
                case "orange":{
                    System.out.format("%.2f", 0.90 * quantity);
                    break;
                }
                case  "grapefruit":{
                    System.out.format("%.2f", 1.60 * quantity);
                    break;
                }
                case "kiwi":{
                    System.out.format("%.2f", 3.00 * quantity);
                    break;
                }
                case "pineapple":{
                    System.out.format("%.2f", 5.60 * quantity);
                    break;
                }
                case "grapes":{
                    System.out.format("%.2f", 4.20 * quantity);
                    break;
                }
                default:
                    System.out.println("error");
            }
        }
        else if (day.equals("monday") || day.equals("tuesday") ||
                day.equals("wednesday") || day.equals("thursday") ||
                day.equals("friday")){
             
                switch (fruit) {
                    case "banana": {
                        System.out.format("%.2f", 2.50 * quantity);
                        break;
                    }
                    case "apple": {
                        System.out.format("%.2f", 1.20 * quantity);
                        break;
                    }
                    case "orange": {
                        System.out.format("%.2f", 0.85 * quantity);
                        break;
                    }
                    case "grapefruit": {
                        System.out.format("%.2f", 1.45 * quantity);
                        break;
                    }
                    case "kiwi": {
                        System.out.format("%.2f", 2.70 * quantity);
                        break;
                    }
                    case "pineapple": {
                        System.out.format("%.2f", 5.50 * quantity);
                        break;
                    }
                    case "grapes": {
                        System.out.format("%.2f", 3.85 * quantity);
                        break;
                    }
                    default:
                        System.out.println("error");
                }
            }
            else {
            System.out.println("error");
        }
    }
}