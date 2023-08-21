public class doubly1{
    private ListNode head,tail;
    private int length;
    private class ListNode{
       private int data;
       private ListNode next;
       private ListNode prev;

        public ListNode(int data)
        {
            this.data=data; 
        }
    }
    public doubly1()
    {
        this.head=null;
        this.tail=null;
        this.length=0;
    }

    public boolean isEmpty()
    {
        return length==0;
    }
    public int length()
    {
        return length;
    }
    public void insertLast(int value)
    {
        ListNode newnode=new ListNode(value);
        if(isEmpty())
        {
            head=newnode;
        }else{
            tail.next=newnode;
        }
        newnode.prev=tail;
        tail=newnode;
        length++;
    }
    public void displayForw()
    {
        if(head==null)
        {
            return;
        }
        ListNode temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.print("null");
    }
    public static void main(String[] args) {
        doubly1 dll=new doubly1();
        dll.insertLast(10);
        dll.insertLast(12);
        dll.insertLast(15);
        dll.displayForw();

    }
}
