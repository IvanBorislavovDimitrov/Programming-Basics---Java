import java.util.Scanner;

public class TableWithNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        int num;
        for (int i = 0; i < n; ++i){
            for (int j = 0; j < n; ++j){
                num = i + j + 1;
                if (num > n){
                    System.out.printf("%d ", 2 * n - num);
                }
                else {
                    System.out.printf("%d ", num);
                }
            }
            System.out.println();
        }
    }
}
