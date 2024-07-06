

Scanner
=========

package com.flm.identifiersdemo;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		
		
		   Scanner so = new Scanner(System.in);
	        System.out.println("Please enter byte value");
	        byte b = so.nextByte();

	        System.out.println("Please enter short value");
	        short s = so.nextShort();

	        System.out.println("Please enter int value");
	        int i = so.nextInt();

	        System.out.println("Please enter long value");
	        long l = so.nextLong();

	        System.out.println("Please enter double value");
	        double d = so.nextDouble();

	        System.out.println("Please enter float value");
	        float f = so.nextFloat();

	        System.out.println("Please enter boolean value");
	        boolean bool = so.nextBoolean();
	        
	        // Consume the newline character
	        so.nextLine();

	        System.out.println("Please enter char value");
	        char c = so.nextLine().charAt(0);

	        System.out.println("Please enter string value");
	        String str = so.nextLine();

	        System.out.println("Byte value is " + b);
	        System.out.println("Short value is " + s);
	        System.out.println("Int value is " + i);
	        System.out.println("Long value is " + l);
	        System.out.println("Float value is " + f);
	        System.out.println("Boolean value is " + bool);

	        System.out.println("Char value is " + c);
	        System.out.println("String value is " + str);

	        scannerFunction();
	}

	private static void scannerFunction() {
		//Java is a object oriented language OOP
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Welcome to MIT Solutions");
	    System.out.println("Please enter a value");
        int a =s.nextInt();
        System.out.println("Please enter b value");
        int b = s.nextInt();
        
        int result = a+ b;
        System.out.println(result);
		
		helloWorld();
	}

	private static void helloWorld() {
		System.out.println("Hello World");
	}
}


Scanner next line:
=====================

package com.flm.identifiersdemo;

import java.util.Scanner;

public class ScannerNextLine {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your first name");
		
		String firstName = s.next();
		s.nextLine();
		System.out.println("Enter your second name");
		String secondName=s.nextLine();
		
		System.out.println("Your full name "+ firstName+secondName);
		
		
	}
}

LOGICAL OPERATORS
====================

package com.flm.identifiersdemo;

import java.util.Scanner;
public class OperatorsDemo {

	public static void main(String[] args) {
		
	
		boolean b1=false;
		boolean b2=true;
		
		System.out.println(b1 || b2); //true
		System.out.println(!b1); //true
		System.out.println((b1 && b2) || (b2 || b1));//true
 	
	}
PredIncrement and PostIncrement:
=====================================
	private static void preIncrementAndPostIncrement() {
		// pre increment and post increment 
		
		int a=10;
		
		System.out.println(++a);//11
		System.out.println(a++);//11
		System.out.println(a);//12
		System.out.println(--a);//11
		System.out.println(a--);//11
		System.out.println(a);//10
	}

Swapping of Two Numbers:
===========================
	private static void swappingOfTwoNumbers() {
		Scanner s = new Scanner(System.in);
		
//		int a=10;
//		int b=20;
//		
//		a+=b; //a=a+b
//		a-=b; //a=a-b
//		System.out.println("Res "+a);
		
		//swapping of two variables first logic
//	int a=10;
//	int b=20;
//	int c=a;
//	a=b;
//	b=c;
//	System.out.println(a);
//	System.out.println(b);
	
	// second logic for swapping of two variables first logic
		int a=10;
		int b=20;
	
     a=a+b;
     b=a-b;
     a=a-b;
     
 	System.out.println(a);
 	System.out.println(b);
	}

Arthimetic Operators:
======================

	private static void arthOperators() {
		Scanner sc = new Scanner(System.in);
		//+ - * / %
		
		System.out.println("Enter your first no: ");
		int a=sc.nextInt();
		System.out.println("Enter your second no: ");
		int b=sc.nextInt();
		
		int sum = a+b;
		
		System.out.println("Sum of two numbers "+sum);
		System.out.println("Sub of two number "+(a-b));
		System.out.println("mul of two numbers "+ (a*b));
		System.out.println("div of two numbers "+(a/b));
	}
}


Relation Operators:
======================

package com.flm.identifiersdemo;

import java.util.Scanner;
public class OperatorsDemo {

	public static void main(String[] args) {
		
	
		relationOperators();
			
		
 	
	}

	private static void relationOperators() {
		int a=10;
		int b=20;
		
		boolean r1 = !(a==b);// true
		System.out.println(r1);
				
		boolean r2 = (a!=b);//true
		System.out.println(r2);
		
		boolean r3 = (a>b);//false
		System.out.println(r3);
		
		boolean r4 = (a<b);//true
		System.out.println(r4);
		
		boolean r5 = (a>=b);//false
		System.out.println(r5);
		
		boolean r6 = (a<=b);//true
		System.out.println(r6);
	}


Terinary Operators:
====================


package com.flm.identifiersdemo;

import java.util.Scanner;
public class OperatorsDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your first no : ");
		int a = sc.nextInt();
		
		System.out.println("Enter your second no : ");
		int b = sc.nextInt();
		
		System.out.println("Enter your third no : ");
		int c = sc.nextInt();
		
//		int a=100;
//		int b=20;
		
	   int highestNumber = (a>b)? ((a>c)? a:c):((b>c)? b:c);
	   
//	   int highestNumber = (a>b) && (a>c)? a: (b>c)? b:c;
	   
	   System.out.println("highestNumber "+ highestNumber);
	   
		
 	
	}


Conditional Statements
=========================

package com.flm.identifiersdemo;

import java.util.Scanner;

public class CondtionalStatements {

	public static void main(String[] args) {
		
		String su1="akhil";
		String sp1="123";
		
		Scanner sc = new Scanner(System.in);		
		System.out.println("Enter your username");
		String su2 = sc.nextLine();
		System.out.println("Enter your password");
		String sp2= sc.nextLine();
		
		
		
		if((su1.equals(su2))&&(sp1.equals(sp2))) {
			System.out.println("Welcome to instagram");
		}
		System.out.println("game over");
	}

	private static void evenOrOddProgram() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Even or odd program");
		
		
		System.out.println("Enter your a even");
		int a= sc.nextInt();
		
		int reminder = a%2;
		boolean isEven =reminder ==0;
  
		
		if(isEven) {
			System.out.println("Given no:" +a+ " is even");
			
		}
		
		System.out.println("Enter your a odd no");
		int b=sc.nextInt();
		
		if(b%2==0) {
			System.out.println("given no: "+b+" is even");
		}
		else {
			System.out.println("given no: "+b+" is odd");
		}
		System.out.println("game over");
	}
}


BreakStatement:
===================


package com.flm.identifiersdemo;

import java.util.Scanner;

public class CondtionalStatements {

	public static void main(String[] args) {
		
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter fav day");
		int favDay=sc.nextInt();
		
		switch(favDay) {
		
		case 1: {
			System.out.println("Nee fav day sunday");
			break;
		}
		
		case 2: {
			System.out.println("Nee fav day moday");
			break;
		}
		
		case 3: {
			System.out.println("Nee fav day tueday");
			break;
		}
		
		case 6: {
			System.out.println("Nee fav day friday");
			break;
		}
		
		default :{
			System.out.println("Every day is same");
		}
		
	  }
		
		
	}

Else ifstatement:
=======================

	private static void elseIFStatements() {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter marks");
		int marks = sc.nextInt();
		
		if(marks >=90 && marks <=100) {
			System.out.println("Neeku a grade");
		}
		
		else if(marks >=75 && marks<90) {
			System.out.println("Neeku b grade");
		}
		else if(marks >=60 && marks <75) {
			System.out.println("Neeku c grade");
		}
		else {
			System.out.println("Oops");
		}
	}

Nestedifelse statement:
===========================

	private static void nestedIfElseStatements() {
		int a=74;
		if(a>50 ) {
			if(a>=75) {
				System.out.println("a is above 50 and below 100");;
			}
			else {
				if(a==75) { 
					System.out.println("a val is 75");
				}
				else {
					System.out.println("tada");
				}
				
				System.out.println("Inner if else block");
			}
		}
	}

String Address Comparision
==============================
	private static void stringAdressComparision() {
		String su1="akhil";
		String sp1="123";
		
//		
//		String su2="akhil";
//		String sp2="123";
//		
//		if((su1==su2)&& (sp1==sp2)){
//			System.out.println("welcome");
//		}
//		System.out.println("over");
		
		
		Scanner sc = new Scanner(System.in);		
		System.out.println("Enter your username");
		String su2 = sc.nextLine();
		System.out.println("Enter your password");
		String sp2= sc.nextLine();
		
		
		
		if((su1.equals(su2))&&(sp1.equals(sp2))) {
			System.out.println("Welcome to instagram");
		}
		System.out.println("game over");
	}


EvenorOdd program
======================
	private static void evenOrOddProgram() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Even or odd program");
		
		
		System.out.println("Enter your a even");
		int a= sc.nextInt();
		
		int reminder = a%2;
		boolean isEven =reminder ==0;
		
		if(isEven) {
			System.out.println("Given no:" +a+ " is even");
			
		}
		
		System.out.println("Enter your a odd no");
		int b=sc.nextInt();
		
		if(b%2==0) {
			System.out.println("given no: "+b+" is even");
		}
		else {
			System.out.println("given no: "+b+" is odd");
		}
		System.out.println("game over");
	}
}


Looping statements:
=======================
package com.flm.identifiersdemo;

whileloop
===========
public class WhileloopDemo {

	public static void main(String[] args) {
		
		
		whileLoopDemo();
		
		for(int z=1;z<=3;z++) {
			System.out.println("Evening");
		}
		
		
	}

	private static void whileLoopDemo() {
		int i=5; /// Initialize
		
		while(i >= 1) { //Condition
			System.out.println("Good Morning  "+ i);
			i--; //Update
		}
		
	   int j=1; /// Initialize
		
		while(j<=5) { //Condition
			System.out.println("Good Evenin  "+ j);
			j++; //Update
		}
		
		
		int l=1;
		while (l<=10) {
			if(l% 2 == 0) {
				System.out.println(l);
			}
			l++;
		}
		
		int n=95845;
		int sumOfDigits=0;
		int temp=95845;
		
		while(n>0) {
			sumOfDigits= sumOfDigits + n%10;
			n=n/10;
		}
	
	   System.out.println("sumofdigits "+sumOfDigits);
	   int rem=(temp%9 ==0 ? 9: temp%9);
	   System.out.println(rem);
	   
	   int h =1234;
	   
	   int node=0;
	   
	   while(h>0) {
		   h=h/10;
		   node++;
		   
	   }

	   System.out.println("no of digits" +node);
	}
}

For Loop:
=============
package com.flm.identifiersdemo;

public class ForLoopDemo {

	public static void main(String[] args) {
		
		int outerloopvalue =0 ;
		int innerloopvalue=0;
		
		for(int i=1; i<=5;i++) {/// Outer Loop
	System.out.println(i);
	outerloopvalue++;
			for(int j=1; j<=i; j++) {///Inner loop
				if(j==3) {
			
					break;
				}
			System.out.println(j);
			innerloopvalue++;
				
			}
	System.out.println("*********");
	
	
		}
		System.out.println("outerloopvalue"+outerloopvalue);
		System.out.println("innerloopvalue"+innerloopvalue);
	}

	private static void forLoop() {
		System.out.println("five no using for loop");
		for(int i=1; i<=5;i++) {
			System.out.println(i);
		}
		
		System.out.println("five no using for whileloop");
		int i=1;
		
		while(i<=5) {
			System.out.println(i);
			i++;
		}
		
		System.out.println(" five no using for dowhileloop");
		int j=1;
		
		do {
			System.out.println(j);
			j++;
		}
		while(j<=5);
	}
}


Dowhile loop demo:
====================
package com.flm.identifiersdemo;



public class DoWhileDemo {

	 public static void main(String[] args) {
	
		 
		int i=1;
		do {
			System.out.println("inside do while");
			if(i%2==0) {
				System.out.println(i);	
			}
			i++;
		}while(i<=10);
	
	}

	private static void doWhileLoop() {
		int i=10;
		 
		 do {
			 System.out.println(i);
			 i++;
		 }while(i<5);
		 
		 
		 int j=1;
		 
		 while(j<=5) {
			 System.out.println(j);
			 j++;
		 }
		 
		 

		 int c=1;
		 
		 do {
			 if(c %2 ==0) {
				 System.out.println(c);
			 }
			 c++;
		 }while(i<=10);
	}
}


For loop Demo using break and continue:
===============================================

package com.flm.identifiersdemo;

public class ForLoopSecondDemo {
	
	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++) {
			
			if(i==3) {
				continue;
			}
			System.out.println(i);
		}
	}

}

package com.flm.identifiersdemo;

public class ForLoopSecondDemo {
	
	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++) {
			
			if(i==3) {
				break;
			}
			System.out.println(i);
		}
	}

}

Inner and Outer loop using continue in ForLoop:
==================================================
package com.flm.identifiersdemo;

public class ForLoopSecondDemo {
	
	public static void main(String[] args) {
		int outerLoop =1;
		int innerLoop =1;
		
		for(int i=1; i<=5; i++) {
			
			System.out.println(i);
			outerLoop++;
			
			for(int j=1; j<=i; j++) {
				
				if(j==3) {
					continue;
				}
				System.out.println(j);
				innerLoop++; 
			}
			
			System.out.println("*******");
			
		}
		System.out.println("Outerloop"+outerLoop);
		System.out.println("InnerLooop"+innerLoop);
		
		
	}

}


