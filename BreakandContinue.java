package may;

public class BreakandContinue {

	public static void main(String[] args) {
		/**Break keyword
		 * 
		 * Print the number from 1 to 50 but stop the loop if we encounter any number which
		 *is divisible by 2 and 3 and  5
		 */
		
//		for(int i=1;i<=50;i++)
//		{
//			if(i%2==0 && i%3==0 && i%5==0) {
//				break;
//			}
//			System.out.println(i);
//				  
//			
//		}
		/**continue keyword
		 * 
		 * Print the no b/w 1 to 5 and skip no which is divisible by 2 and 3
		 */
		for(int i=1;i<=50;i++)
		{
			
			if(i%2==0 && i%3==0) {
				continue;
			}
			System.out.println(i);
				  
		}
	}

}
