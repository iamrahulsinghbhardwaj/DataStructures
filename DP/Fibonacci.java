package DP;
public class Fibonacci {
    
    public static int fib(int n){

        if(n==0 || n==1){
            return n;
        }

        return fib(n-1)+fib(n-2);
    }

    //DP using memoization
    public static int fibM(int n){
        int arr[]=new int[n+1];
        for(int i=0;i<arr.length;i++){
            arr[i]=-1;
        }

        return fibM(n,arr);
    }

    public static int fibM(int n,int arr[]){
        if(n==0 || n==1){
            arr[n]=n;
            return n;
        }
        if(arr[n]!=-1){
            return arr[n];
        }

        arr[n]=fibM(n-1,arr)+fibM(n-2,arr);
        return arr[n];
    }

    public static int fibDp(int n){
        int arr[]=new int[n+1];
        arr[0]=0;
        arr[1]=1;

        for(int i=2;i<=n;i++){
            arr[i]=arr[i-2]+arr[i-1];
        }
        return arr[n];
    }

    public static void main(String args[]){
        System.out.println(fibM(100));
        System.out.println(fibDp(100));
        System.out.println(fib(100));
    }
}
