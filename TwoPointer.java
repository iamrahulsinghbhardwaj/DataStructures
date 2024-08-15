class TwoPointer{

    public static void main(String[] args){
        int arr[]=new int[]{1,2,3,4,5};
        int target=2;
        System.out.println(Sum(arr,target));
       
    }

    public static boolean Sum(int arr[],int target){
        int l=0;
        int r=arr.length-1;

        while (l<r) {
            int sum=arr[l]+arr[r];

            if(sum==target){
                return true;
            }else if(sum>target){
                r--;
            }else{
                l++;
            }
        }

        return false;
    }
}