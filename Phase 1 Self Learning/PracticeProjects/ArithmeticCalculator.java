package PracticeProjects;

import java.util.Scanner;

public class ArithmeticCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number:");
		a=sc.nextDouble();
		System.out.println("Enter the second number:");
		b=sc.nextDouble();
		double add=a+b;
		double sub=a-b;
		double mul=a*b;
		double div=a/b;
		System.out.println("Addition of a and b is :"+add);
		System.out.println("Subtration of a and b is :"+sub);
		System.out.println("Multiplication of a and b is :"+mul);
		System.out.println("Division of a and b is :"+div);
		
	}

}
