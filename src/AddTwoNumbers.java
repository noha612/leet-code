public class AddTwoNumbers {

    public static void main(String[] args) {
        ListNode l1 = new ListNode();
        ListNode l11 = new ListNode();
        ListNode l111 = new ListNode();
        l1.next = l11;
        l11.next = l111;
        l1.val = 2;
        l11.val = 4;
        l111.val = 3;
        ListNode l2 = new ListNode();
        ListNode l22 = new ListNode();
        ListNode l222 = new ListNode();
        l2.next = l22;
        l22.next = l222;
        l2.val = 5;
        l22.val = 6;
        l222.val = 4;
        new AddTwoNumbers().addTwoNumbers(l1, l2);
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode r = new ListNode();
        ListNode cur = r;
        int v;
        boolean t = false;
        while (l1 != null || l2 != null) {
            v = 0;
            if (l1 != null) {
                v += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                v += l2.val;
                l2 = l2.next;
            }
            if (t) v += 1;
            t = v > 9;
            cur.val = v % 10;
            if (l1 != null || l2 != null) {
                cur.next = new ListNode();
                cur = cur.next;
            }else if(t){
                cur.next = new ListNode();
                cur.next.val = 1;
            }

        }
        return r;
    }

}
