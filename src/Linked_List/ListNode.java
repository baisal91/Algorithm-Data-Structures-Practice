package Linked_List;

public class ListNode {


      int val;
      ListNode next;

      ListNode() {}

    public int print(){
        return val;
    }

    public void printAll() {
        print();
        if (next != null) {
            System.out.println("; ");
            next.printAll();
        }
    }

      ListNode(int val) {
          this.val = val;
      }

      ListNode(int val, ListNode next) {

          this.val = val; this.next = next;

      }

}
