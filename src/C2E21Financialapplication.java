import java.util.Scanner;


class C2E21Financialapplication {
	public static void main(String[] args )
	{
	Scanner input = new Scanner(System.in);
	System.out.print("Please input investment amount: ");
	double amount = input.nextDouble();
	System.out.print("annual interest rate :");
	double rate = input.nextDouble();
	System.out.print("number of years: ");
	double year = input.nextDouble();
	//double futureInvestmentValue = input.nextDouble();

	double futureInvestmentValue=amount*Math.pow((1+(rate/12)/100),year*12);
	System.out.println("Accumulated value is : " + futureInvestmentValue);
}
}