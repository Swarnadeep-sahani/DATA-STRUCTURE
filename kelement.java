import java.util.Arrays;

class kelement {
   static int[] kLargest(int[] arr, int n, int k) {
        // code here
        Arrays.sort(arr);
        int a[]=new int[k];
        int j=0;
        for (int i = n-1; i >= n-k; i--) {
            a[j]=arr[i];
            j++;
        }
        return a;
        
    }
    public static void main(String[] args) {
        int a[]={12,5,787,1,23};
        int b[]=kLargest(a, 5, 2);
        System.out.println("output");
        for (int i = 0; i < 2; i++) {
            System.out.print(b[i]+" ");
        }
    }
}
