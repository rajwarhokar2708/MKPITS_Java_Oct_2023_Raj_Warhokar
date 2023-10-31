//Accept 3 no. and display greatest

#include<stdio.h>
int main()
{
	int num1,num2,num3;
	printf("enter a number : ");
	scanf("%d%d%d",&num1,&num2,&num3);
	if(num1>num2&&num1>num3)
	{
		printf("Num1 is gretest");
	}
	if(num2>num1&&num2>num3)
	{
		printf("Num2 is gretest");	
	}
	if(num3>num1&&num3>num2)
	{
		printf("Num3 is gretest");
	}
}
