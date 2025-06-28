import  java.util.*;
public class SubSetSumToKPractice {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int k=7;
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> setResult=new ArrayList<>();
        
        FindSubset(arr,k,0,ans,setResult);
        System.err.println();
        PrintSubset(arr,k,0,"");

        for(List<Integer> set: ans){
            System.out.println(set);
        }

    }

    public static void PrintSubset(int arr[],int remainingSum,int index,String finalAns){
        if(index==arr.length){
            if(remainingSum==0){
                System.err.println(finalAns);
            }
            return;
        }
        
        PrintSubset(arr, remainingSum-arr[index], index+1, finalAns+arr[index]); //include the index
        PrintSubset(arr, remainingSum, index+1, finalAns);
    }

    public static void FindSubset(int arr[],int remainingSum,int index,List<List<Integer>> result,List<Integer> setResult){

        if(index==arr.length){
            if(remainingSum==0){
                result.add(new ArrayList<>(setResult));
            }
            return;
        }
 
        //add the element
        setResult.add(arr[index]);
        FindSubset(arr, remainingSum-arr[index], index+1, result, setResult);

        //exclude the number
        setResult.remove(setResult.size()-1); //backtrack
        FindSubset(arr, remainingSum, index+1, result, setResult);
    }

}
