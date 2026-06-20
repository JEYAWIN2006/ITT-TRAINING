#include<stdio.h>
int main(){
	int n,eq;
	printf("Enter the n value: ");
	scanf("%d",&n);
	if(n%2==0){
		printf("Enter a valid odd integer:");
		return 0;
	}
	for(int i=0;i<n;i++){//top and bottom
		if(i==0 || i==n-1){
			for(int j=0;j<n;j++){
				printf("* ");
			}
		}
		else{
			if(i>n/2){
				eq=(n-1-i);
			}
			else{
				eq=i;
			}
		int stars=(n/2)+1-eq;
		int spaces=n-(2*stars);
		for(int j=0;j<stars;j++){//left
			printf("* ");
		}
		for(int j=0;j<spaces;j++){//centre space
			
			printf("  ");
		}
		for(int j=0;j<stars;j++){//right
			printf("* ");
		}
	}
	printf("\n");
}
}