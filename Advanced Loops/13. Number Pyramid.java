import java.util.Scanner;

public class PyramidOfNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        int myNum = 1;
        byte flag = 0;
        for (int i = 1; i <= n; ++i){
            for (int j = 1; j <= i; ++j){
                System.out.printf("%d ", myNum);
                if (myNum == n){
                    flag = 1;
                    break;
                }
                myNum++;
            }
            if (flag == 1)
                break;
            System.out.println();
        }
    }
}
