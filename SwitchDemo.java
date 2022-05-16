package may;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		/*
		 * 1. Deposit
		 * 2. Withdrawal
		 * 3. Balance check
		 * apart from this option if user is pressing anything it will display message to user saying
		 *"please provide correct option"
		 */
		Scanner object =new Scanner(System.in);
		System.out.println("Please provide the input");
		int input =object.nextInt();
		switch(input) 
		{
		case 1:
			System.out.println("Deposit the amount");
		break;
		case 2: 
			System.out.println("Withdrawal the amount");
			break;
		case 3:
			System.out.println("Balance check");
			break;
		default:
			System.out.println("please eneter correct input");
			
		
		}
		

	}

}
