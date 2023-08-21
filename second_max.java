public class second_max {

     static int secondMax(int arr[])
    {
        int max=Integer.MIN_VALUE;
        int sec=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
             sec=max;
             max=arr[i];
            }
            else if (arr[i]>max && arr[i]!=max) {
                sec=arr[i];
            }
        }
        return sec;
    }
    public static void main(String[] args) {
        int a[]={1,34,56,34,3,6,8};
        int result=secondMax(a);
        System.out.println(result);
    }
}
