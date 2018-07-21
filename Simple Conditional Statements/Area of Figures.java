import java.util.Scanner;

public class FiguresArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String figure = input.nextLine();
        figure = figure.toLowerCase();
        if (figure.equals("square")){
            double base = Double.parseDouble(input.nextLine());
            System.out.println(base * base);
        }
        if (figure.equals("rectangle")){
            double width = Double.parseDouble(input.nextLine());
            double height = Double.parseDouble(input.nextLine());
            System.out.println(width * height);
        }
        if (figure.equals("circle")){
            double radius = Double.parseDouble(input.nextLine());
            System.out.println(radius * Math.PI * radius);
        }
        if (figure.equals("triangle")){
            double base = Double.parseDouble(input.nextLine());
            double height = Double.parseDouble(input.nextLine());
            System.out.println(base * height / 2);
        }
    }
}
