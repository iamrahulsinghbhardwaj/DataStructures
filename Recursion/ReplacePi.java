import java.util.Scanner;
//Given a string, compute recursively a new string where all appearances of "pi" have been replaced by "3.14".
public class ReplacePi {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        System.out.println(replace(input));

    }

    public static String removeX(String input){
        return removeX(input);
    }


    public static String replace(String input) {
        return replace(input, "");
    }

    public static String replace(String input, String finalString) {
        if(input.length()<=1){
            return input;
        }

        String outputString=replace(input.substring(1),finalString);

        if(input.charAt(0)=='p' && outputString.charAt(0)=='i'){
            finalString="3.14"+outputString.substring(1);
        }else{
            finalString=input.charAt(0)+outputString;
        }

        return finalString;
}

}
