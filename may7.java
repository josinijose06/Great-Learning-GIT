package may;

import java.util.Scanner;



public class may7 {

	public static void main(String[] args) {
		
System.out.println("Hello World!!");
Scanner outputVal=new Scanner(System.in);

//Integer value
/*
 int inputNumber=0;
System.out.println("Enter a number");
inputNumber=outputVal.nextInt();
System.out.println("the value you entered is "+inputNumber);*/

//String Value

//System.out.println("Enter the string");
//String name=outputVal.nextLine();
//System.out.println("the string entered is "+name);

System.out.println("Enter the string");
char first=outputVal.next().charAt(0);
System.out.println("the string entered is "+first);
	}

}
