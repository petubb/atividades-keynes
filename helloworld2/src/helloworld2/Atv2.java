package helloworld2;

import java.util.Scanner;

public class Atv2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("qual teu nome?");
		String nome = sc.nextLine();
		
		System.out.println("Ola" +nome+ "!");
	}
}
