import java.util.*;

class solution
{
    //Function to delete middle element of a stack.
    public void deleteMid(Stack<Integer>st,int n){
                int mid;
                if(n%2==0)
                  mid=n/2;
                else
                  mid=((n+1)/2);
                Stack<Integer> temp = new Stack<>();
                for (int i = 0; i < mid; i++) {
                    temp.push(st.pop());
                }
                st.pop();
                while (!temp.isEmpty()) {
                    st.push(temp.pop());
                }
    } 
    public static void main(String[] args) {
        Stack<Integer>st=new Stack<>();
        st.add(10);
        st.add(20);
        st.add(30);
        st.add(40);
        // st.add(50);
        //st.add(60);
        System.out.println(st);
        (new solution()).deleteMid(st,4);
         System.out.println(st);
        
    }
}
