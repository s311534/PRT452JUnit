package com.prabhatPRT452.learn;

import java.util.Scanner;

public class Calculation implements Gradient, Distance, EquationOfLine {

	@Override
	public String eq(double x1, double y1, double grad) {
		// TODO Auto-generated method stub
		double output = y1 - (grad*x1);
		String res= "y -"+grad+"x =" +output;
		return res;
	}

	@Override
	public double dist(double x1, double y1, double x2, double y2) {
		// TODO Auto-generated method stub
		double res = Math.sqrt((x2 - x1)*(x2 - x1)+ (y2 - y1)*(y2 - y1));
		return res;
	}

	@Override
	public double grad(double x1, double y1, double x2, double y2) {
		// TODO Auto-generated method stub
		double res= (y2 - y1)/(x2 - x1);
		return res;
	}
	public static void main(String[] args){
		double x1, x2, y1, y2;
		double dist;
		double grad;
		String eq;
		
		final Calculation test;
		test= new Calculation();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter x1 for point one: ");
		x1 = scanner.nextDouble();
		System.out.println("Enter y1 for point one: ");
		y1 = scanner.nextDouble();
		System.out.println("Enter x2 for point two: ");
		x2 = scanner.nextDouble();
		System.out.println("Enter y2 for point two: ");
		y2 = scanner.nextDouble();
		
		grad = test.grad(x1, y1, x2, y2);
		dist = test.dist(x1, y1, x2, y2);
		eq = test.eq(x1, y1, grad);
		
		System.out.println("The distance is: "+dist+".");
		System.out.println("The gradient is: "+grad+".");
		System.out.println("The equation of line is: "+eq+".");
	}
}
