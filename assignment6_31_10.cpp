/*Accept marks of return test and interview if marks in each is greater than equal to 50 
then candidate is selected*/

#include<stdio.h>
int main()
{
	//ret=return test marks inte=interview  marks
	int ret,inte;
	printf("enter the marks");
	scanf("%d%d",&ret,&inte);
	if(ret>=50&&inte>=50)
	{
		printf("Candidate is selected");
	}
	else{
		printf("Candidate is not selected");
	}
}
