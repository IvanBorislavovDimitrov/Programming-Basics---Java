import java.util.Scanner;

public class TradeCommission {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String city = input.nextLine();
        city = city.toLowerCase();
        double commission = input.nextDouble();
        switch (city){
            case "sofia":{
                if (commission >= 0 && commission <= 500){
                    System.out.format("%.2f", 0.05 * commission);
                }
                else if (commission > 500 && commission <= 1000){
                    System.out.format("%.2f", 0.07 * commission);
                }
                else if (commission > 1000 && commission <= 10000){
                    System.out.format("%.2f", 0.08 * commission);
                }
                else if (commission > 10000){
                    System.out.format("%.2f", 0.12 * commission);
                }
                else {
                    System.out.println("error");
                }
                break;
            }
            case "varna":{
                if (commission >= 0 && commission <= 500){
                    System.out.format("%.2f", 0.045 * commission);
                }
                else if (commission > 500 && commission <= 1000){
                    System.out.format("%.2f", 0.075 * commission);
                }
                else if (commission > 1000 && commission <= 10000){
                    System.out.format("%.2f", 0.10 * commission);
                }
                else if (commission > 10000){
                    System.out.format("%.2f", 0.13 * commission);
                }
                else {
                    System.out.println("error");
                }
                break;
            }
            case "plovdiv":{
                if (commission >= 0 && commission <= 500){
                    System.out.format("%.2f", 0.055 * commission);
                }
                else if (commission > 500 && commission <= 1000){
                    System.out.format("%.2f", 0.08 * commission);
                }
                else if (commission > 1000 && commission <= 10000){
                    System.out.format("%.2f", 0.12 * commission);
                }
                else if (commission > 10000){
                    System.out.format("%.2f", 0.145 * commission);
                }
                else {
                    System.out.println("error");
                }
                break;
            }
            default:
                System.out.println("error");
        }
    }
}
