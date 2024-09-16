package TimeSpaceComplexity;
import java.util.*;
public class ArrayIntersection {
    public static void main(String args[]){
        int arr1[]=new int[]{2,6,8,5,4,3};
        int arr2[]=new int[]{2,3,4,7};

        Intersect(arr1,arr2);
    }

    public static void Intersect(int arr1[],int arr2[]){
        HashSet<Integer> set=new HashSet<Integer>();

        Arrays.sort(arr1);
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }

        for(int i=0;i<arr2.length;i++){
            if(set.contains(arr2[i])){
                System.out.print(arr2[i]+" ");
            }
        }
    }
}
