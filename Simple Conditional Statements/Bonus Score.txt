import java.util.Scanner;

/**
 * Created by Ivan on 7/15/2017.
 */
public class BonusPoints {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstPoints = input.nextInt();
        double bonusPoints;
        if (firstPoints <= 100){
            bonusPoints = 5;
            if (firstPoints % 2 == 0)
                bonusPoints++;
            else if (firstPoints % 5 == 0){
                bonusPoints += 2;
            }
            System.out.println(bonusPoints + "\n" + (firstPoints + bonusPoints));
        }
        else if (firstPoints > 100 && firstPoints <= 1000){
            bonusPoints = firstPoints * 0.2;
            if (firstPoints % 2 == 0)
                bonusPoints++;
            else if (bonusPoints % 5 == 0)
                bonusPoints += 2;
            System.out.println(bonusPoints + "\n" + (firstPoints + bonusPoints));
        }
        else if (firstPoints > 1000){
            bonusPoints = firstPoints * 0.1;
            if (firstPoints % 2 == 0)
                bonusPoints++;
            else if (firstPoints % 5 == 0)
                bonusPoints += 2;
            System.out.println(bonusPoints + "\n" + (firstPoints + bonusPoints));
        }
    }
}
