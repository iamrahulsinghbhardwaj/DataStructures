public class ReplaceCharacterRecursive {
    public static void main(String[] args) {
        System.out.println(ReplaceCharacters("rahul",'r','a',""));
    }

    

    public static String ReplaceCharacters(String input,char source,char destination,String output){
        if(input.length()<=0){
            return output;
        }
        
        output += input.charAt(0) == source ? destination : input.charAt(0);
        
        return ReplaceCharacters(input.substring(1),source,destination,output);
    }
}