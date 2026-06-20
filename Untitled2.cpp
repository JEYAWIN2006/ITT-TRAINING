#include <stdio.h>
int main() {
	int n;
	printf("Enter the n value:");
	scanf("%d",&n);
	int spaces;
	for(int i=0;i<=n;i++){
		spaces=n-i;
		for(int j=0;j<spaces;j++){
			printf(" ");
		}
		for(int j=i;j>=1;j--){
			printf("%d",j);
		}
		printf("0");
		for(int j=1;j<=i;j++){
			printf("%d",j);
		}
	    printf("\n");
	}
}