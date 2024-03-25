package Recursion;
import java.util.Scanner;

public class Factorial {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        sc.close();
        int resultFactorial=FindFactorial(number);
        System.out.println(resultFactorial);
    } 

    public static int FindFactorial(int number){
        if(number<=1){
            return number;
        }
        return number*FindFactorial(number-1);
    }
}


