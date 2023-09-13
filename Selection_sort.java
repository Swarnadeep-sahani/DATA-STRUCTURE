class Selection_sort {
        public static void main(String[] args) {
            int arr[]={23,56,10,23,14,67};
            int n=arr.length;
            sort(arr,n);
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]+" ");
            }
        }
        static void sort(int arr[],int n)
        {
            int i,j,temp,small,pos;
            for (i = 0; i < n; i++) {
                small=arr[i];
                pos=i;
                for (j = i+1; j < n-1; j++) {
                    if(arr[j]<small){
                      small=arr[j];
                      pos=j;
                    }
                }
                temp=arr[i];
                arr[i]=arr[pos];
                arr[pos]=temp;
            }
        }
}
