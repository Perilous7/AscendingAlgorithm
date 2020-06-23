package LinkedList;

public class ReverseLinkedList2 {
    public static ListNode reverseBetween(ListNode head, int m, int n){
        if(head==null||head.next==null){
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        for(int i = 1; i < m; i++){
            prev = prev.next;
        }
        ListNode curr = prev.next;
        for(int i = m; i < n; i++){
            ListNode next= curr.next;
            curr.next = next.next;
            next.next = prev.next;
            prev.next = next;
        }
        return dummy.next;

    }
}
