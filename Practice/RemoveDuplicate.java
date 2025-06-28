public class RemoveDuplicate {
    public static void main(String[] args) {
        System.out.println(RemoveDuplicatesRecursive("aabccb",""));
    }

    //Visiualize the string into substrings
    //for example

    //aabccb
    //abccb
    //bccb
    //ccb
    //cb
    //b

    //Now The recussion will backtrack and we will check our logic and keep appending
    //in the output string
    public static String RemoveDuplicatesRecursive(String input, String output) {

        if(input.length()<=1){
            return output+input;
        }

        if(input.charAt(0)!=input.charAt(1)){
            output+=input.charAt(0);
        }

        return RemoveDuplicatesRecursive(input.substring(1),output);
    }
}