package helloworld2;

import java.util.Scanner;

public class Atv4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero");
		Double num1 = sc.nextDouble();
		
		System.out.println("Digite o segundo numero");
		Double num2 = sc.nextDouble();
		
		System.out.println("Digite o terceiro numero");
		Double num3 = sc.nextDouble();
		
		Double media = (num1+num2+num3)/3;
		
		System.out.println("media = " + media);
	}

}
