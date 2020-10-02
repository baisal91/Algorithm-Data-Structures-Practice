package Linked_List;

public class Remove_Nth_Node_From_End_of_List {


    public static ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode list = new ListNode(0);
        list.next = head;
        ListNode temp;
        int count=0;

        while(head != null){
            count++;
            head = head.next;
        }

        count-=n;
        temp = list;

        while(count > 0){
            count--;
            temp = temp.next;
        }

        temp.next = temp.next.next;

        return list.next;

    }
}
