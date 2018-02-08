import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main{

    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        String inputDate = input.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate parsedDate = LocalDate.parse(inputDate, formatter);
        LocalDate addedDas = parsedDate.plusDays(999);
        System.out.println(addedDas.format(formatter));
    }
}
