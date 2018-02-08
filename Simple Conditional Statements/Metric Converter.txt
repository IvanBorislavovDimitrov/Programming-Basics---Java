import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double value = Double.parseDouble(input.nextLine());
        String inputUnit = input.nextLine();
        String outputUnit = input.nextLine();
        if (inputUnit.equals("mm")){
            if (outputUnit.equals("mm"))
                System.out.format("%.8f mm\n", value);
            else if (outputUnit.equals("cm"))
                System.out.format("%.8f cm\n", value * 0.1);
            else if (outputUnit.equals("m"))
                System.out.format("%.8f m\n", value * 0.001);
            else if (outputUnit.equals("mi"))
                System.out.format("%.8f mi\n", value * 0.001 * 0.000621371192);
            else if (outputUnit.equals("in"))
                System.out.format("%.8f in\n", value * 0.001 * 39.3700787);
            else if (outputUnit.equals("km"))
                System.out.format("%.8f km\n", value * 0.001 * 0.001);
            else if (outputUnit.equals("ft"))
                System.out.format("%.8f ft\n", value * 0.001 * 3.2808399);
            else if (outputUnit.equals("yd"))
                System.out.format("%.8f yd\n", value * 0.001 * 1.0936133);
            
            else
                System.out.println("This unit does not exist");
        }
        else if (inputUnit.equals("cm")){
            if (outputUnit.equals("mm"))
                System.out.format("%.8f mm\n", value * 0.01 * 1000);
            else if (outputUnit.equals("cm"))
                System.out.format("%.8f cm\n", value);
            else if (outputUnit.equals("m"))
                System.out.format("%.8f m\n", value * 0.01);
            else if (outputUnit.equals("mi"))
                System.out.format("%.8f mi\n", value * 0.01 * 0.000621371192);
            else if (outputUnit.equals("in"))
                System.out.format("%.8f in\n", value * 0.01 * 39.3700787);
            else if (outputUnit.equals("km"))
                System.out.format("%.8f km\n", value * 0.01 * 0.001);
            else if (outputUnit.equals("ft"))
                System.out.format("%.8f ft\n", value * 0.01 * 3.2808399);
            else if (outputUnit.equals("yd"))
                System.out.format("%.8f yd\n", value * 0.01 * 1.0936133);
            
            else
                System.out.println("This unit does not exist");
        }
        else if (inputUnit.equals("m")){
            if (outputUnit.equals("mm"))
                System.out.format("%.8f mm\n", value * 1000);
            else if (outputUnit.equals("cm"))
                System.out.format("%.8f cm\n", value * 100);
            else if (outputUnit.equals("m"))
                System.out.format("%.8f m\n", value);
            else if (outputUnit.equals("mi"))
                System.out.format("%.8f mi\n", value * 0.000621371192);
            else if (outputUnit.equals("in"))
                System.out.format("%.8f in\n", value * 39.3700787);
            else if (outputUnit.equals("km"))
                System.out.format("%.8f km\n", value * 0.001);
            else if (outputUnit.equals("ft"))
                System.out.format("%.8f ft\n", value * 3.2808399);
            else if (outputUnit.equals("yd"))
                System.out.format("%.8f yd\n", value * 1.0936133);
            else
                System.out.println("This unit does not exist");
        }
        else if (inputUnit.equals("mi")){
            if (outputUnit.equals("mm"))
                System.out.format("%.8f mm\n", value / 0.000621371192 * 1000);
            else if (outputUnit.equals("cm"))
                System.out.format("%.8f cm\n", value / 0.000621371192 * 100);
            else if (outputUnit.equals("m"))
                System.out.format("%.8f m\n", value / 0.000621371192);
            else if (outputUnit.equals("mi"))
                System.out.format("%.8f mi\n", value);
            else if (outputUnit.equals("in"))
                System.out.format("%.8f in\n", value / 0.000621371192 * 39.3700787);
            else if (outputUnit.equals("km"))
                System.out.format("%.8f km\n", value / 0.000621371192 * 0.001);
            else if (outputUnit.equals("ft"))
                System.out.format("%.8f ft\n", value / 0.000621371192 * 3.2808399);
            else if (outputUnit.equals("yd"))
                System.out.format("%.8f yd\n", value / 0.000621371192 * 1.0936133);
            else
                System.out.println("This unit does not exist");
        }
        else if (inputUnit.equals("in")){
            if (outputUnit.equals("mm"))
                System.out.format("%.8f mm\n", value / 39.3700787 * 1000);
            else if (outputUnit.equals("cm"))
                System.out.format("%.8f cm\n", value / 39.3700787 * 100);
            else if (outputUnit.equals("m"))
                System.out.format("%.8f m\n", value / 39.3700787);
            else if (outputUnit.equals("mi"))
                System.out.format("%.8f mi\n", value / 39.3700787 * 0.000621371192);
            else if (outputUnit.equals("in"))
                System.out.format("%.8f in\n", value);
            else if (outputUnit.equals("km"))
                System.out.format("%.8f km\n", value / 39.3700787 * 0.001);
            else if (outputUnit.equals("ft"))
                System.out.format("%.8f ft\n", value / 39.3700787 * 3.2808399);
            else if (outputUnit.equals("yd"))
                System.out.format("%.8f yd\n", value / 39.3700787 * 1.0936133);
            else
                System.out.println("This unit does not exist");
        }
        else if (inputUnit.equals("km")){
            if (outputUnit.equals("mm"))
                System.out.format("%.8f mm\n", value / 0.001 * 1000);
            else if (outputUnit.equals("cm"))
                System.out.format("%.8f cm\n", value / 0.001 * 100);
            else if (outputUnit.equals("m"))
                System.out.format("%.8f m\n", value / 0.001);
            else if (outputUnit.equals("mi"))
                System.out.format("%.8f mi\n", value / 0.001 * 0.000621371192);
            else if (outputUnit.equals("in"))
                System.out.format("%.8f in\n", value / 0.001 * 39.3700787);
            else if (outputUnit.equals("km"))
                System.out.format("%.8f km\n", value);
            else if (outputUnit.equals("ft"))
                System.out.format("%.8f ft\n", value / 0.001 * 3.2808399);
            else if (outputUnit.equals("yd"))
                System.out.format("%.8f yd\n", value / 0.001 * 1.0936133);
            else
                System.out.println("This unit does not exist");
        }
        else if (inputUnit.equals("ft")){
            if (outputUnit.equals("mm"))
                System.out.format("%.8f mm\n", value / 3.2808399 * 1000);
            else if (outputUnit.equals("cm"))
                System.out.format("%.8f cm\n", value / 3.2808399 * 100);
            else if (outputUnit.equals("m"))
                System.out.format("%.8f m\n", value / 3.2808399);
            else if (outputUnit.equals("mi"))
                System.out.format("%.8f mi\n", value / 3.2808399 * 0.000621371192);
            else if (outputUnit.equals("in"))
                System.out.format("%.8f in\n", value / 3.2808399 * 39.3700787);
            else if (outputUnit.equals("km"))
                System.out.format("%.8f km\n", value / 3.2808399 * 0.001);
            else if (outputUnit.equals("ft"))
                System.out.format("%.8f ft\n", value);
            else if (outputUnit.equals("yd"))
                System.out.format("%.8f yd\n", value / 3.2808399 * 1.0936133);
            else
                System.out.println("This unit does not exist");
        }
        else if (inputUnit.equals("yd")){
            if (outputUnit.equals("mm"))
                System.out.format("%.8f mm\n", value / 1.0936133 * 1000);
            else if (outputUnit.equals("cm"))
                System.out.format("%.8f cm\n", value / 1.0936133 * 100);
            else if (outputUnit.equals("m"))
                System.out.format("%.8f m\n", value / 1.0936133);
            else if (outputUnit.equals("mi"))
                System.out.format("%.8f mi\n", value / 1.0936133 * 0.000621371192);
            else if (outputUnit.equals("in"))
                System.out.format("%.8f in\n", value / 1.0936133 * 39.3700787);
            else if (outputUnit.equals("km"))
                System.out.format("%.8f km\n", value / 1.0936133 * 0.001);
            else if (outputUnit.equals("ft"))
                System.out.format("%.8f ft\n", value / 1.0936133 * 3.2808399);
            else if (outputUnit.equals("yd"))
                System.out.format("%.8f yd\n", value);
            else
                System.out.println("This unit does not exist");
        }
        
    }
}
