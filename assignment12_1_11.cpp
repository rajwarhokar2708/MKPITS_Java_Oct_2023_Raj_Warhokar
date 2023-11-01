#include<stdio.h>
int main()
{
	int a,b,c;
	printf("Enter a length :");
	scanf("%d%d%d",&a,&b,&c);
	if(a==b==c)
	{
		printf("It is equilater triangle");
	}
	if((a==b||a==c)&&(b==a||b==c))
	{
		printf("isolated");	
	}
	else{
		printf("scaler");
	}
}
