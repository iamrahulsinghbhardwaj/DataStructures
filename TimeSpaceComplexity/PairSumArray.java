package TimeSpaceComplexity;
import java.util.*;
//You have been given an integer array/list(ARR) and a number 'num'. 
//Find and return the total number of pairs in the array/list which sum to 'num'.

public class PairSumArray {
    public static void main(String args[]){
        int arr[]=new int[]{1,3,6,2,5,4,3,2,4};
        int target=7;

        System.out.println(PairSum(arr,target));
    }

    public static int PairSum(int arr[],int target){
        int count=0;

        HashMap<Integer,Integer> map=new HashMap<>();
        
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i], 0)+1);
        }

        for(int i=0;i<arr.length;i++){
            int remainingNumber=target-arr[i];
            if(map.containsKey(remainingNumber)){
                if(remainingNumber==target){
                    count=count+map.get(remainingNumber)-1;
                }else{
                    count=count+map.get(remainingNumber);
                }            
            }
            map.put(arr[i],map.get(arr[i])-1); 
        }

        return count;
    }
}
