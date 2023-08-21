
class Listnode{
    int val;
    Listnode next;
    Listnode(int val)
    {
        this.val=val;
        this.next=null;
    }
}
class reverse_list{
    public static Listnode reverse(Listnode head){
        Listnode newHead=null;
        while (head!=null) {
            Listnode ptr=head.next;
            head.next=newHead;
            newHead=head;
            head=ptr;
        }
        return newHead;
    }
    public static Listnode removenthFromend(Listnode head,int n){
        Listnode start=head;
        Listnode fast=head;
        Listnode slow=head;
        for (int i = 1; i <=n ; i++) {
            fast=fast.next;
        }
        while (fast.next!=null) {
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
        return start.next;
    }
    public static int getNthdatafromEnd(Listnode head,int n)
    {
        Listnode start=head;
        Listnode fast=start;
        Listnode slow=start;
        for (int i = 1; i <=n ; i++) {
            fast=fast.next;
        }
        while (fast!=null) {
            fast=fast.next;
            slow=slow.next;
        }
        return slow.val;
    }
    public static void print(Listnode head)
    {
        Listnode ptr=head;
        while (ptr!=null) {
            System.out.print(ptr.val+"->");
            ptr=ptr.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        Listnode first=new Listnode(10);
        Listnode sec=new Listnode(20);
        Listnode third=new Listnode(30);
        Listnode forth=new Listnode(40);
        Listnode fifth=new Listnode(50);
        Listnode six=new Listnode(60);
        first.next=sec;
        sec.next=third;
        third.next=forth;
        forth.next=fifth;
        fifth.next=six;

      /*   System.out.println("before reverse");
        print(first);
        System.out.println("\nAfter reverse");
       Listnode head= reverse(first);
       print(head);
       */
    //   Listnode head= removenthFromend(first,2);
        print(first);
         System.out.println(getNthdatafromEnd(first,2));
    }
}