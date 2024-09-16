import java.util.Scanner;

public class ReturnAllCodes {

    public static  String[] GetCode(String input){
		
	}
	
    public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.next();
		String output[] = GetCode(input);
		for(int i = 0; i < output.length; i++) {
			System.out.println(output[i]);
		}
	}
}
