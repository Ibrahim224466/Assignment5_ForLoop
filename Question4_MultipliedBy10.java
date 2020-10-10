package assignments.Assignment5_ForLoop;
import java.util.Scanner;
public class Question4_MultipliedBy10 {

	public static void main(String[] args) {
		
//	Question-4:
//	Write a while loop that lets the user enter a number.
//	The number should be multiplied by 10, and the result stored in the variable product.
//	The loop should iterate as long as product contains a value less than 100.
	
		
		int number=0;
		while ((number*10)<100) {
		Scanner scan=new Scanner (System.in);
		
		System.out.println("Enter a number");
		 number=scan.nextInt();
		 
		 int result=number*10;
		 if (result<100)
		 System.out.println("Result: "+ result);
		 
		
	}

	}
}

