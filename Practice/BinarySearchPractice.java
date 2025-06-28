
public class BinarySearchPractice {

    public static void main(String[] args) {
        int input[] = new int[]{1, 2, 3, 4};
        int target = 4;

        int index = RecursiveBinarySearch(input, target, 0, input.length - 1);
        System.out.println(index);
    }

    public static int RecursiveBinarySearch(int input[], int target, int startIndex, int lastIndex) {
        if(lastIndex<startIndex){
            return -1;
        }

        int mid = startIndex + ((lastIndex - startIndex) / 2);

        if (input[mid] == target) {
            return mid;
        } else if (input[mid] > target) {
            return RecursiveBinarySearch(input, target, startIndex, mid - 1);
        } else {
            return RecursiveBinarySearch(input, target, mid + 1, lastIndex);
        }
    }
}
