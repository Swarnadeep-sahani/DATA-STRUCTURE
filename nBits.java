import java.util.Arrays;

class nBits
{
    int []a;
    public nBits(int n)
    {
        a=new int[n];
    }
    public void binary(int n)
    {
        if(n<=0)
        {
            System.out.println(Arrays.toString(a));
        }else{
            a[n-1]=0;
            binary(n-1);
            a[n-1]=1;
            binary(n-1);
        }
    }
    public static void main(String []args)throws java.lang. Exception
    {
        int n=4;
        nBits i=new nBits(n); 
        i.binary(n);
    }
}