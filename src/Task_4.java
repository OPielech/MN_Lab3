public class Task_4 {

    public static void main(String[] args) {
        double[] xrs = new double[1000];
        double xl = -80;
        double xu = 30;
        double xr = 0;

        for (int i = 0; i < xrs.length; i++) {
            xr = (xl + xu) / 2;
            xrs[i] = xr;

            if (function(8.1, xl) * function(8.1, xr) < 0) {
                xu = xr;
            } else if (function(8.1, xr) * function(8.1, xu) < 0) {
                xl = xr;
            } else {
                i = xrs.length - 1;
            }

        }//end of for
        System.out.println("For Of = 8.10 temperature equals " + xr);

        xrs = new double[1000];
        xl = -80;
        xu = 30;
        xr = 0;

        for (int i = 0; i < xrs.length; i++) {
            xr = (xl + xu) / 2;
            xrs[i] = xr;

            if (function(12, xl) * function(12, xr) < 0) {
                xu = xr;
            } else if (function(12, xr) * function(12, xu) < 0) {
                xl = xr;
            } else {
                i = xrs.length - 1;
            }
        }//end of for
        System.out.println("For Of = 12 temperature equals " + xr);

    }//end of main

    public static double function(double Of, double x) {
        double t = x + 273.15;
        double y = -139.34411
                + (1.575701 * Math.pow(10, 5)) / t
                - (6.642308 * Math.pow(10, 7) / Math.pow(t, 2))
                + (1.243800 * Math.pow(10, 10) / Math.pow(t, 3))
                - (8.621949 * Math.pow(10, 11) / Math.pow(t, 4))
                - Math.log(Of);
        return y;
    }//end of function

}//end of class
