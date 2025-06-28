package DP;

public class LCS {
    public static void main(String args[]){
        String s="abcdsfdsfd";
        String t="bctdfsdfdsfd";

        System.out.println("Answer is "+LcsDP(s,t));
        System.out.println("Answer is "+LcsM(s,t));
        System.out.println("Answer is "+Lcs(s,t));
        
    }

    public static int LcsM(String s,String t){
        int m=s.length();
        int n=t.length();

        int memo[][]=new int[m+1][n+1];

        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){
                memo[i][j]=-1;
            }
        }


        return LcsM(s,t,0,0,memo);
    }

    public static int LcsM(String s,String t,int i,int j,int memo[][]){

        if(i==s.length() || j==t.length()){
            return 0;
        }

        if(memo[i][j]!=-1){
            return memo[i][j];
        }

        if(s.charAt(i)==t.charAt(j)){
            memo[i][j]=1+LcsM(s,t,i+1,j+1,memo);
        }else{
            int op1=LcsM(s,t,i+1,j,memo);
            int op2=LcsM(s,t,i,j+1,memo);
            memo[i][j]=Math.max(op1,op2);
        }
        return memo[i][j];
    }

    public static int Lcs(String s,String t){
        if(s.length()==0 || t.length()==0){
            return 0;
        }

        if(s.charAt(0)==t.charAt(0)){
            return 1+Lcs(s.substring(1),t.substring(1));
        }else{
            int op1=Lcs(s,t.substring(1));
            int op2=Lcs(s.substring(1),t);
            return Math.max(op1,op2);
        }
    }

    public static int LcsDP(String s,String t){
        int m=s.length();
        int n=t.length();

        //row of size m+1 and coloumn of size n+1
        int dp[][]=new int[m+1][n+1];

        for(int i=0;i<=m;i++){
            dp[i][0]=0;
        }

        for(int j=0;j<=n;j++){
            dp[0][j]=0;
        }

        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(s.charAt(i-1)==t.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }

        return dp[m][n];

    }
}
