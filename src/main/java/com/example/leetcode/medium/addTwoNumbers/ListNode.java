package com.example.leetcode.medium.addTwoNumbers;

public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        String result = "[";
        ListNode current = this;

        while (current.next != null) {
            result += current.val + ",";
            current = current.next;
        }

        return result + current.val + "]";
    }

    public boolean equals(ListNode listNode) {
        ListNode current = this;

        while (current.next != null && listNode.next != null) {
            if (current.val != listNode.val) {
                return false;
            }
            current = current.next;
            listNode = listNode.next;
        }

        if (current.next != null || listNode.next != null) {
            return false;
        }

        return true;
    }
}
