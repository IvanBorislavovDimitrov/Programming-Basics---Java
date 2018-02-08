import java.util.Scanner;

public class PointInRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double pointX = input.nextDouble();
        double pointY = input.nextDouble();
        if ((pointX >= x1 && pointX <= x2) && (pointY >= y1 && pointY <= y2)){
            System.out.println("Inside");
        }
        else{
            System.out.println("Outside");
        }
    }
}
