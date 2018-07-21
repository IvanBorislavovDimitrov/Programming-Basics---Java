import java.util.Scanner;

public class PointInFigure {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int h = input.nextInt();
        int x = input.nextInt();
        int y = input.nextInt();
        if (x > 0 && x < 3 * h && y > 0 && y < h){
            System.out.printf("inside");
        }
        else if ((x > h && x < 2 * h) && y == h){
            System.out.println("inside");
        }
        else if (((x >= 0 && x <= 3 * h) && (y == 0 || y == h)) ||
                ((y >= 0 && y <= h) && (x == 0 || x == 3 * h))){
            System.out.printf("border");
        }

        else if (x > h && x < 2 * h && y > h && y < 4 * h){
                System.out.printf("inside");
        }
        else if (((x >= h && x <= 2 * h) && (y == 4 * h)) ||
                ((y > h && y <= 4 * h) && (x == h || x == 2 * h))){
            System.out.println("border");
        }
        else {
            System.out.println("outside");
        }


    }
}
