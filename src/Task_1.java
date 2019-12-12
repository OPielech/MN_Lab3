public class Task_1 {
    public static void main(String[] args) {
        double[] xrs = new double[1000];
        double xl = 12;
        double xu = 16;
        double xr = 0;
        double ea = 0;
        int iteration = 0;

//        while (function(xr)!=0){
//            xr=(xl+xu)/2;
//            if(function(xl)*function(xr)<0){
//                xu=xr;
//            }
//            else if(function(xr)*function(xu)<0){
//                xl=xr;
//            }
//            System.out.println(xr);
//        }//end of while

        for (int i = 0; i < xrs.length; i++) {
            iteration++;

            System.out.println("\nIteration: " + iteration);
            System.out.println("xl= " + xl);
            System.out.println("xu= " + xu);
            xr = (xl + xu) / 2;
            xrs[i] = xr;

            if (function(xl) * function(xr) < 0) {
                xu = xr;
            } else if (function(xr) * function(xu) < 0) {
                xl = xr;
            } else {
                i = xrs.length - 1;
            }


            System.out.println("xr= " + xr);
            if (i != 0) {
                ea = Math.abs((xrs[i] - xrs[i - 1]) / xrs[i] * 100);
                System.out.printf("Ea = %.2e%c\n", ea, '%');
            }
        }//end of for

        System.out.println("\nDrag coefficient: " + xr);
    }//end of main

    public static double function(double x) {
        double y = (9.81 * 68.1 / x) * (1 - Math.exp(-(x * 10 / 68.1))) - 40;
        return y;
    }//end of function

}//end of class
