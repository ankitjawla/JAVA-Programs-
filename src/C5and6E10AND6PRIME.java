import java.util.Scanner;

public class C5and6E10AND6PRIME {
	
	public static boolean isPrime(int n){
		for(int i=2; i<= Math.sqrt(n);i++){
			if (n%i==0)
				return false;
		}
		
			return true;
		}
	public static boolean isPrimeCheck(int number){
		for(int i = 2; i <=number/2;i++){
			if(number%i==0)
				return false;
		}
		return true;
	}
	
	public static double [] printPrimeNumbers(){
		double []check = new double[1300];
		int i = 0;
		int number = 2;
		int count = 1;
		while(number<10000){
			if(isPrimeCheck(number)){
				if(count%10!=0){
					check[i]=number;
				System.out.print(number+" ");
				count++;
				i++;
				  				}
				else {
					check[i]=number;
					System.out.println(number);
				    count++;
				    i++;
				   	}
			}
		  number++;
	   
		}
		return check;
	}

	public static void printPrimeNumbers(int total){
		int number = 2;
		int count = 1;
		while(total>0){
		if(isPrime(number)){
			if(count%10!=0){
			System.out.print(number+" ");
			count++;
			  total--;
			}
			else {
				System.out.println(number);
			    count++;
			    total--;
			}
		}
	  number++;
   
	}
	}
	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
double []check = new double[1300];
        int ch = 0;		
		do{
		System.out.println();	
		System.out.println("Enter 1 to Display First 50 Prime No's");
		System.out.println("Enter 2 to Display Prime number less than 10000");
		System.out.println("Enter 3 to Check Whether the Number(less than 10000) is Prime or Not"+"[Option 2 has to be Executed Before Executing Option 3 ");
		System.out.println("Enter 0 to Exit");
		 ch = input.nextInt();
		   switch(ch){
		case 1:{
			    System.out.println("First 50 Prime Numbers:");
			    printPrimeNumbers(50);
			    break;			   
		        }
	    case 2:{
	    	System.out.println("Prime Numbers less than 10000 are: ");
	    	check = printPrimeNumbers();
	    	break;
		   }
	    case 3:{
	    	double number;
	    	System.out.println("Enter No");
	    	number = input.nextDouble();
	    	for(int i = 0;i<check.length;i++){
	    	if(check[i]==number){
	    		System.out.println("NO IS PRIME");
	    	    break;
	    	}
	    	if(i== check.length-1&check[check.length-1]!=number)
	    		System.out.println("No. IS NOT PRIME");
	    	}
	    }
		        
	}

}while(ch!=0);
	}
}