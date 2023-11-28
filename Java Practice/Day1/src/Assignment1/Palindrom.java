package Assignment1;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		int res=0,rem, a;
		a = num;
		while (num > 0) {
			rem = num % 10;
			res = res * 10 + rem;
			num = num / 10;
		}
		if (a == res) {
			System.out.println("The number is Palindrom");
		} else {
			System.out.println("The number is not Palindrom");
		}sc.close();
	}

}
