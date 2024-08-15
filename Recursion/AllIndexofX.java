public class AllIndexofX {
    public static void main(String args[]){
        int[] arr = {1, 2, 3, 2, 4, 2, 5};
        int target = 2;
        
        int[] indices = findIndices(arr, target);
        
        System.out.print("Indices of " + target + ": ");
        for (int index : indices) {
            System.out.print(index + " ");
        }
    }

    public static int[] findIndices(int arr[],int target){
        return findIndices(arr, target,0,0);
    }

    private static int[] findIndices(int input[],int target,int index,int count){
        if(index==input.length){
            return new int[count];
        }
        
        if(input[index]==target){
            int output[]=findIndices(input, target,index+1,count+1);
            output[count]=index;
            return output;        
        }else{
            return findIndices(input,target,index+1,count);
        }
    }
}
