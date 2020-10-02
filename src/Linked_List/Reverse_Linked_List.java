package Linked_List;

import java.util.LinkedList;

public class Reverse_Linked_List {

    public static void main(String[] args){

        LinkedList<ListNode> list = new LinkedList<>();
        list.add(new ListNode(1));
        list.add(new ListNode(2));
        list.add(new ListNode(3));
        list.add(new ListNode(4));
        list.add(new ListNode(5));

        for (ListNode l: list) {
            System.out.print(l.val);
        }
        

    }


    public static ListNode reverseList(ListNode head) {


        ListNode prev = null;

        while(head != null){
            ListNode first = head.next;
            head.next = prev;
            prev = head;
            head = first;
        }

        return prev;
    }
}
