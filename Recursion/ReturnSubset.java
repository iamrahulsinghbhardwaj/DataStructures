import java.util.HashSet;
import java.util.Scanner;

public class ReturnSubset {

	public static int[][] Subsets(int input[],int index){
		if(index>=input.length){
			return new int[1][0];
		}

		int smallArray[][]=Subsets(input, index+1);
		int finalArray[][]=new int[2*smallArray.length][0];

		int k=0;
		for(int i=0;i<smallArray.length;i++){
			finalArray[k]=new int[smallArray[i].length];
			for(int j=0;j<smallArray[i].length;j++){
				finalArray[k][j]=smallArray[i][j];
			}
			k++;
		}

		for(int i=0;i<smallArray.length;i++){
			finalArray[k]=new int[smallArray[i].length+1];
			finalArray[k][0]=input[index];
			for(int j=1;j<=smallArray[i].length;j++){
				finalArray[k][j]=smallArray[i][j-1];
			}
			k++;
		}

		return finalArray;
	}
    
	public static void PrintSubsets(int output[],String ans,int index,HashSet<String> set){
		if(index>=output.length){
			boolean exists=set.add(ans.trim());
			if(exists){
				System.out.println(ans);
			}
			
			return;
		}

		PrintSubsets(output,ans+output[index]+" ", index+1,set);
		PrintSubsets(output, ans, index+1,set);

	}

    public static void main(String args[]){
        int[] input = TakeInput();
		int output[][] = Subsets(input,0);
		PrintSubsets(input,"",0,new HashSet<>());

		for(int i = 0; i < output.length; i++) {
			for(int j = 0; j < output[i].length; j++) {
				System.out.print(output[i][j] + " ");
			}
			System.out.println();
		} 
    }

    public static int[] TakeInput() {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
        s.close();
		return arr;
	}    
}
