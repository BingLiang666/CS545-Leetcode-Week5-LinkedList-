public class Solutions {

    /* Problem 876. Middle of the Linked List  #Easy#
     * https://leetcode.com/problems/middle-of-the-linked-list/
     *  Problem description:
     *  Given the head of a singly linked list, return the middle node of the linked list.
     *  If there are two middle nodes, return the second middle node.
     */
    public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast.next != null) {
            if (fast.next.next == null) {
                fast = fast.next;
            } else {
                fast = fast.next.next;
            }
            slow = slow.next;
        }
        return slow;
    }

    /* Problem 203. Remove Linked List Elements
     * https://leetcode.com/problems/remove-linked-list-elements/
     *  Problem description:
     *  Given the head of a linked list and an integer val, remove all the nodes of the linked list that has Node.val == val,
     *  and return the new head.
     */

    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0, head);
        ListNode prev = dummy;
        ListNode cur = head;
        while (cur != null) {
            if (cur.val == val) {
                prev.next = cur.next;
            } else {
                prev = prev.next;
            }
            cur = cur.next;
        }
        return dummy.next;
    }

    /* Problem 206. Reverse Linked List
     * https://leetcode.com/problems/reverse-linked-list/
     *  Problem description:
     *  Given the head of a singly linked list, reverse the list, and return the reversed list.
     */
    
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode cur = head;
        ListNode temp = null;
        while(cur != null) {
            temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }
        return prev;
    }
