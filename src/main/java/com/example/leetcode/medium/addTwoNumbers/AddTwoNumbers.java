package com.example.leetcode.medium.addTwoNumbers;

public class AddTwoNumbers {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        ListNode output = new ListNode(7, new ListNode(0, new ListNode(8)));

        ListNode solve = addTwoNumbers(l1, l2);

        System.out.printf("isCorrect=%s output=%s solve=%s"
                .formatted(solve.equals(output), output, solve));
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int a, b;



        return null;
    }
}
