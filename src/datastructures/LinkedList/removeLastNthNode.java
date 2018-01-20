public class ListNode{
int val;
int next;
ListNode(int d){val=d;}
}

class Sloution{
public ListNode (int head,int n){
    ListNode fakeHead =new ListNode(0);
    fakeHead.next=head;
    ListNode p1=fakeHead;
    ListNode p2=fakeHead;

  for(int i=0;i<n;i++){
    p1=p1.next;
  }
  while(p1.next!=null){
    p1=p1.next;
    p2=p2.next;
  }
  p2.next=p2.next.next;
  return fakeHead.next;
}

}
