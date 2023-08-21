import java.util.*;
public class overloading
{
  public static void main(String []args)
  {
     Scanner sc=new Scanner(System.in);
     int a=sc.nextInt();
     int b=sc.nextInt();
     int ans1=add(a,b);
     System.out.println("Sum is:"+ans1);
     float m=sc.nextFloat();
     float n=sc.nextFloat();
     float ans2=add(m,n);
     System.out.println("Sum is:"+ans2);
  }
  public static int add(int a,int b)
  {
    return a+b;
  }
  public static float add(float m,float n1)
{
  return m+n1;  
}
}