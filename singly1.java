class singly1{
    private listNode head;
      static class listNode
    {
        private int data;
        private listNode next;
    
      listNode(int data)
    {
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
    public static void main(String[] args) {
        singly1 sll=new singly1();
        sll.head=new listNode(10);
        listNode second=new listNode(20);
        listNode third=new listNode(40);

        sll.head.next=second;
        second.next=third;
        sll.print();
    }
}