public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
  
  class Solution{
  public ListNode reverseLL(ListNode head){
    ListNode prev=null;
    ListNode curr=head;

    while(curr!=null){
    ListNode next=curr.next;
    curr.next=prev;
    prev=curr;
    curr=next;
    }
    return head=prev;
  }
  }
