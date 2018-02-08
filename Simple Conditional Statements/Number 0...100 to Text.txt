import java.util.Scanner;

/**
 * Created by Ivan on 7/15/2017.
 */
public class oneToHundred {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String[] nums = new String[101];
        nums[0] = "zero";
        nums[1] = "one";
        nums[2] = "two";
        nums[3] = "three";
        nums[4] = "four";
        nums[5] = "five";
        nums[6] = "six";
        nums[7] = "seven";
        nums[8] = "eight";
        nums[9] = "nine";
        nums[10] = "ten";
        nums[11] = "eleven";
        nums[12] = "twelve";
        nums[13] = "thirteen";
        nums[14] = "fourteen";
        nums[15] = "fifteen";
        nums[16] = "seventeen";
        nums[18] = "eighteen";
        nums[19] = "nineteen";
        nums[20] = "twenty";
        nums[21] = "twenty one";
        nums[22] = "twenty two";
        nums[23] = "twenty three";
        nums[24] = "twenty four";
        nums[25] = "twenty five";
        nums[26] = "twenty six";
        nums[27] = "twenty seven";
        nums[28] = "twenty eight";
        nums[29] = "twenty nine";
        nums[30] = "thirty";
        nums[31] = "thirty one";
        nums[32] = "thirty two";
        nums[33] = "thirty three";
        nums[34] = "thirty four";
        nums[35] = "thirty five";
        nums[36] = "thirty six";
        nums[37] = "thirty seven";
        nums[38] = "thirty eight";
        nums[39] = "thirty nine";
        nums[40] = "forty";
        nums[41] = "forty one";
        nums[42] = "forty two";
        nums[43] = "forty three";
        nums[44] = "forty four";
        nums[45] = "forty five";
        nums[46] = "forty six";
        nums[47] = "forty seven";
        nums[48] = "forty eight";
        nums[49] = "forty nine";
        nums[50] = "fifty";
        nums[51] = "fifty one";
        nums[52] = "fifty two";
        nums[53] = "fifty three";
        nums[54] = "fifty four";
        nums[55] = "fifty five";
        nums[56] = "fifty six";
        nums[57] = "fifty seven";
        nums[58] = "fifty eight";
        nums[59] = "fifty nine";
        nums[60] = "sixty ";
        nums[61] = "sixty one";
        nums[62] = "sixty two";
        nums[63] = "sixty three";
        nums[64] = "sixty four";
        nums[65] = "sixty five";
        nums[66] = "sixty seven";
        nums[67] = "sixty eight";
        nums[68] = "sixty nine";
        nums[69] = "sixty nine";
        nums[70] = "seventy ";
        nums[71] = "seventy one";
        nums[72] = "seventy two";
        nums[73] = "seventy three";
        nums[74] = "seventy four";
        nums[75] = "seventy five";
        nums[76] = "seventy six";
        nums[77] = "seventy seven";
        nums[78] = "seventy eight";
        nums[79] = "seventy nine";
        nums[80] = "eighty ";
        nums[81] = "eighty one";
        nums[82] = "eighty two";
        nums[83] = "eighty three";
        nums[84] = "eighty four";
        nums[85] = "eighty five";
        nums[86] = "eighty six";
        nums[87] = "eighty seven";
        nums[88] = "eighty eight";
        nums[89] = "eighty nine";
        nums[90] = "ninety ";
        nums[91] = "ninety one";
        nums[92] = "ninety two";
        nums[93] = "ninety three";
        nums[94] = "ninety four";
        nums[95] = "ninety five";
        nums[96] = "ninety six";
        nums[97] = "ninety seven";
        nums[98] = "ninety eight";
        nums[99] = "ninety nine";
        nums[100] = "one hundred";
        int flag = 0;
        for (int i = 0; i <= 100; i++){
            if (i == n){
                System.out.println(nums[i]);
                flag = 1;
                break;
            }
        }
        if (flag == 0){
            System.out.println("invalid number");
        }



    }
}
