public class divide{
    public static int result(int a,int b)
    {
        int count=0;
        
        if(a <0 && b<0)
        {
            int first=-a;
            int sum=first;
            int mar=-b;
        while(sum<=mar)
        {
            sum=sum+first;
            count++;
        }
        return count;
       }
       else if(a<0 && b>0)
       {
         int first=-a;
         int sum=first;
         while(sum<=b)
         {
             sum=sum+first;
             count++;
         }
         return (-count);
       }
       else if(a>0 && b<0)
       {
         
         int sum=a;
         int first=-b;
         while(sum<=first)
         {
             sum=sum+a;
             count++;
         }
         return (-count);
        }
        else
        {
        
            int sum=a;
            
        while(sum<=b)
        {
            sum=sum+a;
            count++;
        }
        return count; 
        }
    }
    public static void main(String[] args) {
        System.out.println(result(-1,-214748899));
    }
}