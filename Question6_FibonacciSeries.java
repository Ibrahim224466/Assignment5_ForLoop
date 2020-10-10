package assignments.Assignment5_ForLoop;
import java.util.Scanner;
public class Question6_FibonacciSeries {

	public static void main(String[] args) {
		
//Write a program to print Fibonacci series of n terms where n is declared by
//user :  0, 1, 1, 2, 3, 5, 8, 13, 21, 34,......
   
  Scanner scan=new Scanner (System.in);
  System.out.println("Please enter the number of terms for Fibonacci series: ");
  
  int n=scan.nextInt();
  
  
  
   
//   int Number1 = 0;
//   int Number2 = 1;
//   int Number3;  
//   System.out.print("Fibonacci Series of "+n+" numbers: ");
//      int i=1;
//      while(i <= n) {
//          System.out.print(Number1+" ");
//          Number3 = Number1 + Number2;
//          Number1 = Number2;
//          Number2 = Number3;
//          i++;
//
//   }

  
  int Number1 = 0;
  int Number2 = 1;
  int Number3; 
  
  System.out.print("0, 1");

  for(int i=0; i<n-2;i++) {
	  Number3 = Number1 + Number2;
	  Number1 = Number2;
	  Number2 = Number3;
	  
	  System.out.print(" ,"+ Number3);
  }
  
  
  
  
  
	}

}
