package LinkedList;

public class RemoveDuplicates {
    public static Node<Integer> Remove(Node<Integer> head){
        if(head==null || head.next==null){
            return head;
        }

        Node<Integer> current=head;

        while(current.next!=null){
            if(current.data.equals(current.next.data)){
                current.next=current.next.next;
            }else{
                current=current.next;
            }
        }
        return current;
    }
}
