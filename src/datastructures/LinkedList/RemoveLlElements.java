public class Node{
  int data;
  Node next;
  Node(int d) {this.data=d;}
}

class Solution{
public Node reomveElementll(ListNode head,int value){
  Node fakeHead=new Node(0);
  fakeHead.next=head;
  Node prev=fakeHead;
  Node curr=head;

    while(curr!=null){
      if(curr.data==value){
        prev.next=curr.next;
        
      }
      else{prev=prev.next;}
      
      curr=curr.next;
      
    }
    return fakeHead.next;
}
}
