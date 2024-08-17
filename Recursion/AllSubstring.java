public class AllSubstring {
    public static void main(String args[]){
        PrintAllSubstring("xyz","",0);
        PrintAllParanthesis(4,0,0,"");
        //Print all valid Paranthesis
        //n=1 ()
        //n=2 (()) ()()
        //n=3 ()()(), (())()
        //  ()(())
        //  ((()))
    }

    public static void PrintAllParanthesis(int input,int open,int close,String ans){
        
        if(close>open || open>input){
            return ;
        }

        if(open==close && open==input){
            System.out.println(ans);
            return;
        }

        PrintAllParanthesis(input,open+1,close,ans+"(");
        PrintAllParanthesis(input,open,close+1,ans+")");
    }

    public static void PrintAllSubstring(String input,String ans,int index){
        if(input.length()==index){
            System.out.println(ans);
            return;
        }

        PrintAllSubstring(input,input.charAt(index)+ans, index + 1);
        PrintAllSubstring(input,ans,index+1);
    }
}
