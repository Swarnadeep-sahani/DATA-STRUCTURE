
class circular{
    private listNode head;
   public static class listNode{
        private int data;
        private listNode next;
        public listNode(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    void insertAtbeg(int data)
    {
        listNode node=new listNode(data);
            node.next=head;
            head=node;
    }
    void print()
    {
        listNode ptr=head;
        while(ptr!=null)
        {
            System.out.print(ptr.data+"-->");
            ptr=ptr.next;
        }
        System.out.print("null");
    }
    public static void main(String[] args) {
        circular cl=new circular();
        cl.insertAtbeg(10);
        cl.insertAtbeg(20);
        cl.insertAtbeg(30);
        cl.insertAtbeg(50);
        cl.print();
    }
}