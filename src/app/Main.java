package app;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static final double CONV_M = 0.62137;
    public static void main(String[] args) {

            System.out.println("App for distance converting. ");
            System.out.println("Version 2.0.");
            double miles = 5;
            double klm = 100;
            double kms =  convMilesToKilometers(miles);
            double mles = convKilometersToMiles(klm);
            System.out.println("Result is " + kms + " km.");
            System.out.println("Result is " + mles + " miles.");
        }
        private static double convMilesToKilometers(double miles) {
            return miles / CONV_M;
        }

    private static double convKilometersToMiles(double kilometers) {
        return kilometers * CONV_M;
    }
    }
