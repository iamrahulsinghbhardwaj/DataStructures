public class PrintSubsequence {
    public static void main(String args[]){
        //SubsequenceRecursion("abc","");
        System.out.println();
        String[] results=ReturnSubsequence("abc",0);

        for(String result:results){
            System.out.println(result);
        }
    }

    //Example
    //abc

    //bc
    //"",b,c,bc
    public static String[] ReturnSubsequence(String input,int stringIndex){
        if(stringIndex>=input.length()){
            return  new String[]{""};
        }

        String[] smallAns=ReturnSubsequence(input, stringIndex+1);
        String[] finalArray=new String[smallAns.length*2];
        int index=0;

        for(int i=0;i<smallAns.length;i++){
            finalArray[index++]=smallAns[i];
        }

        for(int i=0;i<smallAns.length;i++){
            finalArray[index++]=input.charAt(stringIndex)+smallAns[i];
        }
        
        return finalArray;
    }

    public static void SubsequenceRecursion(String input,String output){
        if(input.length()==0){
            System.out.println(output);
            return;
        }

        //Do not include the character
        SubsequenceRecursion(input.substring(1),output);
        //include the character
        SubsequenceRecursion(input.substring(1),input.charAt(0)+output);
    }
}
