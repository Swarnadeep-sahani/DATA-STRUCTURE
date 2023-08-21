class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
     public static Node addOne(Node head) 
    { 
        //code here.
        Node ptr=head;
        while (ptr.next!=null) {
            ptr=ptr.next;
        }
        if(ptr.data<9)
        {
            ptr.data+=1;
        }
        else if(ptr.data==9) {
            ptr.data=0;
            
        }
    } 
} 
class addone {
  
}
