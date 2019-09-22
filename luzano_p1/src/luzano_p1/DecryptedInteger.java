package luzano_p1;
 
public class DecryptedInteger {

	/* 
	 * This program takes an encrypted 4-digit integer as input,
	 * then prints the original integer.
	 */

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int userNum;
		int firstDigit;
		int secondDigit;
		int thirdDigit;
		int lastDigit;
		
		// Asks user to enter a 4-digit integer
		System.out.println("Enter encrypted number: ");
		userNum = scnr.nextInt();
		
		// Takes the integer back to its original form
		firstDigit = (((userNum / 1000) + 10) -7) % 10;
		secondDigit = ((((userNum / 100) % 10) + 10) -7) % 10;
		thirdDigit = ((((userNum / 10) % 10) + 10) -7) % 10;
		lastDigit = (((userNum % 10) + 10) -7) % 10;
		
		System.out.print("The original number is: ");
		System.out.println(thirdDigit + "" + lastDigit + "" + firstDigit + "" + secondDigit);
	
	}
}
