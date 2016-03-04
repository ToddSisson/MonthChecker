package num4;

import java.util.Scanner;

public class MonthProgram {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		try {
			System.out.print("Enter a number (1-12): ");
			Month one = new Month(input.nextInt());
			
			//buffer
			input.nextLine();
			
			System.out.print("Enter the name of a month: ");
			Month two = new Month(input.nextLine());
			
			System.out.println();
			System.out.println("Month 1: " + one.getMonthName());
			System.out.println("Month 2: " + two.getMonthName());
			System.out.println("Month 1 is equal to Month 2? " + one.equals(two));
			System.out.println("Month 1 is greater than Month 2? " + one.greaterThan(two));
			System.out.println("Month 1 is less than Month 2? " + one.lessThan(two));
			
		} catch (InvalidMonthNumber | InvalidMonthName e) {
			System.out.println(e.getMessage());
		}
		input.close();
	}

}
