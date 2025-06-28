import java.util.Scanner;

public class TicTacToe {

    public static char[][] board=new char[3][3];
    public static char currentPlayer='X';

    public static void main(String[] args) {
        
        initilize();
        while(true){
            print();
            takeInput();
            if(isWinner()){
                print();
                System.out.println("Player " + currentPlayer + " wins!");
                break;
            }
            if(boardFull()){
                print();
                System.out.println("The game is a tie!");
                break;
            }
            switchPlayer();
        }

    }

    public static void switchPlayer(){
        currentPlayer=(currentPlayer=='X') ? 'O':'X';
    }

    public static boolean boardFull(){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(board[i][j]==' '){
                    return false;
                }
            }
        }

        return true;
    }

    public static boolean isWinner(){
        //check rows and column
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if((board[i][0]==currentPlayer && board[i][1]==currentPlayer && board[i][2]==currentPlayer) 
                || board[0][i]==currentPlayer && board[1][i]==currentPlayer && board[2][i]==currentPlayer){
                    return true;
                }
            }
        }

        //check diagonal
        if ((board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) ||
        (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer)) {
        return true;}

        return false;
    }

    public static void print() {
        System.out.println("---------");
        for(int i = 0; i < 3; i++) {
            System.out.print("| ");
            for(int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println("\n---------");
        }
        System.out.println("Player " + currentPlayer + "'s turn. Enter row (0-2) and column (0-2):");
    }

    public static void takeInput(){
        Scanner sc=new Scanner(System.in);
        int row,col;
        row=sc.nextInt();
        col=sc.nextInt();

        while(true){
            if(row>=0 && row<3 || col>=0 && col<3 && board[row][col]!=currentPlayer){
                board[row][col]=currentPlayer;
                break;
            }else{
                System.out.println("Invalid input");
            }
        }
    }

    public static void initilize(){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                board[i][j]=' ';
            }
        }
    }
}
