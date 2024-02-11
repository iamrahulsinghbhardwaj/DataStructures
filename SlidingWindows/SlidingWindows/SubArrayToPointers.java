package SlidingWindows;

import java.util.ArrayList;

class SubArrayTowPointers {
    public static void main(String args[]){

        int arr[]=new int[]{1,2,3,4,5,6};
        int k=3;

        //sum of array upto K numbers
        ArrayList<Integer> result=sumUpToKElements(arr,k);
      
        for (Integer integer:result) {
            System.out.println(integer);
        }

    }

    public static ArrayList<Integer> sumUpToKElements(int arr[],int k){
        ArrayList<Integer> list=new ArrayList<>();
        int currentSum=0;

        for(int i=0;i<k;i++){
            currentSum+=arr[i];
        }

        list.add(currentSum);

        for(int i=1;i<arr.length-k+1;i++){
           currentSum=currentSum-arr[i-1];
           currentSum=currentSum+arr[i+k-1];

           list.add(currentSum);
        }

        return list;
    }
}
