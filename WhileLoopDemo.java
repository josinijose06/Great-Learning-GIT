package may;

import java.util.Scanner;

public class WhileLoopDemo {

	public static void main(String[] args) {
//		int i=1;
//		System.out.println("Please enter the last no till where you want to print the odd no");
//		Scanner outputNumber=new Scanner(System.in);
//		int number=outputNumber.nextInt();
//		
//		while(i<=number) {
//			if(i%2!=0) 
//				System.out.println(i);
//				i++;
//			
//		}
//			kkkkkkk
//
		//Do while statement
			int sum=0, start=1;
			
			do {
				sum+=start;
				start++;
			}while(start<=10);
			System.out.println("Sum is"+sum);
			
	}
	
	

}
