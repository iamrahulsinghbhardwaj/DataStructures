import java.util.ArrayList;

class SubArrayTowPointers {
    public static void main(String args[]){

        int arr[]=new int[]{1,2,3,4,5,6};
        int k=3;
        ArrayList<Integer> result=sumUpToKElements(arr,k);
        
        for (Integer integer:result) {
            System.out.println(integer);
        }
    }

    public static ArrayList<Integer> sumUpToKElements(int arr[],int k){

        ArrayList<Integer> result=new ArrayList<>();
        if(k>arr.length){
            return result;
        }

        int currentSumArray=0;

        for(int i=0;i<k;i++){
            currentSumArray+=arr[i];
        }

        result.add(currentSumArray);

        for(int i=1;i<arr.length-k+1;i++){
            currentSumArray=currentSumArray-arr[i-1];
            currentSumArray=currentSumArray+arr[i+k-1];

            result.add(currentSumArray);
        }

        return result;
    }
}
