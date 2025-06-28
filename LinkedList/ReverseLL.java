package LinkedList;

public class ReverseLL {
    public Node<Integer> Reverse(Node<Integer> head){
        if(head==null || head.next==null){
            return head;
        }

        Node<Integer> newHead=Reverse(head.next);

        head.next.next=head;
        head.next=null;
        return newHead;
    }

    public Node<Integer> ReverserIterative(Node<Integer> head){
        Node<Integer> current=head;
        Node<Integer> temp=null,prev=null;

        while(current!=null){
            temp=current.next;
            current.next=prev;
            prev=current;
            current=temp;
        }

        return prev;
    }
}
