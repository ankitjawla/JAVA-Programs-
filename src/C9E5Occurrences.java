import java.util.Scanner;

public class C9E5Occurrences {
	public static void main(String[] args) {
		try {
			System.out.print("Enter a string : ");
			Scanner input = new Scanner(System.in);
			String str = input.next();
			int[] Digits = count(str);
			for (int i = 0; i < Digits.length; i++) {
				if (Digits[i] != 0) {
					System.out.println(" counts[" + i + "] is " + Digits[i]);
				}
			}
		} catch (Exception e) {
			System.out.println("Exception has occured. Program will exit. ");
			System.exit(0);
		}
	}

	public static int[] count(String s) {
		int[] temp = new int[15];
		for (int i = 0; i < s.length(); i++) {
			if (Character.isDigit(s.charAt(i))) {
				String a = Character.toString(s.charAt(i));
				int b = Integer.parseInt(a);
				temp[b] = temp[b] + 1;
			}
		}
		return temp;
	}
}
