package com.wipro.arrays;

public class Array7 {
	public static void main(String[] args) {
		int[] a= {5,7,1,2,1,};
		int l=a.length;
		int i,j;
		for(i=0;i<l-1;i++)
		{
			for(j=0;j<i;j++)
			{
				if(a[i]==a[j])
				{
					break;
				}
			}
			if(i==j) System.out.println(a[i]);
		}
		
	}
}
