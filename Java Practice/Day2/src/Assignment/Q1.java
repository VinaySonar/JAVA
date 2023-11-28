package Assignment;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int b=0;
		while(b>=0) {
			System.out.println("Enter a number to add");
			int a=sc.nextInt();
			b=a+b;
			System.out.println("Total "+(b));
		}
		sc.close();
	}

}
