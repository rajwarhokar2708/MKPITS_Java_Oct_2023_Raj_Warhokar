/*Accept year check wheather it is leap year or not
year which is divisible by 4 or which is not divisible by 100 or which is divisible by 400*/

#include<stdio.h>
int main()
{
	int year;
	printf("enter a year : ");
	scanf("%d",&year);
	if((year % 4==0&&year % 100!=0)||year % 400==0)
	{
		printf("%d is leap year",year);
	}
	else{
		printf("%d is not a leap year",year);
	}
}
