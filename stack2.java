import java.util.*;
class GfG
{
    int minEle;
    Stack<Integer> st,s2;
    
    // Constructor    
    GfG()
	{

	}
	
    /*returns min element from stack*/
    int getMin()
    {
	// Your code here
     return s2.peek();
     
	   
    }
    
    /*returns poped element from stack*/
    int pop()
    {
	// Your code here
	  if(st.peek()==s2.peek())
        s2.pop();
      return st.pop();  
    }

    /*push element x into the stack*/
    void push(int x)
    {
	// Your code heres
	  if(s2.empty()||x<=s2.peek())
         s2.push(x);
      st.push(x);   
    }	
}

class stack2 {
    public static void main(String[] args) {
        Stack<Integer>stack=new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        GfG g=new GfG();
        System.out.println(g.pop());
    }
}
