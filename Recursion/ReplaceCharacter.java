import java.util.Scanner;

public class ReplaceCharacter {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
		String input = s.next();
		char c1 = s.next().charAt(0);
		char c2 = s.next().charAt(0);
		s.close();
		System.out.println(ReplaceCharacterRecursive(input, c1, c2));
    }

    public static String ReplaceCharacterRecursive(String input, char c1, char c2) {
        return ReplaceCharacterRecursive(input,c1,c2,"");
    }

    private static String ReplaceCharacterRecursive(String input,char c1,char c2,String finalString){
		if(input.length()==0){
			return finalString;
		}

		if(input.charAt(0)==c1){
			finalString=finalString+c2;
		}else{
			finalString=finalString+input.charAt(0);
		}

		return ReplaceCharacterRecursive(input.substring(1),c1,c2,finalString);
	}
}
