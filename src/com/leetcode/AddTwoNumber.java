package com.leetcode;

/**
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
 */
public class AddTwoNumber {
    public static void main(String[] args) {
        ListNode a1 = new ListNode(9);
        ListNode a2 = new ListNode(8);
        ListNode a3 = new ListNode(3);
        a1.next = a2;
        a2.next = a3;
        print(a1);
        ListNode b1 = new ListNode(1);
        ListNode b2 = new ListNode(6);
        ListNode b3 = new ListNode(4);
        ListNode b4 = new ListNode(5);
        b1.next=b2;
        b2.next=b3;
        b3.next=b4;
        print(b1);
        ListNode returnlist =  addTwoNumbers(a1,b1);
        print(returnlist);
    }




    public static ListNode addTwoNumbers(ListNode l1, ListNode l2){
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead;
        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;
    }

    public static void print(ListNode listNode){
        if(listNode.next == null){
            System.out.println(listNode.val);
            return ;
        }
        do{
            System.out.print(listNode.val+"->");
            listNode = listNode.next;
        }while(listNode.next != null);
        System.out.println(listNode.val);
    }

}
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
    }

}