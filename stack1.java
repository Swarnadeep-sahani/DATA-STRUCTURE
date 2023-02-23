public class stack1 {
    private listNode top;
    private int length;
    static class listNode{
        private int data;
        private listNode next;
        
        listNode(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public void push(int data)
    {
        listNode temp=new listNode(data);
        temp.next=top;
        top=temp;
        length++;
    }
    public int pop()
    {
      int result=top.data;
      top=top.next;
      length--;
      return result;  
    }
    public void print()
    {
        listNode temp=top;
        while (temp!=null)
        {
          System.out.print(temp.data+"-->");  
          temp=temp.next;  
        }
        System.out.print("null");
    }
    public static void main(String[] args) {
        stack1 obj=new stack1();
        obj.push(12);
        obj.push(20);
        obj.print();
        System.out.println();
        System.out.println("popped element is"+obj.pop());
        System.out.println();
        obj.print();
    }
}
