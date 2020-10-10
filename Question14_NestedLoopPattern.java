package assignments.Assignment5_ForLoop;

public class Question14_NestedLoopPattern {

	public static void main(String[] args) {

		
		for (int i = 1; i <= 7; i++) {
			
			System.out.print("#");
			
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			
			System.out.println("#");
		}



	}

}
