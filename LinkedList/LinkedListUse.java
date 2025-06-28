package LinkedList;
import java.util.Scanner;

public class LinkedListUse {
    public static void main(String[] args) {
        Node<Integer> node=new Node<Integer>(10);
        Node<Integer> node2=new Node<Integer>(20);
        Node<Integer> node3=new Node<Integer>(30);
        node.next=node2;
        node2.next=node3;
        Node<Integer> head=TakeInput();
        //head=InsertNode(head, 2, 10);
        head=DeleteNode(head, 2);
        PrintLL(head);
    }

    public static Node<Integer> DeleteNode(Node<Integer> head,int pos){
  
        if(pos==0 && head.next!=null){
            head=head.next;
            return head;
        }

        int index=0;
        Node<Integer> tempHead=head;

        while(index<pos-1){
            index++;
            tempHead=tempHead.next;
        }

        if(tempHead.next.next==null){
            tempHead.next=null;
            return head;
        }

        tempHead.next=tempHead.next.next;
        return head;
    }

    public static Node<Integer> InsertNodeRecursive(Node<Integer> head,int pos,int data){
        if(head==null){
            return head;
        }

        if(pos==0){
            Node<Integer> newNode=new Node<>(data);
            newNode.next=head;
            return newNode;
        }
        head.next=InsertNodeRecursive(head.next, pos-1, data);
        return head;
    }

    public static Node<Integer> InsertNode(Node<Integer> head,int pos,int data){
        //Add node in the front
        //Add node in the last
        //Add node in the middle

        // 1 2 3 4 5
        //2
        Node<Integer> newNode=new Node<>(data);

        if(pos==0){
            newNode.next=head;
            return newNode;
        }

        Node<Integer> tempHead=head;
        int index=0;

        while(index<pos-1){
            tempHead=tempHead.next;
            index++;
        }

        newNode.next=tempHead.next;
        tempHead.next=newNode;

        return head;
    }

    public static void PrintLL(Node<Integer> head){
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
    }

    public static Node<Integer> TakeInput(){
        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();

        Node<Integer> nodeHead=null;
        Node<Integer> tail=null;

        while(input!=-1){
            Node<Integer> newNode=new Node<>(input);
            if(nodeHead==null){
                nodeHead=newNode;
                tail=newNode;
            }else{
                tail.next=newNode;
                tail=tail.next;
            } 
            input=sc.nextInt();    
        }
        sc.close();

        return nodeHead;
    }
}