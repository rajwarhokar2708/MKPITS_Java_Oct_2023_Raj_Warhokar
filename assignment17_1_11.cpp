#include<stdio.h>
int main()
{
	char ch;
	printf("enter a something : ");
	scanf("%c",&ch);
	if(ch>=97 && ch<=122)
	{
		printf("Lowercase");
	}
	else if(ch>=65&&ch<=90)
	{
		printf("Uppercase");
	}
	else if(ch>=45&&ch<=57)
	{
		printf("Numberic digit");
	}
	else{
		printf("special character");
	}
}
