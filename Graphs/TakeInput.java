package Graphs;
import java.util.*;

public class TakeInput {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int v=sc.nextInt(); //no of vertex
        int e=sc.nextInt(); // no of edges

        int edges[][]=new int[v][v];
        for(int i=0;i<e;i++){
            int fv=sc.nextInt();
            int sv=sc.nextInt();
            edges[fv][sv]=1;
            edges[sv][fv]=1;
        }

        print(edges); 
    }

    public static void print(int edges[][]){
        boolean visited[]=new boolean[edges.length];
        for(int i=0;i<edges.length;i++){
            if(!visited[i]){
                printHelper(edges,i,visited);
            }
        }
    }

    public static void printHelper(int edges[][],int sv,boolean visited[]){
        System.out.println(sv);
        visited[sv]=true;

        int n=edges.length;
        for(int i=0;i<n;i++){
            if(edges[sv][i]==1 && !visited[i]){
                printHelper(edges,i,visited);
            }
        }
    }
}


//0.9195