/*accept a marks display a grade*/

#include<stdio.h>
int main()
{
	int marks;
	printf("Enter a marks : ");
	scanf("%d",&marks);
	if(marks<=50)
	{
		printf("Grade E");
		
	}
	else if(marks<=60)
	{
		printf("Grade D");
	}
	else if(marks<=70)
	{
		printf("Grade C");
	}
	else if(marks<80)
	{
		printf("Grade B");
	}
	else
	{
		printf("Grade A");
	}
}
