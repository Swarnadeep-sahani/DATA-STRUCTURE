class remove_even{

   public static int[] remove(int arr[]){
        int oddcount=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2!=0){
             oddcount++;
            }
        }
        int result[]=new int[oddcount];
        int index=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2!=0){
             result[index]=arr[i];
             index++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8,9};
        int b[]=remove(a);
        System.out.println("output is:");
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]+" ");
        }
    }
}