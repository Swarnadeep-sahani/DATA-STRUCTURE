import java.util.Stack;
class reverse1 {
    public static String reverse(String str)
    {
        Stack<Character>stack=new Stack<>();
        char []ch=str.toCharArray();
        for(char c:ch)
        {
            stack.push(c);
        }
        for (int i = 0; i < str.length(); i++)
        {
          ch[i]=stack.pop();   
        }
        return new String(ch);
    }
    public static void main(String[] args) {
        String str="ABCD";
        System.out.println("String before--> "+str);
        System.out.println("After reverse--->"+reverse(str));

    }
}
