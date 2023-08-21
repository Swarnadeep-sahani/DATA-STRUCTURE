//import java.util.*;
class raining {
    // public int volume(int a[],int n){
    //     int left[]=new int[n];
    //     int right[]=new int[n];
    //     int water=0;
    //     left[0]=a[0];
    //     for (int i = 1; i < n; i++) {
    //         if(a[i]>left[i-1])
    //           left[i]=a[i];
    //           else
    //             left[i]=left[i-1];
    //     }
    //     for (int i = n-1; i >= 0; i--) {
    //         if(a[i]>right[i+1])
    //            right[i]=a[i];
    //            else
    //             right[i]=right[i+1];
    //     }
    //     for (int i = 1; i < n; i++) {
    //         water+=Math.min(left[i],right[i])-a[i];
    //     }
    //     return water;
    public static int volume(int[] arr,int n) {
        int left = 0;
        int right = n - 1;
        int leftMax = 0;
        int rightMax = 0;
        int water = 0;
        while (left < right) {
            if (arr[left] < arr[right]) {
                if (arr[left] >= leftMax) {
                    leftMax = arr[left];
                } else {
                    water += leftMax - arr[left];
                }
                left++;
            } else {
                if (arr[right] >= rightMax) {
                    rightMax = arr[right];
                } else {
                    water += rightMax - arr[right];
                }
                right--;
            }
        }
        return water;
    
    }
    public static void main(String[] args) {
        int a[]={7,4,0,9};
        System.out.println(volume(a,4));
    }
}
