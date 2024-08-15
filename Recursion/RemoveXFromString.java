public class RemoveXFromString{
    public static void main(String args[]){

        ScannerClass sc=new ScannerClass();
        String input=sc.readLine();
        String result=RecursionX(input,"");
        System.out.print(result);
    }

    public static String RecursionX(String input,String ans){
        if(input.length()==0){
            return ans;
        }
        if(input.charAt(0)!='x'){
            ans+=input.charAt(0);
        }
        //rahulsingh
        return RecursionX(input.substring(1,input.length()), ans);
    }
}
