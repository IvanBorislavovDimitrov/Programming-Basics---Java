import java.util.Scanner;

public class Store {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String product = input.nextLine();
        product = product.toLowerCase();
        String city = input.nextLine();
        city = city.toLowerCase();
        double quantity = input.nextDouble();
        if (city.equals("sofia")){
            if (product.equals("coffee")){
                System.out.println(0.50 * quantity);
            }
            else if (product.equals("water")){
                System.out.println(0.80 * quantity);
            }
            else if (product.equals("beer")){
                System.out.println(1.20 * quantity);
            }
            else if (product.equals("sweets")){
                System.out.println(1.45 * quantity);
            }
            else if (product.equals("peanuts")){
                System.out.println(1.60 * quantity);
            }
        }
        else if (city.equals("plovdiv")){
            if (product.equals("coffee")){
                System.out.println(0.40 * quantity);
            }
            else if (product.equals("water")){
                System.out.println(0.70 * quantity);
            }
            else if (product.equals("beer")){
                System.out.println(1.15 * quantity);
            }
            else if (product.equals("sweets")){
                System.out.println(1.30 * quantity);
            }
            else if (product.equals("peanuts")){
                System.out.println(1.50 * quantity);
            }
        }
        else if (city.equals("varna")){
            if (product.equals("coffee")){
                System.out.println(0.45 * quantity);
            }
            else if (product.equals("water")){
                System.out.println(0.70 * quantity);
            }
            else if (product.equals("beer")){
                System.out.println(1.10 * quantity);
            }
            else if (product.equals("sweets")){
                System.out.println(1.35 * quantity);
            }
            else if (product.equals("peanuts")){
                System.out.println(1.55 * quantity);
            }
        }
    }
}
