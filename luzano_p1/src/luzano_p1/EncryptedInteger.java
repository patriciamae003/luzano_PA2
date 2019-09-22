package luzano_p1;
 
public class EncryptedInteger {

	/* 
	 * This program takes 4-digit integer as input,
	 * adds 7 to each digit,
	 * gets remainder when new value is divided by 10,
	 * swaps first digit with third digit,
	 * swaps second digit with fourth digit, 
	 * then prints encrypted integer.
	 */

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int userNum;
		int firstDigit;
		int secondDigit;
		int thirdDigit;
		int lastDigit;
		
		// Asks user to enter a 4-digit integer
		System.out.println("Enter number: ");
		userNum = scnr.nextInt();
		
		// Adds 7 to each digit and gets remainder from division by 10
		firstDigit = ((userNum / 1000) + 7) % 10;
		secondDigit = (((userNum / 100) % 10) + 7) % 10;
		thirdDigit = (((userNum / 10) % 10) + 7) % 10;
		lastDigit = ((userNum % 10) + 7) % 10;
		
		System.out.print("The encrypted number is: ");
		System.out.println(thirdDigit + "" + lastDigit + "" + firstDigit + "" + secondDigit);
		
	}
}
