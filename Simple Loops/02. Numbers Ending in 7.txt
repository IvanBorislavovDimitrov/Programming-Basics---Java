import java.util.Scanner;

public class LastNum7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int i = 1; i <= 1000; ++i){
            int n = i % 10;
            if (n == 7)
                System.out.println(i);
        }
    }
}
