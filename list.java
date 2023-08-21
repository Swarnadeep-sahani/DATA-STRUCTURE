// import java.util.*;
// class list {
//     public static void main(String[] args) {
//         List<String>v=new Vector<>();
//          List<String>lt=new LinkedList<>();
//           List<String>al=new ArrayList<>();
//     }
// }

class list{
  public long[] minAnd2ndMin(long a[], long n)  
{
    long[] ab=new long[2];
    long first=Long.MAX_VALUE;
    long second=Long.MAX_VALUE;

    for (int i = 0; i < n; i++) {
        if(a[i]<first){
            second=first;
            first=a[i];
        }
        else if(a[i]<second && a[i]!=first){
            second=a[i];
        }
    }
    if(second==Long.MAX_VALUE){
       ab[0]=-1;
       ab[1]=-1;
    }
    else{
        ab[0]=first;
        ab[1]=second;
    }
      return ab;
    }
    

    public static void main(String[] args) {
        long a[]={1,2,1,3,6,7};
        long []arr=new list().minAnd2ndMin(a, 6);
        for (int i = 0; i < 2; i++) {
             System.out.println(arr[i]);
        }
    }
}
