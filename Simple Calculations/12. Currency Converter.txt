    import java.util.Scanner;

    public class Main {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            double money = Double.parseDouble(input.nextLine());
            String typeOfYourMoney = input.nextLine();
            String typeNewMoney = input.nextLine();
            if (typeOfYourMoney.equals("USD")){
                if (typeNewMoney.equals("USD")){
                    System.out.printf("%.2f %s\n", money, typeNewMoney);
                }
                else if (typeNewMoney.equals("BGN")){
                    System.out.printf("%.2f %s\n", money * 1.79549, typeNewMoney);
                }
                else if (typeNewMoney.equals("GBP")){
                    System.out.printf("%.2f %s\n", money * 0.7085512, typeNewMoney);
                }
                else if (typeNewMoney.equals("EUR")){
                    System.out.printf("%.2f %s\n", money * 0.918019, typeNewMoney);
                }
            }
            else if (typeOfYourMoney.equals("BGN")){
                if (typeNewMoney.equals("BGN")){
                    System.out.printf("%.2f %s\n", money, typeNewMoney);
                }
                else if (typeNewMoney.equals("USD")){
                    System.out.printf("%.2f %s\n", money / 1.79549, typeNewMoney);
                }
                else if (typeNewMoney.equals("EUR")){
                    System.out.printf("%.2f %s\n", money / 1.95583, typeNewMoney);
                }
                else if(typeNewMoney.equals("GBP")){
                    System.out.printf("%.2f %s\n", money / 2.53405, typeNewMoney);
                }
            }
            else if (typeOfYourMoney.equals("EUR")){
                if (typeNewMoney.equals("EUR")){
                    System.out.printf("%.2f %s\n", money, typeNewMoney);
                }
                else if (typeNewMoney.equals("BGN")){
                    System.out.printf("%.2f %s\n", money * 1.79549, typeNewMoney);
                }
                else if (typeNewMoney.equals("USD")){
                    System.out.printf("%.2f %s\n", money * 1.089307, typeNewMoney);
                }
                else if (typeNewMoney.equals("GBP")){
                    System.out.printf("%.2f %s\n", money * 0.7717223, typeNewMoney);
                }
            }
            else if (typeOfYourMoney.equals("GBP")){
                if (typeNewMoney.equals("BGN")){
                    System.out.printf("%.2f %s\n", money * 2.53405, typeNewMoney);
                }
                else if (typeNewMoney.equals("EUR")){
                    System.out.printf("%.2f %s\n", money * 1.2956391, typeNewMoney);
                }
                else if (typeNewMoney.equals("GBP")){
                    System.out.printf("%.2f %s\n", money, typeNewMoney);
                }
                else if (typeNewMoney.equals("USD")){
                    System.out.printf("%.2f %s\n", money * 1.4113417, typeNewMoney);
                }
            }
        }
    }
