public class CheckPalindrome {
    public static void main(String[] args) {
        //abbba
        //bbba
        //bba
        //ba
        //a

        System.out.println(IsPalindrome("abbbac"));
        System.out.println(IsPalindromeRecursion("abbba",0,4));
    }

    public static Boolean IsPalindrome(String input){
        if(input.length()<=1){
            return true;
        }

        int leftIndex=0;
        int rightIndex=input.length()-1;

        while(leftIndex<=rightIndex){
            if(input.charAt(leftIndex)!=input.charAt(rightIndex)){
                return false;
            }
            leftIndex++;
            rightIndex--;
        }

        return true;
    }

    //Do not use substring because it create a new substring 
    public static Boolean IsPalindromeRecursion(String input,int start,int end){
        
        if(start<=end){
            return true;
        }

        if(input.charAt(start)!=input.charAt(end)){
            return false;
        }

        return IsPalindromeRecursion(input,start+1,end-1);
    }
}
