public class Bubble_sort{
    public static void main(String[] args) {
        int a[]={89,2,45,6,10,20};
        sort(a);
        System.out.println("After sorting:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" "); 
        }
    }
    
    public static void sort(int []a)
    {
        int size=a.length;
        for (int pass = 0; pass < size-1; pass++) {
            for (int i = 0; i < size-pass-1; i++) {
                if(a[i]>a[i+1]){
                    int temp=a[i];
                        a[i]=a[i+1];
                        a[i+1]=temp;
                }
            }
            
        }
    }
}
