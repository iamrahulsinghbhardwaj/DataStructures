import java.util.Scanner;
public class CalculatePower {
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       double x=sc.nextDouble();
       double n=sc.nextDouble();
       sc.close();
       
       System.out.println(mypow(x,n));
    }

    public static double mypow(double x,double n){
        if(n==0) return 1;
        if(x==0) return 1;

        //if n value is very big
        if(n==Integer.MIN_VALUE){
            x=x*x;
            n=n/2;
        }

        //if n is negative
        if(n<0){
            x=1/x;
            n=-n;
        }

        if(n%2==0){
            return mypow(x*x, n/2);
        }else{
            return x*mypow(x*x, n/2);
        }
    }

}
