/* 19. Remove Nth Node From End of List(Leetcode)
link: https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/ 
*/

public ListNode removeNthFromEnd(ListNode head, int n) {
     ListNode temp = new ListNode(0);
        temp.next = head;
        int length = 0;
        ListNode curr = head;
        while (curr != null) {
            length++;
            curr = curr.next;
        }
        int key= length - n;
        curr = temp;
        for (int i = 0; i < key; i++) {
            curr = curr.next;
        }
        
        curr.next = curr.next.next;
        
        return temp.next;
}
