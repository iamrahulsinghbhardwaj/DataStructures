


public class ReturnKeypadPractice {
    public static void main(String[] args) {
        int input=23;

        PrintKeypad(input,"");
        System.out.println();
        String[] answer=ReturnKeypad(input);


        for(String finalAnswer: answer){
            System.out.println(finalAnswer);
        }

    }

    public static void PrintKeypad(int input,String finalAns){
        if(input<=0){
            System.out.println(finalAns);
            return;
        }

        char[] charArray=HelperString(input%10);

        for(int i=0;i<charArray.length;i++){
            PrintKeypad(input/10, finalAns+charArray[i]);
        }
    }

    public static char[] HelperString(int data){
        switch (data) {
            case 2 ->{
                char[] charArray={'a','b','c'};
                return  charArray;
            }
            case 3 -> {
                char[] charArray={'d','e','f'};
                return  charArray;
            }
            case 4 -> {
                char[] charArray={'i','j','k'};
                return  charArray;
            }
            case 5 -> {
                char[] charArray={'l','m','n'};
                return  charArray;
            }
            case 6 -> {
                char[] charArray={'o','p','q'};
                return  charArray;
            }
            case 7 -> {
                char[] charArray={'r','s','t'};
                return  charArray;
            }
            case 8 -> {
                char[] charArray={'u','v','w'};
                return  charArray;
            }
            case 9 -> {
                char[] charArray={'x','y','z'};
                return  charArray;
            }
            default -> {
            }
        }

        char[] charArray={};
        return charArray;
    }

    public static String[] ReturnKeypad(int input){
        if(input<=0){
            String[] ans={""};
            return  ans;
        }

        String[] smallAns=ReturnKeypad(input/10);
        char[] inputChar=HelperString(input%10);

        String[] finalAns=new String[smallAns.length*inputChar.length];
        int index=0;

        for(int i=0;i<inputChar.length;i++){
            for(int j=0;j<smallAns.length;j++){
                finalAns[index]=inputChar[i]+smallAns[j];
                index++;
            }
        }

        return finalAns;
    }
}
