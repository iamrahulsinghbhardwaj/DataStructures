
import java.util.ArrayList;
import java.util.List;
import  java.util.*;

public class SubsetArray {
    public static void main(String[] args) {
        //15 20 12
        //[]
        int arr[]=new int[]{1,1,2};
        HashSet<String> uniqueSet=new HashSet<>();
        PrintUniqueSubsets(arr,0,"",uniqueSet);
        
        System.out.println();

        List<List<Integer>> data=ReturnSubset(arr,0);

        for(List<Integer> set: data){
            for(Integer subSet:set){
                System.out.print(subSet+" ");
            }
            System.out.println();
        }
    }

    public static void PrintUniqueSubsets(int arr[],int index,String result,HashSet<String> set){
        if(index>=arr.length){
            if(!set.contains(result)){
                System.out.println(result);
                set.add(result);
            }   
            return;
        }

        PrintUniqueSubsets(arr, index+1, result+" "+arr[index],set);
        PrintUniqueSubsets(arr, index+1, result,set);
    }

    public static List<List<Integer>> ReturnSubset(int arr[],int index){
        if(index>=arr.length){
            List<List<Integer>> emptySet=new ArrayList<>();
                emptySet.add(new ArrayList<>());
                return emptySet; 
        }

        List<List<Integer>> smallAns=ReturnSubset(arr, index+1);
        List<List<Integer>> finalAns=new ArrayList<>();

        for(List<Integer> set: smallAns) {
            finalAns.add(new ArrayList<>(set)); //adding without the current element
            List<Integer> setList=new ArrayList<>();
            setList.add(arr[index]); //adding the current element of the array
            setList.addAll(set);
            finalAns.add(setList);
        }
        return finalAns;
    }
    
}
