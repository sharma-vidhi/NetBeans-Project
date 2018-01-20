public class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
 }
 
 class Solution{
 public ListNode mergerSortedLists(ListNode l1,ListNode l2){
 if(l1==null || l2==null){return l1!=null?l1:l2;}

 ListNode merge;
 if(l1.val<l2.val){
 merge=l1;
 merge.next=mergerSortedLists(l1.next , l2);
 }
 else{
 merge=l2;
 merge.next=mergerSortedLists(l1 , l2.next);
 }
 return merge;
 }
 
 }
