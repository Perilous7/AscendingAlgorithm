package LinkedList;

public class ReverseLinkedList {
    public static ListNode insertAtEnd(int val,ListNode head){
        if(head==null){
            head = new ListNode(val);
            return head;
        }
        ListNode temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = new ListNode(val);
        return head;
    }
    public static ListNode reverse(ListNode head){
        if(head==null||head.next==null){//base case return self
            return head;
        }
        ListNode previous = null;
        ListNode current = head;
        ListNode next;
        while(current!=null){
            next = current.next;//reference to next
            current.next = previous;//reverse
            previous =current;//increment prev
            current=next;//increment next

        }
        return previous;
    }

    public static ListNode reverseRecursive(ListNode head){
        if(head==null||head.next==null){//base case return self
            return head;
        }
        ListNode nextNode = head.next;
        ListNode newHead =reverseRecursive(nextNode);
        nextNode.next = head;
        head.next = null;
        return newHead;
    }

    public static void printList(ListNode head){
        while(head!=null){
            System.out.print(head.val+" -> ");
            head=head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
       ListNode head =new ListNode(1);
       insertAtEnd(2,head);
       insertAtEnd(3,head);
       insertAtEnd(4,head);
       printList(head);
       //printList(reverse(head));
        printList(reverseRecursive(head));
    }
}
