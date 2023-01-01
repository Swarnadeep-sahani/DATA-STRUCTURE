#include<stdio.h>

void main()
{
    int m,n,i,j,count=0;
    printf("enter row and column\n");
     scanf("%d%d",&m,&n);
     int a[m][n];
     printf("enter the element\n");
     for ( i = 0; i < m; i++)
     {
        for ( j = 0; j < n; j++)
        {
          scanf("%d",&a[i][j]);  
        }
        
     }
     printf("You entered the following matrix:\n");
     for ( i = 0; i < m; i++)
     {
        for ( j = 0; j < n; j++)
        {
          printf("%d\t",a[i][j]);  
        }
        printf("\n");
     }
     for ( i = 0; i < m; i++)
     {
        for ( j = 0; j < n; j++)
        {
          if(a[i][j]==0)
            count++;
        }
     }
      if (count>(m+n)/2)
      {
        printf("\n its is an sparse matrix\n");
        printf("Row\t Col\t value\n");
        for ( i = 0; i < m; i++)
        {
          for ( j = 0; j < n; j++)
          {
            if(a[i][j]!=0)
              printf("%d\t%d\t%d\n",i,j,a[i][j]);
          }                        
        }
      }
      else
        printf("\n its not a sparse matrix");        
}