import java.util.Scanner;

public class CoinsVariation {
    public static void main(String args[]){
       //Given a number n find all the ways using(1,2,5) to make the sum to n
       Scanner sc=new Scanner(System.in);
       int x=sc.nextInt();
       int arr[]=new int[x + 1];
       for(int i = 0; i < x + 1; i++){
        arr[i] = -1;
       }
       //System.out.println(SumAllPath(x, arr));
       PrintSmallPath(x,"");
    }

    public static void PrintSmallPath(int x,String ans){
        if(x<=0){
            if(x==0){
                System.out.print(ans +"\n");
            }
            return;
        }

        PrintSmallPath(x-1,ans+"1");
        PrintSmallPath(x-2,ans+"2");
        PrintSmallPath(x-5,ans+"5");
    }

    public static int SumAllPath(int n ,int arr[]){
        if(n <= 0){
            return (n == 0 ? 1 : 0);
        }
        if(arr[n] != -1){
            return arr[n];
        }
        int ans = SumAllPath(n - 1, arr) + SumAllPath(n - 2, arr) + SumAllPath(n - 5, arr);
        arr[n] = ans;
        return ans;
    }
}
