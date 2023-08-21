class doubly3 {
    private listNode head;
    private listNode tail;
    static class listNode{
        private int data;
        private listNode pre;
        private listNode next;
        listNode(int data)
        {
            this.pre=null;
            this.data=data;
            this.next=null;
        }
    }
    void print()
     {
        listNode current=head;
        while (current!=null)
        {
          System.out.print(current.data+"-->");  
          current=current.next;  
        }
        System.out.print("null");
     }
     void printback()
     {
        listNode current=tail;
        while (current!=null)
        {
          System.out.print(current.data+"-->");  
          current=current.pre;  
        }
        System.out.print("null");
     }
    public static void main(String[] args)
    {
     doubly3 dll=new doubly3();
     dll.head=new listNode(10);
     listNode second=new listNode(20);
     listNode third=new listNode(40);
     listNode forth=new listNode(50);
     
     dll.tail=second;
     dll.head.next=second;
     second.pre=dll.head;
     dll.tail=third;
     second.next=third;
     third.pre=second; 
     dll.tail=forth;  
     third.next=forth;
     forth.pre=third;
     System.out.println("display serially");
     dll.print();
     System.out.println();
     System.out.println("display in reverse");   
     dll.printback();   
    }
    
}
