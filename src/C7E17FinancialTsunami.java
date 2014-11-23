/*Banks lend money to each other. In tough economic times, if a bank goes bankrupt, it may not be able to pay back the loan. A bank’s total assets
are its current balance plus its loans to other banks. The diagram in Figure 7.8 shows five banks. The banks’ current balances are 25, 125, 175, 75, and 181 million
dollars, respectively. The directed edge from node 1 to node 2 indicates that bank 1 lends 40 million dollars to bank 2.
 */

/*If a bank’s total assets are under a certain limit, the bank is unsafe. The money it borrowed cannot be returned to the lender, and the lender cannot count the loan
 in its total assets. Consequently, the lender may also be unsafe, if its total assets are under the limit. Write a program to find all the unsafe banks. Your program
 reads the input as follows. It first reads two integers n and limit, where n indicates the number of banks and limit is the minimum total assets for keeping a
 bank safe. It then reads n lines that describe the information for n banks with IDs from 0 to n-1.*/

//Financial Tsunami

import java.util.Scanner;

public class C7E17FinancialTsunami {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("Enter no. of Banks and Limit:\n");
		int banks = input.nextInt();
		System.out.print("Enter bank's balance,no's of Banks that borrowed money and the borrowers:\n ");
		double[] b = new double[banks];
		double[][] borrowers = new double[5][5]; // using 2-D array borrowers to represent loans
		int limit = input.nextInt();
		for (int i = 0; i < b.length; i++) {
			b[i] = input.nextDouble();
			int howmany = input.nextInt();
			for (int j = 0; j < howmany; j++) {
				borrowers[i][input.nextInt()] = input.nextDouble();
			}
		}
		for (int j = 0; j < banks; j++) {
			for (int k = 0; k < banks; k++) {
				int total = 0; // Calculating total number of loans given by k
				for (int l = 0; l < banks; l++) {
					total += borrowers[k][l];
				}
				if (total + b[k] < limit) {
					for (int m = 0; m < banks; m++) {
						borrowers[m][k] = 0;
					}
				}
			}
		}

		System.out.print("Unsafe banks are ");
		for (int k = 0; k < banks; k++) {
			int total = 0; // Calculating total number of loans made by k
			for (int l = 0; l < banks; l++) {
				total += borrowers[k][l];
			}
			if (total + b[k] < limit) {
				System.out.print(k + " ");
			}
		}
	}
}

/*
 * number of banks and limit : 5 201
 * 
 * bank's balance,number of banks that borrowed money and the borrowers:
 * 25 2 1 100.5 4 320.5 
 * 125 2 2 40 3 85 
 * 175 2 0 125 3 75 
 * 75 1 0 125 
 * 181 1 2 125
 * 
 * Unsafe banks are 3 1
 */

