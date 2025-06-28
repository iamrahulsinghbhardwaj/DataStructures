package Trees;
import java.util.*;
import java.util.Scanner;

public class BinaryTreeUse {

    public static ArrayList<Integer> getRootToNodePath(BinaryTreeNode<Integer> root,int data){
        if(root==null){
            return null;
        }

        if(root.data==data){
            ArrayList<Integer> list=new ArrayList<>();
            list.add(root.data);
            return list;
        }

         ArrayList<Integer> left=getRootToNodePath(root.left,data);
         if(left!=null){
            left.add(root.data);
            return left;
         }

         ArrayList<Integer> right=getRootToNodePath(root.right,data);
         if(right!=null){
            right.add(root.data);
            return right;
         }else{
            return null;
         }
    }

    public static BinaryTreeNode<Integer> takeInputLevelWise(Scanner sc){
        Queue<BinaryTreeNode<Integer>> queue=new LinkedList<>();
        int rootNodeInput=sc.nextInt();
        BinaryTreeNode<Integer> rootNode=new BinaryTreeNode<>(rootNodeInput);
        queue.add(rootNode);

        while(!queue.isEmpty()){
            BinaryTreeNode<Integer> frontNode=queue.poll();

              int left=sc.nextInt();
              if(left!=-1){
                BinaryTreeNode<Integer> leftNode=new BinaryTreeNode<>(rootNodeInput);
                frontNode.left=leftNode;
                        queue.add(leftNode);
              }
               int right=sc.nextInt();
               if(right!=-1){
                BinaryTreeNode<Integer> rightNode=new BinaryTreeNode<>(rootNodeInput);
                frontNode.right=rightNode;
                queue.add(rightNode);
               }       
            }
            return  rootNode;
        }

    public static void print(BinaryTreeNode<Integer>  node){
        if(node==null){
            return;
        }

        String result=node.data+" ";
        if(node.left!=null){
           result+=node.left;
        }
        if(node.right!=null){
            result+=node.right;
        }

        System.out.println(result);
        print(node.left);
        print(node.right);

    }

    public static BinaryTreeNode<Integer> takeInput(Scanner sc){
        System.out.println("Enter root data");
        int input=sc.nextInt();
        if(input==-1){
            return null;
        }

        BinaryTreeNode<Integer> node=new BinaryTreeNode<Integer>(input);
        node.left=takeInput(sc);
        node.right=takeInput(sc);

        return node;
    }

    public static void main(String args[]){

    Scanner sc=new Scanner(System.in);
    BinaryTreeNode<Integer> root=new BinaryTreeNode<Integer>(10);
    BinaryTreeNode<Integer> nodeLeft=new BinaryTreeNode<Integer>(20);
    BinaryTreeNode<Integer> nodeRight=new BinaryTreeNode<Integer>(30);

    root.left=nodeLeft;
    root.right=nodeRight;

    System.out.println(root.left.data+" "+root.right.data);
    takeInput(sc);
    }
}
