import java.text.DecimalFormat;
import java.util.Scanner;

public class OddEvenPositions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.###");
        int n = input.nextInt();
        double oddSum = 0, oddMin = Double.MAX_VALUE, oddMax = -Double.MAX_VALUE, evenSum = 0;
        double evenMin = Double.MAX_VALUE, evenMax = -Double.MAX_VALUE;
        for (int i = 1; i <= n; ++i){
            double number = input.nextDouble();
            if (i % 2 == 0){
                evenSum += number;
                if (number > evenMax)
                    evenMax = number;
                if (number < evenMin)
                    evenMin = number;
            }
            else {
                oddSum += number;
                if (number > oddMax)
                    oddMax = number;
                if (number < oddMin)
                    oddMin = number;
            }
        }

        System.out.printf("OddSum=%s,\n", df.format(oddSum));
        if (oddMin == Double.MAX_VALUE)
            System.out.printf("OddMin=No,\n");
        else
            System.out.printf("OddMin=%s,\n", df.format(oddMin));
        if (oddMax == -Double.MAX_VALUE)
            System.out.printf("OddMax=No,\n");
        else
            System.out.printf("OddMax=%s,\n", df.format(oddMax));

        System.out.printf("EvenSum=%s,\n", df.format(evenSum));
        if (evenMin == Double.MAX_VALUE)
            System.out.printf("EvenMin=No,\n");
        else
            System.out.printf("EvenMin=%s,\n", df.format(evenMin));
        if (evenMax == -Double.MAX_VALUE)
            System.out.printf("EvenMax=No\n");
        else
            System.out.printf("EvenMax=%s\n", df.format(evenMax));



    }
}
