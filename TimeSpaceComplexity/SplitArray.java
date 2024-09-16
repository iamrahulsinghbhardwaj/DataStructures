package TimeSpaceComplexity;

public class SplitArray {
    public static void main(String args[]){
        int arr[]=new int[]{1,4,3};
        System.out.println(Split(arr,0,0,0));
    }

    public static boolean Split(int arr[],int index,int leftSum,int rightSum){
        
        if(index>=arr.length){
            return leftSum==rightSum;
        }

        if(arr[index]%3==0){
            leftSum+=arr[index];
        }
        if(arr[index]%5==0){
            rightSum+=arr[index];
        }
        if(arr[index]%3!=0 && arr[index]%5!=0){
            boolean leftAnswer=Split(arr,index+1,leftSum+arr[index],rightSum);
            boolean rightAnswer=Split(arr, index+1, leftSum, rightSum+arr[index]);

            return leftAnswer || rightAnswer;
        }

        return Split(arr,index+1,leftSum,rightSum);
    }
}
