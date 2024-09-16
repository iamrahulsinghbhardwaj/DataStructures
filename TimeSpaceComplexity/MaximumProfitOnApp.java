package TimeSpaceComplexity;
import java.util.*;

public class MaximumProfitOnApp {
    public static void main(String args[]){
        int arr[]=new int[]{30,20,53,14};
        System.out.println(MaximumProfit(arr));
    }

    public static int MaximumProfit(int arr[]){
        if(arr.length<=1){
            return arr[0];
        }

        Arrays.sort(arr);
        int maxProfit=0;

        for(int i=0;i<arr.length;i++){
            int profitIndex=arr[i]*(arr.length-i);

            if(profitIndex>maxProfit){
                maxProfit=profitIndex;
            }
        }

        return maxProfit;
    }
}
