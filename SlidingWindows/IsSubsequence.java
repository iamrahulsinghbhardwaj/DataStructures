public class IsSubsequence {
    public static void main(String[] args) {
        System.out.println(isSubsequence("b","c"));
    }

    public static boolean isSubsequence(String str1,String str2){
        //abc
        //ahbgdc

        if(str1.length()==0 || str2.length()==0){
            return false;
        }

        int leftIndex=0;
        int rightIndex=0;

        while(leftIndex<str1.length() && rightIndex<str1.length()){
            if(str1.charAt(leftIndex)==str1.charAt(rightIndex)){
                leftIndex++;
            }
            rightIndex++;
        }

        return leftIndex==str1.length();

    }
}
