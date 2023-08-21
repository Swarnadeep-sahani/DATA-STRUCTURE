public class stack {
    
     class stackLinked{
        private class node{
            int data;
            node next;
        }
        node top;
        stackLinked()
        {
            this.top=null;
        }
        public void push(int x)
        {
            node temp=new node();
            if(temp==null)
            {
             System.out.println("heap overflow");
            }
        }
     }

}
