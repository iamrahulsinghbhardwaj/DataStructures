package LinkedList;

public class LengthofLoop {
    public static int lengthOfLoop(Node head) {
        Node slow=head,fast=head;

        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(slow==fast){
                int loopLength=1;
                Node curr=slow.next;

                while(curr!=slow){
                    curr=curr.next;
                    loopLength++;
                }

                return loopLength;
            }
        }

        return 0;
    
    }
}
