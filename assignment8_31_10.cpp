/*accept a marks display a grade*/

#include<stdio.h>
int main()
{
	int marks;
	printf("Enter a marks : ");
	scanf("%d",&marks);
	if(marks<50)
	{
		printf("Grade E");
		
	}
	if(marks>50&&marks<=60)
	{
		printf("Grade D");
	}
	if(marks>60&&marks<=70)
	{
		printf("Grade C");
	}
	if(marks>70&&marks<80)
	{
		printf("Grade B");
	}
	if(marks>=80)
	{
		printf("Grade A");
	}
}
