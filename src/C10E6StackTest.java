import java.util.Scanner;

class StackOfIntegers

{

private int[] a;

private int arraysize;

public static final int defaultarraysize=16;

public StackOfIntegers() 

{
       this(defaultarraysize);
}

public StackOfIntegers(int capacity)

{ 
       a=new int[capacity];
}


public int push(int number)
{
       if(arraysize >= a.length)
       {
           int[] b= new int[a.length * 2];
           System.arraycopy(a, 0, b, 0, a.length);
           a=b;
       }
       return a[arraysize++]=number;
    }


public int pop() {
    
      return a[--arraysize];

    }
    public int peek() {
         return a[arraysize - 1];
    }
    public boolean empty() {
         return arraysize == 0;
    }
    public int getSize() {
         return arraysize;
    }
}

public class C10E6StackTest 
{
	public static void main(String[] args)
	{
    StackOfIntegers pf=new StackOfIntegers();
    int count=0;
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter an Integer");
    int num=scan.nextInt();
    System.out.println("The prime factors for the given number " + num + " is");
    int factor = 2;
    while (factor <= num) {
       if(num % factor == 0) {
       num = num / factor;
       pf.push(factor);
       count++;
    }
    else {
       factor++;
    }
    }
    for(int i=0;i<count;i++)
       System.out.print(pf.pop()+" ");
}
}