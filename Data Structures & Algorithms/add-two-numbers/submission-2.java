/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//         int num1=0, place =1;
//         int num2 =0;
//         while(l1 !=null){
//             num1 += l1.val*place;
//             place *= 10;
//             l1 = l1.next;
//         }
//         place =1;
//         while(l2 !=null){
//             num2 += l2.val*place;
//             place *=10;
//             l2 = l2.next;
//         }
//         System.out.println(num2);

//         int num3 = num1+num2;

//         if (num3 == 0) {
//         return new ListNode(0);
//     }

//     ListNode dummy = new ListNode(-1);
//     ListNode curr = dummy;
//     if(num3 == 0){
//         return new ListNode(0);
//    }

//     while(num3>0){
//         int digit = num3%10;
//         curr.next = new ListNode(digit);
//         curr = curr.next;
//         num3 = num3/10;
//     }

//     return dummy.next;
ListNode dummy = new ListNode(0);
ListNode curr = dummy;
int carry =0;

while(l1 !=null || l2 != null || carry !=0){
    int sum = carry;

    if(l1 !=null){
         sum += l1.val;
         l1 = l1.next;
    }
    if(l2 !=null){
        sum += l2.val;
        l2= l2.next;
    }

    carry = sum/10;
    curr.next = new ListNode(sum%10);
    curr = curr.next;



}

    return dummy.next;


    }


}

