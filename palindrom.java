public class palindrom {
    public static boolean check(int arr[])
    {
        if(arr.length==0)
            return false;
        

        int start=0,end=arr.length-1;
        while (start<end) {
            if(arr[start]!=arr[end]){
                return false;
            }
            start++;
            end--;
        }
        return true; 
    }
    public static void main(String[] args) {
        int a[]={1,2,3,2,1,7};
        if(check(a)==true)
        {
            System.out.print("palindrome");
        }
        else
        {
            System.out.print(" not palindrome");
        }
    }
}
