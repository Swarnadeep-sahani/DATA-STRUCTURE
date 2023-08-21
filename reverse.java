public class reverse {
     private node head;
  private static class node{
    private int data;
    private node next;

    public node(int data)
    {
        this.data=data;
        this.next=null;
    }
  }
  void display()
    {
        node ptr=head;
        while (ptr!=null) 
        {
          System.out.print(ptr.data+"-->");
          ptr=ptr.next;  
        }
        System.out.print("null");
    }

    void revData( node head )
    {
      
    }
   public static void main(String[] args) {
    reverse sll=new reverse();
    sll.head=new node(10);
    node second=new node(15);
    node third=new node(20);

    sll.head.next=second;
    second.next=third;
    third.next=null;

    sll.display();
  }
}
