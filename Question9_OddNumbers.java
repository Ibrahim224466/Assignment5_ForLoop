package assignments.Assignment5_ForLoop;

public class Question9_OddNumbers {

	public static void main(String[] args) {
	
		
//	Question-9:
//	Write a program for the following logic:
//	Print all the odd numbers in comma-separated form from 1 till the end (you may change it):
//	if end = 10, OUTPUT = 1, 3, 5, 7, 9
//	if end = 11, OUTPUT = 1, 3, 5, 7, 9, 11
//	You should use while loop and if-else statements.
//	Note that, there should not be any comma after the last digit.
		
			
			
			int i=1;
			
			while( i<=25) {
			if (i%2!=0)
					
			System.out.print(i);

			i+=2;			
			 if (i<=25)
			 System.out.print(", ");
	
	     }
	
			
	}

}
