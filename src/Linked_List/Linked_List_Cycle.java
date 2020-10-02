package Linked_List;

public class Linked_List_Cycle {

    public boolean hasCycle(ListNode head) {

        if(head == null) return false;

        ListNode slow = head;
        ListNode fast = head.next;

        while(slow != fast){
            if(fast == null || fast.next == null){ //if there is only one node given then check
                return false;
            } else{
                slow = slow.next;
                fast = fast.next.next;
            }


        }

        return true;


    }
}
