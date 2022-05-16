package may;

public class patternDemo {

	public static void main(String[] args) {
		/**
		 * Nested while loop
		 * 123
		 * 123
		 * 123		 
		 */
		
//			int row=1;
//			while(row<=3){
//				int col=1;
//				while(col<=3){
//					System.out.print(col +" ");
//					col++;
//					
//				}
//				System.out.println("");
//				row++;
//			}
			
			/**
			 * Nested while loop
			 * 123
			 * 456
			 * 789	 
			 */

		int row=1;
		while(row<=3) {
			
			int col=1;
			while(col<=3) {
				System.out.print(col+"");
				col++;
				
			}
			
			System.out.println("");
			row++;
			
			
		}
	}

}
