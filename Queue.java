
class Queue{
    private listNode front;
    private listNode rear;
    private int length;
    private class listNode{
        private int data;
        private listNode next;
        public listNode(int data)
        {
            this.data=data;
            this.next=null;
        }
      }
      public int length()
      {
        return length;
      }
      public boolean isEmpty()
      {
        return length==0;
      }
       void enqueue(int data)
      {
        listNode temp=new listNode(data);
        if(isEmpty())
        {
            front=temp;
        }
        else{
            rear.next=temp;
        }
        rear=temp;
        length++;
      }
       int dequeue()
      {
        if(isEmpty())
        {
            System.out.println("null");
        }
        int result=front.data;
        front=front.next;
        if(front==null)
        {
            rear=null;
        }
        length--;
        return result;
      }
       void print()
      {
        listNode ptr=front;
        if(ptr==null)
        {
            System.out.println("null");
        }
        while(ptr!=null)
        {
            System.out.print(ptr.data+" ");
            ptr=ptr.next;
        }
      }
      public static void main(String[] args){
     Queue qr=new Queue();
     qr.enqueue(10);
     qr.enqueue(20);
     qr.enqueue(30);
        qr.print();
        System.out.println();
        System.out.println("removed "+qr.dequeue());
        qr.print();
        System.out.println("removed "+qr.dequeue());
        System.out.println("removed "+qr.dequeue());
        qr.print();
        System.out.println(qr.length());
      }
}