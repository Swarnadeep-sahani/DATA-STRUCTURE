#include<stdio.h>

int bubble_sort(int a[],int n)
{
    int i,temp,round;
    for ( round = 1; round < n-1; round++)
    {
        for ( i = 0; i < n-1-round; i++){
        if(a[i]>a[i+1])
        {
            temp=a[i];
            a[i]=a[i+1];
            a[i+1]=temp;
        }
    }
}
}
int main()
{
    int a[]={7,34,9,-6,79};
    int i;
    bubble_sort(a,5);
    for (i=0;i<5;i++)
    {
        printf("%d\t",a[i]);
    }
}