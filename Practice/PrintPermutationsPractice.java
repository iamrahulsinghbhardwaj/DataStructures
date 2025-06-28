public class PrintPermutationsPractice {
    public static void main(String[] args) {
        String input="abc";

        PrintPermutations(input,0,"");
    }

    public static void PrintPermutations(String input,int index,String finalAns){
        if(index>=input.length()){
            System.out.println(finalAns);
            return;
        }

        for(int i=0;i<input.length();i++){
            PrintPermutations(input, index+1, input.charAt(i)+finalAns);
        }

    }
}