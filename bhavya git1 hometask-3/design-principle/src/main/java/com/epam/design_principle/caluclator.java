package com.epam.design_principle;

import java.util.Scanner;
public class caluclator {

		public static void main(String[] args) {
			System.out.println("Welcome to simple calculator!");
			boolean n = true;
			Scanner sc = new Scanner(System.in);
			while(n) {
				System.out.println("Operations available:-");
				System.out.println("ADD +");
				System.out.println("SUBTRACT - ");
				System.out.println("MULTIPLY *");
				System.out.println("DIVIDE /");
				System.out.println("Enter the numbers to perform the operations on");
				double x, y;
				x = sc.nextDouble();
				y = sc.nextDouble();
				System.out.println("Select an operator(+ - * /)");
				char choice = sc.next().charAt(0);
				double ans = 0;
				char rep;
				try {
					operations o  = new operations();
				switch(choice) {
					case '+':
						ans = o.add(x,y);
						System.out.println("The sum = " +ans);
						System.out.println("Do you want to perform any other operations? (Y/N)");
						rep = sc.next().charAt(0);
						if(rep == 'Y' || rep == 'y') {
							n = true;
							break;
						} else {
							n = false;
							System.out.println("Thankyou! :)");
							break;
						}
					case '-':
					    ans = o.subtract(x, y);
						System.out.println("The difference = " +ans);
						System.out.println("Do you want to perform any other operations? (Y/N)");
						rep = sc.next().charAt(0);
						if(rep == 'Y' || rep == 'y') {
							n = true;
							break;
						} else {
							n = false;
							System.out.println("Thankyou! :)");
							break;
						}
					case '*':
					    ans = o.multiply(x, y);
						System.out.println("The product = " +ans);
						System.out.println("Do you want to perform any other operations? (Y/N)");
						rep = sc.next().charAt(0);
						if(rep == 'Y' || rep == 'y') {
							n = true;
							break;
						} else {
							n = false;
							System.out.println("Thankyou! :)");
							break;
						}
					case '/':
					    ans = o.divide(x, y);
						System.out.println("The quotient = " +ans);
						System.out.println("Do you want to perform any other operations? (Y/N)");
						rep = sc.next().charAt(0);
						if(rep == 'Y' || rep == 'y') {
							n = true;
							break;
						} else {
							n = false;
							System.out.println("Thankyou for you using the simple calculator! :)");
							break;
						}
					}
				} catch(Exception e) {
		        	System.out.println("Please select a valid operator!");
				}
			}
		}

	}


