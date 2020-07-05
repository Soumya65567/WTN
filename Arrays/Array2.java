package com.wipro.arrays;

public class Array2 {
		public static void main(String[] args)
		{
			int a[]=new int[] {20,30,40,50,60};
			int i,max=a[0],min=a[0];
			int l = a.length;
			for(i=0;i<l;i++)
			{
				if(a[i]<min)
				{
					min=a[i];
				}
				else if(a[i]>max)
				{
					max=a[i];
				}
			}
			System.out.println("minimum element is:"+" "+min);
			System.out.println("maximum element is:"+" "+max);
		}
}
