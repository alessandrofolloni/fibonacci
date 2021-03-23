package pkg1;
/**
 * Write a program to display the first n numbers of the Fibonacci series.
 *
 * @author Nicola Bicocchi
 */

public class Fibonacci {
    public static final int n = 50;
    public static void main(String [] args){
        long []f= new long[n];
        f[0]=0;
        f[1]=1;

        for(int i =2;i<n;i++) {
            f[i]=f[i-1]+f[i-2];
        }

        for(int i=0;i<n;i++){
            System.out.printf("n=%d fibonacci=%d \n", i, f[i]);
        }
    }
}
