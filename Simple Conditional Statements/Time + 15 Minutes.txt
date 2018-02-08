import java.util.Scanner;

/**
 * Created by Ivan on 7/15/2017.
 */
public class TimePlusMinutes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hours = input.nextInt();
        int minutes = input.nextInt();
        int addTimeInMinutes = 15;
        int fullMinutes = hours * 60 + minutes;
        fullMinutes += addTimeInMinutes;
        int newHours = fullMinutes / 60;
        int newMinutes = fullMinutes % 60;
        if (newHours > 23){
            newHours %= 24;
        }
        if (newMinutes < 10)
            System.out.format("%d:0%d\n", newHours, newMinutes);
        else
            System.out.format("%d:%d\n", newHours, newMinutes);

    }
}
