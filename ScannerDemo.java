package com.flm.identifiers;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		Scanner scannerObject = new Scanner(System.in);
		System.out.println("please enter string value");
		String str = scannerObject.nextLine();
		System.out.println("You have entered : "+str);
		char char0 = str.charAt(0);//F
		char char1 = str.charAt(1);//L
		char char2 = str.charAt(2);//M
		System.out.println(char0);
		System.out.println(char1);
		System.out.println(char2);



	}

	  void runTimeDataForPrimitiveValues() {
		Scanner scannerObject = new Scanner(System.in);
		// 8 data types
		System.out.println("Please enter byte value");
		byte b = scannerObject.nextByte();

		System.out.println("Please enter short value");
		short s = scannerObject.nextShort();

		System.out.println("Please enter int value");
		int i = scannerObject.nextInt();

		System.out.println("Please enter long value");
		long l = scannerObject.nextLong();

		System.out.println("Please enter double value");
		double d = scannerObject.nextDouble();

		System.out.println("Please enter float value");
		float f = scannerObject.nextFloat();

		System.out.println("Please enter boolean value");
		boolean bool = scannerObject.nextBoolean();
		/////////////////////

		System.out.println("Please enter String value");
		String str = scannerObject.nextLine();

		System.out.println("Please enter char value");
		char c = scannerObject.nextLine().charAt(0);

		System.out.println("Results :: ***");
		System.out.println("Byte value is :: " + b);
		System.out.println("Short value is :: " + s);
		System.out.println("Int value is :: " + i);
		System.out.println("Long value is :: " + l);
		System.out.println("Float value is :: " + f);
		System.out.println("Double value is :: " + d);
		System.out.println("boolean value is :: " + bool);

		System.out.println("Str value is :: " + str);
		System.out.println("char value is :: " + c);
	}

	private static void sumOfTwoNumberUsingScannerClass() {
		// OOP
		Scanner scannerObject = new Scanner(System.in);
		System.out.println("Welcome to MIT solutions!!");
		System.out.println("please enter a value ");
		int a = scannerObject.nextInt();// dynamic ga data capture
		System.out.println("please enter b value");
		int b = scannerObject.nextInt();// dynamic data reading
		int r = a + b;

		System.out.println("Result is  " + r);
	}
}
