package Recursion;
import java.util.Scanner;

public class FibonacciNumber{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        sc.close();
        int resultFibonacci=FindFibonacci(number);
        System.out.println(resultFibonacci);
    }

    public static int FindFibonacci(int number){
        if(number==1 || number==0){
            return number;      
        }

        return FindFibonacci(number-1)+FindFibonacci(number-2);
    }
}