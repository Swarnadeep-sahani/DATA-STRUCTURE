public class search {
    private newnode head;

    private static class newnode{
        private int data;
        private newnode next;
    
    public newnode(int data){
        this.data=data;
        this.next=null;
    }
}
 public int search_ele(int value)
 {
    int count=1;
    newnode ptr=head;
    while(ptr.next!=null)
    {
        if(ptr.data==value)
        {
            return count;
        }
        ptr=ptr.next;
        count++;
    }
     return -1;
 }
public void display()
{
    newnode ptr=head;
    while (ptr.next!=null) {
        System.out.print(ptr.data+"-->");
        ptr=ptr.next;
    }
    System.out.print("null");
}
    public static void main(String[] args) {
        search sll=new search();
        sll.head=new newnode(1);
        newnode second=new newnode(2);
        newnode third=new newnode(100);
        newnode forth=new newnode(4);

        sll.head.next=second;
        second.next=third;
        third.next=forth;

        sll.display();
        System.out.println();
        System.out.println(sll.search_ele(3));

    }
}
