public class doubly2 {
    
    class Node{
        String data;
        Node prev;
        Node next;
        public Node(String data)
        {
          this.data=data;
        }
    }
    Node head=null;
    Node tail=null;
    public void addNode(String data)
    {
        Node newNode=new Node(data);
        if(head==null)
         {
            head=newNode;
            tail=newNode;
            head.prev=null;
            tail.next=null;
         }
         else{
            tail.next=newNode;
            newNode.prev=tail;
            tail=newNode;
            tail.next=null;
         }  
    }
    public void show()
    {
        Node ptr=head;
        if(head==null)
        {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Element of linked list is:");
        while(ptr!=null)
        {
            System.out.print(ptr.data+"-->");
            ptr=ptr.next;
        }
        System.out.print("null");
    }
    public static void main(String[] args) {
        doubly2 obj=new doubly2();
        obj.addNode("apple");
        obj.addNode("orange");
        obj.addNode("banana");
        obj.addNode("pine");

        obj.show();
    }
}
