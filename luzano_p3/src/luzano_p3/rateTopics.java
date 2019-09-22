package luzano_p3;

public class rateTopics {
	
	/* This program asks user to rate 5 topics 
	 * and then creates a table using 2D array
	 * indicating the number of rates per topic.
	 * The average is also displayed 
	 * on the table.
	 */

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
        final int MAX_ROWS = 5;
        final int MAX_COLS = 10;
		String[] topics = {"Education     ", "Mental Health ", "Climate Change", "Discrimination", "Plastic Ban   "};
		int[][] responses = new int[MAX_ROWS][MAX_COLS];
		int i;
		int j;
		int ratings;
		int numTakers;
		int total = 0;
		double average = 0;	
		int[] totalArray = new int[5];
		int highest;
		int lowest;
		int highestIndex = 0;
		int lowestIndex = 0;
	
		// Determines the total number of users taking the survey
		System.out.print("Enter number of survey takers: ");
		numTakers = scnr.nextInt();
		
		// Prompts user to rate each topic
		for (i = 0; i < numTakers; ++i) {
		    System.out.println("\nRate each issue from 1 (lowest) to 10 (highest)");
		    for (j = 0; j < topics.length; ++j) {
		        System.out.print(topics[j] + " ");
		        ratings = scnr.nextInt();
		        responses[j][ratings-1] += 1; // Stores rates to a 2D array
		    }
		}
		
		System.out.println("");
		System.out.print("                ");
		
		// At the top of the table
		for (i = 0; i < 10; ++i) {
		    System.out.print(i+1 + "  ");
		}
		System.out.print("AVERAGE");
		System.out.println("");
	
		// Prints topics on the left 
		for (i = 0; i < MAX_ROWS; ++i) {
		    System.out.print(topics[i] + "  ");
		    // Prints rates on the table
		    for (j = 0; j < MAX_COLS; ++j) {
		        System.out.print(responses[i][j] + "  ");
		        total += responses[i][j] * (j + 1);
		    }
		    // Stores the total rates per topic
		    totalArray[i] = total;
		    // Calculates average of rates
		    average = (double)total / numTakers;
		    System.out.print("   " + average);
		    System.out.println("");
		    total = 0;
		}
		
		highest = totalArray[0];
		lowest = totalArray[0];
		
		// Determines the topic with highest and lowest points
		for (i = 1; i < 5; ++i) {
		    if (totalArray[i] > highest) {
		        highest = totalArray[i];
		        highestIndex = i;
		    }
		    
		    if (totalArray[i] < lowest) {
		        lowest = totalArray[i];
		        lowestIndex = i;
		    }
		}
		
		System.out.println("");
		System.out.println("The topic about " + topics[highestIndex] + "received the highest point total of " + highest +".");
		System.out.println("The topic about " + topics[lowestIndex] + "received the lowest point total of " + lowest +".");

	}
}
