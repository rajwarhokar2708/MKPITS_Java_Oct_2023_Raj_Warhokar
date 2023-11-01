// 1) Accept marks if it is greater than equal to 50 than display pass otherwise Fail 

#include<stdio.h>
int main()
{
	int marks;
	printf("Enter the marks : ");
	scanf("%d",&marks);
	if(marks>=50)
	{
		printf("Pass");
	}
	else{
		printf("Fail");
	}
	return 0;
}
