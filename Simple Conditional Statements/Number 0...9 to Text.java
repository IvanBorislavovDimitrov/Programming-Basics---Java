import java.util.Scanner;

public class numberToText {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        String[] numbers = new String[9];
        numbers[0] = "one";
        numbers[1] = "two";
        numbers[2] = "three";
        numbers[3] = "four";
        numbers[4] = "five";
        numbers[5] = "six";
        numbers[6] = "seven";
        numbers[7] = "eight";
        numbers[8] = "nine";
        int flag = 0;
        for (int i = 0; i < 9; i++){
            if (i == number - 1){
                System.out.println(numbers[i]);
                flag = 1;
            }
        }
        if (flag == 0){
            System.out.println("number too big");
        }
    }
}
