import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String ticket = input.nextLine();
        int base = input.nextInt();
        int width = input.nextInt();
        int all = base * width;
        ticket = ticket.toLowerCase();
        switch (ticket){
            case "premiere":{
                System.out.format("%.2f\n", all * 12.0);
                break;
            }
            case "normal":{
                System.out.format("%.2f\n", all * 7.50);
                break;
            }
            case "discount":{
                System.out.printf("%.2f\n", all * 5.0);
                break;
            }
            default:
                System.out.printf("error\n");
        }
    }
}
