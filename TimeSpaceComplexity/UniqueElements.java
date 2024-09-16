package TimeSpaceComplexity;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class UniqueElements {
    public static void main(String args[]){
        int arr[]=new int[]{1,3,2,4,5,6,6,5,3,2,1,1,6,6};

        System.out.println(FindUniqueHashMap(arr));
        System.out.println(FindUniqueHashSet(arr));
        System.out.println(FindUniqueXor(arr));

        int duplicateArray[]=new int[]{0,7,2,5,4,7,1,3,6};
        System.out.println(FindDuplicate(duplicateArray));
    }
   
    public static int FindDuplicate(int arr[]){
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }

        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            if(entry.getValue()>1){
                return entry.getKey();
            }
        }

        return -1;
    }

    //Using XOR
    //The XOR approach works perfectly for finding a unique element in an array where every other element appears exactly twice.
    public static int FindUniqueXor(int arr[]){
        //XOR between two different number gives a unique number which shows the bit difference between them

        int unique=0;

        for(int i=0;i<arr.length;i++){
            unique=unique^arr[i];
        }

        return unique;
    }

    //Using set
    //This approach only works for even frequency of a number
    public static int FindUniqueHashSet(int arr[]){
        HashSet<Integer> set=new HashSet<>();

        for(int i=0;i<arr.length;i++){
            if(set.contains(arr[i])){
                set.remove(arr[i]);
            }else{
                set.add(arr[i]);
            }
        }

        return set.iterator().next();
    }

    //Using HashMap
    public static int FindUniqueHashMap(int arr[]){
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }

        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            if(entry.getValue()==1){
                return entry.getKey();
            }
        }

        return -1;
    }
}
