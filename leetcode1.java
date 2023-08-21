import java.util.ArrayList;
import java.util.Arrays;

public class leetcode1 {
    public static int largest(int arr[],int n,int k)
    {
        Arrays.sort(arr);
        return arr[n-k];
        
    }
    public static void main(String[] args) {
        int arr[]={3,2,3,1,2,4,5,5,6};
        int n=arr.length;
        int k=4;
        int ans=largest(arr, n, k);
        System.out.println(ans);
    }
}
