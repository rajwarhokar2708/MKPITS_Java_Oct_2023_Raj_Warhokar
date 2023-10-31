/*Accpet marks of PCM if marks in each subject is greater than equal to 50 or average is 
greater than equal to 60 than display pass otherwise fail*/

#include<stdio.h>
int main()
{
	int phy,maths,che,total_marks,avg;
	printf("Enter a marks:");
	scanf("%d%d%d",&phy,&maths,&che);
	avg=(phy+maths+che)/3;
	if((phy>=50,maths>=50,che>=50)||(avg>=60))
	{
		printf("Pass");
	}
	else{
		printf("Fail");
	}
}


