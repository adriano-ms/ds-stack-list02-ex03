package view;

import java.util.Scanner;

import controller.FacController;

public class Main {

	public static void main(String[] args) {
		
		FacController facController = new FacController();
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		
		while(input < 0 || input > 10) {
			System.out.println("The value must be between 0 and 10");
			input = sc.nextInt();
		}
		
		System.out.println(input + "! = " + facController.factorial(input));
		
		sc.close();
	}

}
