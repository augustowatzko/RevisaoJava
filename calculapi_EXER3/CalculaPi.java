/*
pi/4 = 1 - 1/3 + 1/5 - 1/7 + 1/9...
*/


package calculapi_EXER3;

public class CalculaPi {
    public static void main (String[] args){
        double pi = 0;
        double n = 0;

        while(true)

        {
            pi += (Math.pow(-1, n) * 4.0) / (2 * n + 1);
            System.out.println(pi);
            n++;
        }
    }
}
