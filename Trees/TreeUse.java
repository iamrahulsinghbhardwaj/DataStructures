package Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TreeUse {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        TreeNode<Integer> rootNode=takeInputLevelWise(sc);
        int numberOfNodes=findNoOfNodes(rootNode);
        print(rootNode);
    }

    //Print nodes at level K
    public static void printNodeAtK(TreeNode<Integer> rootNode,int k){
        if(k<0){
            return;
        }

        if(k==0){
            System.out.print(rootNode.data);
        }

        for(int i=0;i<rootNode.children.size();i++){
            printNodeAtK(rootNode.children.get(i),k-1);
        }

    }

    //Find the number of Nodes
    public static int findNoOfNodes(TreeNode<Integer> rootNode){
       if(rootNode==null){
        return 0;
       }

       int count=1;

       for(int i=0;i<rootNode.children.size();i++){
        count+=findNoOfNodes(rootNode.children.get(i));
       }

       return count;
    }

    //Find the number of Nodes second way
    public static int findNoOfNodes(TreeNode<Integer> rootNode,int count){
        if(rootNode==null){
            return count;
        }

        count++;

        for(int i=0;i<rootNode.children.size();i++){
            count=findNoOfNodes(rootNode.children.get(i));
        }

        return count;
    }

    //we are printing as bfs
    public static void print(TreeNode<Integer> rootNode){
        if(rootNode==null){
            return;
        }

        String nodes=rootNode.data+":";
        for(int i=0;i<rootNode.children.size();i++){
            nodes+=rootNode.children.get(i).data;
        }
        System.out.println(nodes);
        for(int i=0;i<rootNode.children.size();i++){
            print(rootNode.children.get(i));
        }

    }

    //We are taking input level wise
    public static TreeNode<Integer> takeInputLevelWise(Scanner sc){
        Queue<TreeNode<Integer>> queue=new LinkedList<>();
        System.out.println("Enter the root node");
        int rootInt=sc.nextInt();
        TreeNode<Integer> rootNode=new TreeNode<Integer>(rootInt);
        queue.add(rootNode);

        while(!queue.isEmpty()){
            TreeNode<Integer> frontNode=queue.poll();
            System.out.println("Enter the no of children for "+frontNode.data);
            int childrenCount=sc.nextInt();

            for(int i=0;i<childrenCount;i++){
                System.out.println("Children input for "+(i+1)+"th children of "+frontNode.data+" node");
                int childrenInput=sc.nextInt();
                TreeNode<Integer> childNode=new TreeNode<Integer>(childrenInput);
                frontNode.children.add(childNode);
                queue.add(childNode);
            }
        }
        return rootNode;
    }

    //We are taking the input as dfs
    public static TreeNode<Integer> takeInput(Scanner sc){
        System.out.println("Enter the next node");
        int nodeInput=sc.nextInt();
       
        TreeNode<Integer> root=new TreeNode<Integer>(nodeInput);
        int childrenCount=sc.nextInt();

        for(int i=0;i<childrenCount;i++){
            TreeNode<Integer> child=takeInput(sc);
            root.children.add(child);
        }
        return root;
    }
}
