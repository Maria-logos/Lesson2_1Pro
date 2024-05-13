package app;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static final double CONV_M = 0.62137;
    public static void main(String[] args) {

            System.out.println("App for distance converting. ");
            System.out.println("Version 1.0.");
            double miles = 5;
            double kms = convMilesToKolometers(miles);
            System.out.println("Result is " + kms + " km.");
        }
        private static double convMilesToKolometers(double miles) {
            return miles / CONV_M;
        }
    }
