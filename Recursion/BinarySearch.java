public class BinarySearch {
    public static void main(String args[]){
        int arr[]=new int[]{1,2,3,4,5,6,7};
        int target=2;
        System.out.println(BinarySearchIterative(arr,target));
        System.out.println(BinarySearchRecursion(arr,target,0,6));
    }

    public static int BinarySearchRecursion(int arr[],int target,int leftIndex,int rightIndex){
        if(leftIndex>rightIndex){
            return -1;
        }

        int mid=(leftIndex+rightIndex)/2;

        if(arr[mid]==target){
            return mid;
        }
        else if(arr[mid]>target){
           return BinarySearchRecursion(arr, target, leftIndex, mid-1);
        }else{
           return BinarySearchRecursion(arr, target, mid+1, rightIndex);
        }
    }

    public static int BinarySearchIterative(int arr[],int target){
        int firstIndex=0;
        int lastIndex=arr.length-1;

        while(firstIndex<lastIndex){
            int mid=firstIndex+lastIndex;

            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                lastIndex=mid-1;
            }else{
                firstIndex=mid+1;
            }
        }

        return -1;
    }
}
