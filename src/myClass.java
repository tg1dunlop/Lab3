import java.util.Scanner;

public class myClass {
	
	//the Method, getPower, returns the input (x) raised to the defined power (y).
	 //int x & int y are returned from the main method into getPower method.
	public static int getPower(int x, int y) { 
		
		int powerResult = 1; //the variable powerResult is defined and initialized to 1

		for (int i = 1; i <= y; i++) { //this for loop will increment i until it equals y

			powerResult = powerResult * x; 
			//this calculation will continue to multiply powerResult
			 //by x until i = y, or said another way, y times
		}
		return powerResult;
	}

	//Program begins here at main method
	public static void main(String[] args) {

		int number = 0; //number variable receives the user input through the scanner

		Scanner scan1 = new Scanner(System.in);//import Scanner to accept user input
		
		System.out.println("Welcome to the Powers Calculator. \nEnter a number and you will get a table "
				+ "\nof all the numbers up to the one you \nentered raised to the 2nd & 3rd power.");
		
		number = scan1.nextInt(); //this is where scan1 initializes number to the user input
		scan1.nextLine(); //garbage collector
		
		System.out.println("-------\t-------\t-------"); //create table
		System.out.println("Number\tSquared\tCubed"); //all of this is just the header row for the table
		System.out.println("-------\t-------\t-------");// \t is tab to separate the columns
		
		for (int i = 1; i <= number; i++) {
			
			System.out.print(getPower(i, 1)); //use print instead of println here; this column is 1 through "number"
			//we are passing i = x and y = 1 to the method getPower
			System.out.print("\t"); //the \t is a tab to separate the numbers into columns
			System.out.print(getPower(i, 2)); //this column is the number squared
			//we are passing i = x and y = 2 to the method getPower
			System.out.print("\t"); //the \t is a tab to separate the numbers into columns
			System.out.println(getPower(i, 3)); //use println instead of print here; this column is the number cubed
			/* using println on the last line gives you a return so your output
			 * will wrap to the next line with the next number
			 * we are passing i = x and y = 2 to the method getPower
			 */
		}
		scan1.close();
	}

}
