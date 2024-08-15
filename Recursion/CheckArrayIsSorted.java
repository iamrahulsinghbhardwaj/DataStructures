public class CheckArrayIsSorted {
    public static void main(String args[]){
        int firstArray[]=new int[]{1,2,3,4,5};
        int secondArray[]=new int[]{2,1,-9,33};

        System.out.println(SmallerProblemFirstCheckSort(secondArray));
        System.out.println(CheckSortedBetter(secondArray));
    }

    //There are two approaches 
    //1->Solve the smaller problem first
    //2->Solve the samller prioblem later

    public static boolean CheckSortedBetter(int arr[]){
        return CheckSortedBetter(arr,0);
    }
    
    private static boolean CheckSortedBetter(int arr[],int startIndex){      
        
        if(startIndex>=arr.length-1){
            return true;
        }

        if(arr.length<=1){
            return true;
        }

        if(arr[startIndex]>arr[startIndex+1]){
            return false;
        }

        return CheckSortedBetter(arr, startIndex+1);
    }

    public static boolean SmallerProblemFirstCheckSort(int arr[]){
        if(arr.length<=1){
            return true;
        }

        if(arr[0]>arr[1]){
            return false;
        }

        int tempArray[]=new int[arr.length-1];
        for(int i=1;i<arr.length;i++){
            tempArray[i-1]=arr[i];
        } 

        return SmallerProblemFirstCheckSort(tempArray);
    }
    public static boolean CheckSorted(int arr[]){
        if(arr.length<=1){
            return true;
        }

        int tempArray[]=new int[arr.length-1];

        for(int i=1;i<arr.length;i++){
            tempArray[i-1]=arr[i];
        }
        boolean result=CheckSorted(tempArray);

        if(!result){
            return false;
        }

        if(arr[0]>arr[1]){
            return false;
        }else{
            return true;
        }
    }
}
