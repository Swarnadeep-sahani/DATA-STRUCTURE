import java.util.Arrays;
import java.util.*;

class klargest {
    public static ArrayList<Integer>largest(int arr[],int n,int k)
    {
        Arrays.sort(arr);
        
        ArrayList<Integer>al=new ArrayList<>();
        for (int i = 1; i <= k ; i++) {
            al.add(arr[n-i]);
        } 
        return al;
        
    }
    public static void main(String[] args) {
        int arr[]={12,5,787,1,23};
        int n=arr.length;
        int k=2;
        ArrayList<Integer>al=largest(arr, n, k);
        System.out.println(al);
    }
}
