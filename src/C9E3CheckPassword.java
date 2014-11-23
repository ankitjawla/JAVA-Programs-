import java.util.Scanner;

public class C9E3CheckPassword {
	public static void main(String[] args) {
		int loop = -1;
		Scanner input = new Scanner(System.in);
		while (loop != 0) {
			System.out.println("enter 1 to check the validity of password");
			System.out.println("enter 0 to exit");
			int ch = input.nextInt();
			if (ch == 1) {
				System.out.print("Enter a password : ");
				String password = input.next();
				boolean isCorrect = checkPass(password); // Checking Password
															// using
															// checkPassword
															// method
				if (isCorrect)
					System.out.println("valid Password");
				else {
					System.out
							.println("Invalid Password \n Password that you have entered:- "
									+ " ' "
									+ password
									+ " ' "
									+ "should contain Alphanumeric, minimum 8 characters long, Should atleasts contain 2 digits! ");
				}
			}
			if (ch == 0) {
				System.exit(1);

			}

		}
	}

	// checkPassword method
	public static boolean checkPass(String password) {
		int count = 0;
		if (password.length() < 8) // check if count of characters entered is 8
		{
			return false;
		}
		for (int i = 0; i < password.length(); i++) {
			if (!(Character.isLetterOrDigit(password.charAt(i)))) {
				return false;
			}
		}
		for (int i = 0; i < password.length(); i++) {
			if ((Character.isDigit(password.charAt(i)))) {
				count = count + 1;
			}
		}
		if (count >= 2) {
			return true;
		}
		return false;
	}
}
