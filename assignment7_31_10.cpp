/*Accept marks of return test if it is greater than equal to 50
than accept of interview if it is also greater than equal to 50 than iit shows in display as selcted 
otherwise rejected*/

#include<stdio.h>
int main()
{
	//ret=return test marks inte=interview  marks
	int ret,inte;
	printf("enter the marks");
	scanf("%d%d",&ret,&inte);
	if(ret>=50&&inte>=50)
	{
		printf("Candidate is Selected");
	}
	else
	{
		printf("Candidate is Rejected");
	}
}


