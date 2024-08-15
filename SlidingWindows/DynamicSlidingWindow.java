import java.util.HashSet;

class DynamicSlidingWindow {
    public static void main(String args[]){
        //Smallest subarray with sum is equal to k
        int arr[]=new int[]{1,2,3,4,5,6};
        int k=18;

        int answer=shortestSum(arr,k);
        System.out.println(answer);

        //System.out.println(lengthOfLongestSubstring(" ")); 
    }

     public static int lengthOfLongestSubstring(String s) {
        int start=0,end=0;
        int maxLength=0;

        HashSet<Character> set=new HashSet<>();

        while(start<s.length() && end<s.length()){
            if(set.contains(s.charAt(end))){             
                start=start+1;
                end=start;
            }else{
                set.add(s.charAt(end));
            }
            end++;
            maxLength=Math.min(maxLength,(end-start));
        }

        return maxLength;
    }

    public static int shortestSum(int arr[],int k){
        int minLength=Integer.MAX_VALUE;

        int currentSum=0;
        int start=0;
        int end=0;

        while(end<arr.length){
            currentSum=currentSum+arr[end];
            end++;

            while(start<end && currentSum>=k){
                currentSum=currentSum-arr[start];
                start++;
            }

            Math.min(minLength,end-start+1);
        }
        return minLength;
    }
}
