import java.util.Scanner;

public class Volleyball {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String year = input.nextLine();
        int holiday = input.nextInt();
        int goHome = input.nextInt();
        int weekends = 48;
        int weekendsInSofia = weekends - goHome;
        double totalGames = weekendsInSofia * 3.0 / 4;
        totalGames += goHome;
        totalGames += (holiday * 2.0 / 3);
        if (year.equals("leap")){
            totalGames *= 1.15;
        }
        System.out.printf("%.0f\n", Math.floor(totalGames));
    }
}
