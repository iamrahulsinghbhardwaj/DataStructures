import java.util.*;
public class PrintSubsetSumToK {
    public static void main(String[] args) {
        // Main method to test the subset sum functionality
        int[] arr = {5, 12, 3, 17, 1, 18, 15, 3, 17};
        int k = 6;

        // 3 3
        // 5 1

        PintSubsetsSumToK(arr, k);
    }

    private static void PintSubsetsSumToK(int[] input, int k) {
        Arrays.sort(input);

        for(int i=0;i<input.length;i++){
            CheckSum(input,i,k);
        }     
    }

    private static void CheckSum(int[] input,int index,int k){
        int startIndex=index;
        int endIndex=input.length-1;

        while(startIndex<=endIndex){
            if((input[startIndex]+input[endIndex])==k){
                System.out.println(input[startIndex]+" "+input[endIndex]);
            }

            else if((input[startIndex]+input[endIndex])<k){
                startIndex++;
            }else{
                endIndex--;
            }
        }
    }
}