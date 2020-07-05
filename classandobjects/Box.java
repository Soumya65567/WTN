package com.wipro.classandobjects;

public class Box {
		double h,w,d;
		Box(double height,double width,double depth)
		{
			h=height;
			w=width;
			d=depth;
		}
		double volume()
		{
			double v;
			v=h*w*d;
			return v;
		}
		public static void main(String[] args)
		{
			Box bc=new Box(23.2,8.5,56.4);
			System.out.println(bc.volume());
		}
}
