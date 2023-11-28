package Assignment;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Character");
		char a = sc.next().charAt(0);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		for (int i=0;i<=num;i++) {
			System.out.println(a++);
		}
	}

}
