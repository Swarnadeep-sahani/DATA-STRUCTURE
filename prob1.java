import java.util.Arrays;

public class prob1 {
    public static int[] singleNumber(int[] nums)
    {
        int x=nums.length;
        int n=(x-2)/2;
        int k=0;
        if(n==0||n==1||n==2)
          {
            int ans[]=new int[1];
            ans[0]=-1;
            return ans;
          }
        int ans[]=new int[n];
        
        int arr[]=new int[5000000];
        for (int i = 0; i < x; i++) {
            arr[nums[i]]++;
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==1)
              ans[k++]=i;
        }
        Arrays.sort(ans);
        return ans;
    }
    public static void main(String[] args) {
        int a[]={2};
        int arr[]=singleNumber(a);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
