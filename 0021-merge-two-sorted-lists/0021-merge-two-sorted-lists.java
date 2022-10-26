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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        ListNode temporary_node = new ListNode(0);
        ListNode current_node = temporary_node;
        
        
        while (list1 != null && list2 != null){
            if (list1.val < list2.val){
                current_node.next = list1;
                list1 = list1.next;
            }
            
            else{
               current_node.next = list2;
                list2 = list2.next; 
            } 
            current_node = current_node.next;
        }
        if (list1 != null){
            current_node.next = list1;
            list1 = list1.next;
        }
        if (list2 != null){
            current_node.next = list2;
            list2 = list2.next;
        }
        
     return temporary_node.next;}
}