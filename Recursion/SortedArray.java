public class SortedArray {
    public static void main(String args[]){
        int arr1[]=new int[]{1,2,56,-1,6};
        int arr2[]=new int[]{1,2,3,4,5};

        boolean result=findSortedRecursion(arr1,1);
        System.out.println(result);
    }

    public static boolean findSortedRecursion(int arr[],int index){
        if(index==arr.length){
            return true;
        }

        if(arr[index]<arr[index-1]){
            return false;
        }

        return findSortedRecursion(arr, index+1);
    }
}
