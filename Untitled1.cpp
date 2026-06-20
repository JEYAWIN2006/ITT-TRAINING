#include <stdio.h>
int main() {
    int n = 5;
    int arr[5][5];
    int val=1;
    for (int i=1;i<=n;i++) {
        for (int j=i;j<=n;j++) {
            arr[j-1][j-i]=val++;
        }
    }
    for (int i=0;i<n;i++) {
        for(int s=0;s<(n-i-1);s++) {
            printf("   "); 
        }
        for (int j=0;j<=i;j++) {
            printf("%2d ",arr[i][j]);
        }
        printf("\n");
        
    }

    return 0;
}
