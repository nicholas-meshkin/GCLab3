package gcLab3;
import java.util.Scanner;
public class GCLab3 {

	public static void main(String[] args) {
		int userInt = 0;
		String continueStatus = "y";
		String userName;
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Welcome to Integer Evaluator! Please enter your name");
		userName = scnr.nextLine();
		System.out.println("Hello, " + userName + "." + " Please enter an integer between 1 and 100");
		while(continueStatus.equalsIgnoreCase("y")) {
		if (scnr.hasNextInt()) {
			userInt = scnr.nextInt();
			if((userInt%2 == 1) && (userInt < 101) && (userInt > 0)) {
				if(userInt>60) {
					System.out.println(userInt + " Odd and over 60, " + userName + ".");
				}else {
					System.out.println(userInt + " Odd, " + userName + ".");
				}
				System.out.println("Would you like to continue, " + userName + " (y/n)?");
				continueStatus = scnr.next();
				if(continueStatus.equalsIgnoreCase("y")) {
					System.out.println("Hello again, " + userName + "." + " Please enter an integer between 1 and 100");
					}
			}else if((userInt%2 == 0) && (userInt < 101) && (userInt > 0)) {
				if(userInt <=25) {
					System.out.println("Even and less than 25.");
				}else if(userInt <= 60) {
					System.out.println("Even.");
				}else {
					System.out.println(userInt + " Even.");
				}
				System.out.println("Would you like to continue, " + userName + " (y/n)?");
				continueStatus = scnr.next();
				if(continueStatus.equalsIgnoreCase("y")) {
					System.out.println("Hello again, " + userName + "." + " Please enter an integer between 1 and 100");
					}
			}else {
				System.out.println("You did not enter an integer in the proper range.");
				System.out.println("Would you like to continue, " + userName + " (y/n)?");
				scnr.nextLine();
				continueStatus = scnr.next();
				if(continueStatus.equalsIgnoreCase("y")) {
				System.out.println("Hello again, " + userName + "." + " Please enter an integer between 1 and 100");
				}
			}
		}else {
			scnr.next();
			System.out.println("You did not enter an integer.");
			System.out.println("Would you like to continue, " + userName + " (y/n)?");
			continueStatus = scnr.next();
			if(continueStatus.equalsIgnoreCase("y")) {
			System.out.println("Hello again, " + userName + "." + " Please enter an integer between 1 and 100");
			}
		}
		}
		System.out.println("Thank you for using Integer Evaluator, " + userName + "!");
		scnr.close();
	}

}
