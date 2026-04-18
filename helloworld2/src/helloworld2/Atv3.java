package helloworld2;

import java.util.Scanner;

public class Atv3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("digite o primeiro numero:");
		int num1 = sc.nextInt();
		
		System.out.println("digite o segundo numero:");
		int num2 = sc.nextInt();
		
		System.out.println("= " + (num1+num2));
	}
}
