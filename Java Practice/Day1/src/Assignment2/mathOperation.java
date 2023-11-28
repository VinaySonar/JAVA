package Assignment2;

import java.security.PublicKey;
import java.util.Scanner;

public class mathOperation {

	public void add(int a, int b) {
		int c = 0;
		c = a + b;
		System.out.println("The addition is " + c);
	}

	public void add(float a, float b) {
		float c = 0;
		c = a + b;
		System.out.println("The addition is " + c);
	}
	public void add(double a, double b) {
		double c = 0;
		c = a + b;
		System.out.println("The addition is " + c);
	}
	public void add(int...numbers) {
		double c = 0,sum=0,num=0;
		for (num:numbers) {
			sum+=sum+num;
		}
	}
	
}
