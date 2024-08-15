public class ReverseString {
    public static void main(String args[]){
        System.out.println(ReverseStringRecursive("RahulSinghBhardwaj",17));
        System.out.println(ReverseStringRecursive("AvnishKumar",10));
    }

    public static String ReverseStringRecursive(String input,int index){
        if(index<0){
            return "";
        }
        return input.charAt(index) + ReverseStringRecursive(input,index-1);

    }
}
