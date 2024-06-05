# Java

1)WHO WILL TRANSLATE SYSTEM TO MACHINE LEVEL?
  -COMPILER + INTERPRETER.

2)HELLO.JAVA ----COMPILIER-->HELLO.CLASS(BYTE  code which is neither machine or understandable code)-- Machine-- interpreter intepretes line by   line in the machine.



3)public class HelloWorld{

public static void main(String[] args) {
   System.out.println("Hello World!!!");
}
}
akhilpagadapoola@Akhils-MacBook-Air Documents % ls
HelloWorld.java			aws
Hibernate error doc.txt		git.txt
Hibernate new error doc.txt	ias.txt
Pay Slips
akhilpagadapoola@Akhils-MacBook-Air Documents % javac HelloWorld.java
akhilpagadapoola@Akhils-MacBook-Air Documents % java HelloWorld
Hello World!!!


4) JDK- JAVA DEVELOPMENT KIT- JDK is combinatioon of JRE and Dev tools-java compilier, java debugger, java doc
5) JRE- JAVA RUNTIME ENVIRONMENT- JRE is combination of JVM + Runtime libraries
6) JVM- JAVA VIRTUAL MACHINE

                 (jdk --compiler)                         JVM+JRE
7)HelloWorld.java----------->HelloWorld.class (bytecode)------------> INPUT TO JVM---->CLASSLOADER---METHOD AREA,HEAP AREA,Stack Memory,Program Counter------------>(Execution Engine)--->interpreter(reads code line by line--> JIT (Just in time compiler) IF repeated methods it quickly compile-- Garbage collector----JNI(Java Native interface).

METHOD AREA - contains class datax
HEAP AREA-- contains objects
STACK MEMORY- Local variables are stores in stack memory
Program Counter- cuurent execution next execution status
Native Method- We can run other programing langagues 


InterviewQuestion Note:
1.You can compile a java code without a main method.
2.You cannot run a java code without a main method.


package com; //optional

import ...;// on demand

class HelloWorld {
//var
//methods: set of instructions
//constructor
//blocks

}



public static void main(String args []){
}

public- Access specifier
static- keyword
void- return type
main- method name
String args[] - Array of string type


Identifiers:
==============
package com.flm.identifiersdemo;

public class IdentifiersDemo {

	public static void main(String[] args) {
		
		int x=10;
		
		int a2=250;
		System.out.println(a2);
	}
}

Datatypes:
============

package com.flm.identifiersdemo;

public class DataTypesDemo {

	public static void main(String[] args) {
		
		//integral data types
		byte b =127;
		short s =12999;
		int i =1299999999; //preferred
		long l=899999999; 
		
		//decimal values
		float f=12.3888888888888888888888888f;
		double d =123.458687677777777777777777777;//preferred
		
		//boolean
		
		boolean k =true;
		boolean k2=false;
		
		
		//char
		char c='A';
		char c1=65;
		
		
		
		System.out.println("Byte value is "+b);
		System.out.println("Short value is "+s);
		System.out.println("int  value is "+i);
		System.out.println("long value is "+l);
		System.out.println("float value is "+f);
		System.out.println("double value is "+d);
		
		System.out.println("boolean value is "+k);
		System.out.println("boolean value is "+k2);
		
		System.out.println("character value is "+c+c1);
	}
	
}




