#include<stdio.h>
int main()
{
	int x,y,z,angle;
	{
		printf("enter a angle");
		scanf("%d%d%d",&x,&y,&z);
		angle=x+y+z;
		if(angle==180)
		{
			printf("It is triangle ");
		}
		else
		{
			printf("It is not triangle");
		}
	}
}
