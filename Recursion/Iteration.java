public class Iteration {
    public static void main(String args[]){

        RecursionAscending(1,100);
        System.out.println();
        RecursionDescending(1,100);
    }

    public static void RecursionAscending(int start,int end){
        if(start>end){
            return;
        }
        System.out.print(start+" ");
        RecursionAscending(start+1,end);
    }

    public static void RecursionDescending(int start,int end){
        if(end<start){
            return;
        }

        System.out.print(end+" ");
        RecursionDescending(start,end-1);
    }
}
