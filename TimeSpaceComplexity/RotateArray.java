package TimeSpaceComplexity;

public class RotateArray {
    public static void main(String args[]){
        int arr[]=new int[]{1,2,3,4,5,6};
        int reverse=2;

        int ansArray[]=Rotate(arr,reverse);

        for(int x: ansArray){
            System.out.print(x+" ");
        }

        System.out.println();

        int arr2[]=new int[]{5,6,1,2,3,4};
        System.out.println(ArrayRotateCheck(arr2));
    }


    public static int ArrayRotateCheck(int arr[]){
        if(arr.length<=1){
            return 0;
        }

        int leftIndex=0;
        int rightIndex=arr.length-1;

        if(arr[leftIndex]<=arr[rightIndex]){
            return 0;
        }
        
        while(leftIndex<=rightIndex){
            int mid=(leftIndex+rightIndex)/2;

            if(mid<arr.length-1 && arr[mid]>arr[mid+1]){
                return mid+1;
            }

            if(mid>0 && arr[mid]<arr[mid-1]){
                return mid;
            }

            if(arr[mid]>arr[rightIndex]){
                leftIndex=mid+1;
            }else{
                rightIndex=mid-1;
            }
        }

        return 0;
    }

    public static int[] Rotate(int arr[],int reverse){
        
        if(reverse>arr.length){
            reverse=reverse%arr.length;
        }

        Reverse(arr,0,reverse-1);
        Reverse(arr,reverse,arr.length-1);
        Reverse(arr,0,arr.length-1);

        return arr;
    }

    public static void Reverse(int arr[],int leftIndex,int rightIndex){
        while (leftIndex<rightIndex) {
            int temp=arr[leftIndex];
            arr[leftIndex]=arr[rightIndex];
            arr[rightIndex]=temp;   
            leftIndex++;
            rightIndex--;
        }
    }
}
