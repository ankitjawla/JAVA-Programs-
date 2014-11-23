import java.io.File;
import java.util.Scanner;
import java.util.StringTokenizer;


public class C14E13Count {
	
	 public static void main(String args[]) throws Exception
	    {
	         int char_count=0;
	         int word_count=0;
	         int line_count=0;
	         StringTokenizer st;
	         Scanner input1 = new Scanner(System.in);
	          System.out.println("Enter path of the file");
	          String ch = input1.next();

	         if(ch.length()== 0)
	         {
	             System.out.println("java  filename ");
	             System.out.println("Invalid. Program will exit");
	             System.exit(0);
	         }
	         Scanner input = new Scanner(new File(ch));
	         System.out.println("File " + ch + " has ");

	         while(input.hasNext())
	         {
	             line_count++;
	             String s1 = input.nextLine();
	             st=new StringTokenizer(s1, "\r \n \t ,;:.");
	             while(st.hasMoreTokens())
	             {
	                  word_count++;
	                  ch=st.nextToken();
	                  char_count+=ch.length();

	             }
	          }
	          System.out.println(char_count + " Characters ");
	          System.out.println(word_count + " Words ");
	          System.out.println(line_count + " Lines ");
	          input.close();
	      }
	}

	
	