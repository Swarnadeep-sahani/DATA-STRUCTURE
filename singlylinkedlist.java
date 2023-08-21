
public class singlylinkedlist {
    private ListNode head;
    private static class ListNode{
        private int data;
        private ListNode next;
    
    public ListNode(int data)
    {
        this.data=data;
        this.next=null;
    }
}
 public  void display()
 {
    ListNode current=head;
    while (current!=null) {
        System.out.print(current.data+"-->");
        current=current.next;
    }
    System.out.println("null");
 }
  public void insertAtbeg(int value)
  {
    ListNode node=new ListNode(value);
     node.next=head;
     head=node;
  }

  public void insertAtend(int value)
  {
    ListNode node=new ListNode(value);
    if(head==null)
    {
       head=node;
       return;
    }
    ListNode previous=head;
    while(previous.next!=null)
    {
        previous=previous.next;
    }
    previous.next=node;

  }
  
   public void insertRandom(int value,int position)
   {
    ListNode node=new ListNode(value);

    if(position==1)
    {
        node.next=head;
        head=node;
    }
    else{
        ListNode prev=head;
        int count=1;
        while (count<position-1) {
            prev=prev.next;
            count++;
        }
        ListNode current=prev.next;
        node.next=current;
        prev.next=node;
    }

   }
   public ListNode deleteAtbeg()
   {
       if(head==null)
       {
        return null;
       }
       ListNode temp=head;
       head=head.next;
       temp.next=null;
       return temp;
   }
   public ListNode deleteAtend()
   {
    if(head==null)
     return null;
    ListNode current=head;
    ListNode pre=null;
    while(current.next!=null)
    {
        pre=current;
        current=current.next;
    }
    pre.next=null;
    return current; 
   }

   public void deleteRandom(int position)
   {
        if(position==1){
         head=head.next;
        }
        else{
         ListNode prev=head;
         int count=1;
         while (count<position-1) {
            prev=prev.next;
            count++;
         }
         ListNode current=prev.next;
         prev.next=current.next;

    }
   }

    public static void main(String[] args) {
        singlylinkedlist sll=new singlylinkedlist();
        /* 
        sll.head=new ListNode(10);
        ListNode second=new ListNode(1);
        ListNode third=new ListNode(8);
        ListNode forth=new ListNode(11);
        sll.head.next=second;
        second.next=third;
        third.next=forth;
       */
      
      // sll.insertAtend(50);
      // sll.insertAtend(60);
       sll.insertRandom(12, 1);
       sll.insertRandom(10, 2);
       sll.insertAtbeg(80);
       sll.insertAtbeg(100);
        sll.display();
        /* 
        System.out.println(sll.deleteAtbeg().data);
        sll.display();
        System.out.println(sll.deleteAtend().data);
        sll.display();
        */
        sll.deleteRandom(3);
        sll.display();
}
}
