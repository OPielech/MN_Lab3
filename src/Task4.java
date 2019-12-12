public class Task4 {

    public static void main(String[] args) {

        System.out.println("For of = 8.1 mg/L, T = " + function(200,300,2.09) + " K");
        System.out.println("For of = 12 mg/L, T = " + function(200,300,2.48) + " K");

    }

    public static double function(double xl, double xu, double lno){

        double yl;
        double yu;
        double yr;
        double xr=0;
        double counter = 100;


        for(int i=0;i<counter;i++) {
            xr = (xl+xu)/2;
            yl = -139.344411+((1.575701*Math.pow(10,5))/xl)-((6.642308*Math.pow(10,7))/Math.pow(xl,2))
                    +((1.243800*Math.pow(10,10))/Math.pow(xl,3)) - ((8.621946*Math.pow(10,11))/Math.pow(xl,4))-lno;
            yu = -139.344411+((1.575701*Math.pow(10,5))/xu)-((6.642308*Math.pow(10,7))/Math.pow(xu,2))
                    +((1.243800*Math.pow(10,10))/Math.pow(xu,3)) - ((8.621946*Math.pow(10,11))/Math.pow(xu,4))-lno;
            yr = -139.344411+((1.575701*Math.pow(10,5))/xr)-((6.642308*Math.pow(10,7))/Math.pow(xr,2))
                    +((1.243800*Math.pow(10,10))/Math.pow(xr,3)) - ((8.621946*Math.pow(10,11))/Math.pow(xr,4))-lno;

            if (yl*yr<0){
                xu = xr;

            }
            if(yu*yr<0){
                xl=xr;
            }

        }

        return xr;
    }
}