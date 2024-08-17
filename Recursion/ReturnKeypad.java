import java.util.Scanner;

public class ReturnKeypad {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();
        String ans[]=FindKeypad(input);

        for (String string : ans) {
            System.out.println(string);
        }

        sc.close();
    }

    //solve problem for one
    //eg 234 in case of no it is easy to solve from backtracking so break the no and solve it from 4

    public static String[] FindKeypad(int input){
        if(input==0){
            return new String[]{""};
        }

        int newDigit=input/10;
        int lastDigit=input%10;

        String smallans[]=FindKeypad(newDigit);
        String charArray[]=HelperKeypad(lastDigit);
        String finalString[]=new String[charArray.length*smallans.length];

        int finalStringIndex=0;

        for(int i=0;i<smallans.length;i++){
            for(int j=0;j<charArray.length;j++){
                finalString[finalStringIndex++]=charArray[j]+smallans[i];
            }
        }

        return finalString;
    }

    public static String[] HelperKeypad(int digit){
        switch(digit){
            case 2:
            return new String[]{"a","b","c"};
            case 3:
            return new String[]{"d","e","f"};
            case 4:
            return new String[]{"g","h","i"};
            case 5:
            return new String[]{"j","k","l"};
            case 6:
            return new String[]{"m","n","o"};
            case 7:
            return new String[]{"p","q","r","s"};
            case 8:
            return new String[]{"t","u","v"};
            case 9:
            return new String[]{"w","x","y","z"};
            default:
            return new String[]{};
        }
    }
}