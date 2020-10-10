package assignments.Assignment5_ForLoop;

public class Question8_UpperBound {

	public static void main(String[] args) {
		
//		Write a program to calculate the sum of the numbers from 1 till 10
//		You should use a while loop.
		
		
		int i=1;
	int sumNumber=0;

				
				while( i<=10) {
					 
					System.out.print(i);
					sumNumber=sumNumber+i;
					i++;
					if (i<=10) {
						System.out.print(" + ");
						
					}
				
				
			

				
				
		
	}
				System.out.print(" = "+ sumNumber);
	}
}
