import java.util.Scanner;

public class StringToInteger {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		System.out.println(ConvertStringToInt(input,input.length()-1));
        scanner.close();
    }

    //Recusrion First then the logic
    public static int ConvertStringToInt(String input,int index){

        if(index<0){
            return 0;
        }

        int reamainingNumber=ConvertStringToInt(input, index-1);
        return reamainingNumber*10+(input.charAt(index)-'0');
	}
}
