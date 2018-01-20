public class Node{
  int data;
  Node next;
  Node(int d) {this.data=d;}
}

class Solution{
public Node reomveElementll(int head,int value){
  Node fakeHead=null;
  fakeHead.next=head;
  Node prev=fakeHead;
  Node curr=head;

    while(curr!=null){
      if(curr.data==value){
        prev.next=curr.next;
        
      }
      curr=curr.next;
      prev=prev.next;
    }
    return fakeHead.next;
}
}
