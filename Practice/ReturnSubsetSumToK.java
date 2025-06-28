import java.util.*;

public class ReturnSubsetSumToK {
    public static void main(String[] args) {
        int input[]=new int[]{1,2,3};

        List<List<Integer>> result=ReturnSubset(input,0);
        

        for(List<Integer> set: result){
            for(Integer subset:set){
                System.out.print(subset+" ");
            }
            System.err.println();
        }

    }

    public static List<List<Integer>> ReturnSubset(int input[],int index){
        if(index>=input.length){
            List<List<Integer>> emptySet=new ArrayList<>();
            emptySet.add(new ArrayList<>()); //add {} set
            return emptySet;
        }

        List<List<Integer>> set=ReturnSubset(input, index+1);
        List<List<Integer>> finalSet=new ArrayList<>();

        for(List<Integer> list: set){
            finalSet.add(new ArrayList<>(list));//without adding the number

            List<Integer> newSubset=new ArrayList<>();
            newSubset.add(input[index]);    //adding the number
            newSubset.addAll(list);
            finalSet.add(newSubset);
        }

        return  finalSet;
    }
}
