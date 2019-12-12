public class Task_3 {
    public static void main(String[] args) {
        double[] xrs = new double[60];
        double xl = 1;
        double xu = 2;
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


            System.out.println(xr);
            if (i != 0) {
                ea = Math.abs((xrs[i] - xrs[i - 1]) / xrs[i] * 100);
                System.out.printf("Ea = %.2e%c\n", ea, '%');
            }

            et = Math.abs((Math.sqrt(3) - xr) / Math.sqrt(3) * 100);
            System.out.printf("Et = %.2e%c\n", et, '%');
        }//end of for

        System.out.println("Root of function: " + xr);
    }//end of main

    public static double function(double x) {
        double y = Math.pow(x, 3) + Math.pow(x, 2) - 3 * x - 3;
        return y;
    }//end of function
}//end of class
