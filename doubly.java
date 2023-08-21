class listNode{
         int data;
         listNode pre;
         listNode next;
        listNode(int data)
        {
            this.pre=null;
            this.data=data;
            this.next=null;
        }
    }
class doubly {
    static void printForward(listNode head)
    {
        listNode ptr=head;
        while(ptr!=null)
        {
            System.out.print(ptr.data+"->");
            ptr=ptr.next;
        }
         System.out.print("null");
    }
     static void printBack(listNode head)
    {
        listNode ptr=head;
        while(ptr!=null)
        {
            System.out.print(ptr.data+"->");
            ptr=ptr.pre;
        }
         System.out.print("null");
    }

    public static void main(String[] args) {
        listNode first=new listNode(10);
        listNode sec=new listNode(20);
        listNode third=new listNode(30);
        listNode forth=new listNode(40);
        listNode fifth=new listNode(50);
        listNode six=new listNode(60);
        first.next=sec;
        sec.pre=first;
        sec.next=third;
        third.pre=sec;
        third.next=forth;
        forth.pre=third;
        forth.next=fifth;
        fifth.pre=forth;
        fifth.next=six;
        six.pre=fifth;
        printForward(first);
        System.out.println();
        printBack(six);
}
}
