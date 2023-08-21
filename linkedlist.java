import java.util.ArrayList;

public class linkedlist {
    private node head;

    public static class node{
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
    public static void main(String[] args) {
        linkedlist sll =new linkedlist();
        sll.head=new node(10);
        node second=new node(9);
        node third=new node(8);
        node forth=new node(5);

        sll.head.next=second;
        second.next=third;
        third.next=forth;
     // sll.display();
     ArrayList<Integer>al=new ArrayList<>();
      node ptr=sll.head;
      while (ptr!=null) {
        al.add(ptr.data);
        ptr=ptr.next;
      }
       al.
    }
}
