import java.util.Scanner;

public class EqualPears {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int maxDiff = Integer.MIN_VALUE;
        int number = 0, prevNumber = 0, lastSum = 0, sum = 0, flag = 0;
        for (int i = 0; i < 2 * n; ++i){
            number = input.nextInt();
            if (i % 2 != 0 && i == 1){
                sum = number + prevNumber;
                lastSum = number + prevNumber;
            }
            else if (i % 2 != 0){
                sum = number + prevNumber;
            }
            if (sum != lastSum){
                flag = 1;
                if (maxDiff < (Math.abs(lastSum - sum))){
                    maxDiff = (Math.abs(lastSum - sum));
                }
            }
            prevNumber = number;
            lastSum = sum;
        }
        if (flag == 0){
            System.out.printf("Yes, value=%d\n", sum);
        }
        else {
            System.out.printf("No, maxdiff=%d\n", maxDiff);
        }
    }
}
