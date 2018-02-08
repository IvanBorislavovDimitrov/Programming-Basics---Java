import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstSeconds = input.nextInt();
        int secondSeconds = input.nextInt();
        int thirdSeconds = input.nextInt();
        int minutes = (firstSeconds + secondSeconds + thirdSeconds) / 60;
        int seconds = (firstSeconds + secondSeconds + thirdSeconds) % 60;
        if (seconds < 10){
            System.out.format("%d:0%d\n", minutes, seconds);
        }
        else {
            System.out.format("%d:%d\n", minutes, seconds);
        }
    }
}
