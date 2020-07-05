package com.wipro.languagebasics;

public class Exercise23 {
		public static void main(String[] args)
		{
			int n=1;
			int i=0;
			while(n!=6)
			{
				i++;
				if(i%2==0 && i%3==0 && i%5==0)
				{
					System.out.println(i);
					n++;
				}
			}
		}
}
