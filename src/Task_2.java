public class Task_2 {

    public static void main(String[] args) {
        double a = -0.5;
        double b = 2.5;
        double c = 4.5;

        System.out.println("x1: " + x1(a, b, delta(a, b, c)));
        System.out.println("x2: " + x2(a, b, delta(a, b, c)) + "\n");

        double[] xrs = new double[1000];
        double xl = 4;
        double xu = 8;
        double xr = 0;
        double ea = 0;
        double et = 0;

        for (int i = 0; i < xrs.length; i++) {
            xr = (xl + xu) / 2;
            xrs[i] = xr;

            if (function(xl) * function(xr) < 0) {
                xu = xr;
            } else if (function(xr) * function(xu) < 0) {
                xl = xr;
            } else {
                i = xrs.length - 1;
            }


            System.out.println("xr = " + xr);
            if (i != 0) {
                ea = Math.abs((xrs[i] - xrs[i - 1]) / xrs[i] * 100);

                System.out.printf("Ea = %.2e%c\n", ea, '%');

            }
            et = Math.abs((x1(a, b, delta(a, b, c)) - xr) / x1(a, b, delta(a, b, c)) * 100);
            System.out.printf("Et = %.2e%c\n", et, '%');
        }//end of for

        System.out.println("\nRoot of function: " + xr);
    }//end of main

    public static double function(double x) {
        double y = -0.5 * Math.pow(x, 2) + 2.5 * x + 4.5;
        return y;
    }//end of function

    public static double delta(double a, double b, double c) {
        double delta;
        delta = Math.pow(b, 2) - 4 * a * c;
        return delta;
    }//end of delta

    public static double x1(double a, double b, double delta) {
        double x1;
        x1 = (-b - Math.sqrt(delta)) / (2 * a);
        return x1;
    }//end of x1

    public static double x2(double a, double b, double delta) {
        double x2;
        x2 = (-b + Math.sqrt(delta)) / (2 * a);
        return x2;
    }//end of x1

}//end of class
