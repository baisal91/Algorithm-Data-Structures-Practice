package Linked_List;

import Linked_List.ListNode;

public class MergeTwoSortedLists {

    public static void main(String[] args){
       // System.out.println("hello");
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(3);

        mergeTwoLists(l1, l2);
        ListNode result = mergeTwoLists(l1, l2);

        System.out.println(result.print());


    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        //Base Case
        if (l1 == null){
            return l2;
        }else if (l2 == null){
            return l1;
        }

        if (l2.val <= l1.val) {

            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        } else {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;

        }


    }

}
