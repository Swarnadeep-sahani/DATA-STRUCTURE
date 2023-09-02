class Solution {
    int remove_duplicate(int A[],int N){
        // code here
          int arr[]= new int[A.length];
        arr[0]=A[0];int k=0;
        
        for (int i=0;i<A.length;i++)
        {
            if(A[i]!=arr[k])
            {
                k++;
                arr[k]=A[i];
            }
        }
        for(int i=0;i<=k; i++)
        {
            A[i]=arr[i];
        }
        k++;
        return k;
    }
}
