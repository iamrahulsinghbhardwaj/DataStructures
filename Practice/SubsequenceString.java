public class SubsequenceString {
    public static void main(String args[]){
        String ans[]=FindSubsequence("abc");

        for(String finalAns: ans){
            System.out.println(finalAns);
        }
    }


    public static String[] FindSubsequence(String input){
        if(input.length()==0){
            return new String[]{""};
        }

        String smallAnswer[]=FindSubsequence(input.substring(1));
        String finalSubsequence[]=new String[smallAnswer.length*2];

        int index=0;

        for(int i=0;i<smallAnswer.length;i++){
            finalSubsequence[index]=smallAnswer[i];
            index++;
        }

        for(int i=0;i<smallAnswer.length;i++){
            finalSubsequence[index]=input.charAt(0)+finalSubsequence[i];
            index++;
        }

        return finalSubsequence;
    }
}
