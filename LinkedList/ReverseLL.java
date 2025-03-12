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
}
