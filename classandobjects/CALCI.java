package com.wipro.classandobjects;

public class CALCI {
		public static void main(String[] args)
		{
			System.out.println(Calculator.powerDouble(35.0,9));
			System.out.println(Calculator.powerInt(35,9));
		}
}
		class Calculator
		{
			 static double powerInt(int num1,int num2)
			{
				return Math.pow(num1,num2);
			}
			static double powerDouble(double num1,int num2)
			{
				return Math.pow(num1,num2);
			}
		}

		