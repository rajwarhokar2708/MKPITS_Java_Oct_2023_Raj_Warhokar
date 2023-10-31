//Accept unit consume of electricity and calculate bill

#include<stdio.h>
int main()
{
	float unit,bill;
	printf("Enter a Unit : ");
	scanf("%f",&unit);
	if(unit<100)
	{
		bill=unit*1;
		printf("Bill is %fRs",bill);
	}
	if(unit>=100&&unit<200)
	{
		bill=unit*1.25;
		printf("Bill is %fRs",bill);
	}
	if(unit>200&&unit<300)
	{
		bill=unit*1.50;
		printf("Bill is %fRs",bill);
	}
	if(unit>300&&unit<400)
	{
		bill=unit*1.75;
		printf("Bill is %fRs",bill);
	}
	if(unit>=400)
	{
		bill=unit*2;
		printf("Bill is %fRs",bill);
	}
	
}
