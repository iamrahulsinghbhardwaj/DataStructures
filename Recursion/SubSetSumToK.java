import java.util.Scanner;

public class SubSetSumToK {
    static Scanner s = new Scanner(System.in);

    public static void PrintSubsetsSumTok(int input[], int k) {
        PrintSubsetsSumTok(input,0, k, "");
    }

    public static void PrintSubsetsSumTok(int input[],int index, int k, String subSets) {
        if (index >= input.length) {
            if (k == 0) {
                System.out.println(subSets);
            }
            return;
        }

        PrintSubsetsSumTok(input, index + 1, k, subSets);
        PrintSubsetsSumTok(input, index + 1, k - input[index], subSets + input[index]+" ");
    }

    public static void main(String args[]) {
        int[] input = takeInput();
        int k = s.nextInt();
        PrintSubsetsSumTok(input, k);
    }

    public static int[] takeInput() {
        int size = s.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        return arr;
    }
}
