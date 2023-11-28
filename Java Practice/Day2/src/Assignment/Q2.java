package Assignment;

import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers:");
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=0;
		for (int i=0;i<=y;i++) {
		 z=x*y;
		
		}
		System.out.println((x)+" to the power of "+(y)+": "+(z));
		
	sc.close();
	}

}
