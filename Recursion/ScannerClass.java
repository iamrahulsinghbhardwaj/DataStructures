import java.util.Scanner;

public class ScannerClass {
    private Scanner scanner;

    public ScannerClass(){
        this.scanner=new Scanner(System.in);
    }

    public String readLine(){
        return scanner.nextLine();
    }

    public int readInt(){
        return scanner.nextInt();
    }

    public void printString(Object obj){
        System.out.println(obj.toString());
    }
}
