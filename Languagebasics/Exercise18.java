package com.wipro.languagebasics;

public class Exercise18
{
	public static void main(String[] args)
	{
		int i,j;
		int flag=0;
		for(j=10;j<=99;j++)
			{
				flag=0;
				for(i=2;i<=j/2;i++)
					{
						if(j%i==0)
							{
								flag=1;
							}
		             }
				if(flag!=1)
				{
					System.out.println(j);
				}
			}
	}

}