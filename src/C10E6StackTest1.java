


public class C10E6StackTest1 {
	
	public static boolean isPrimeCheck(int number){
		if(number == 1)
			return false;
		else{
		for(int i = 2; i <=number/2;i++){
			if(number%i==0)
				return false;
		}
		return true;
	}
	}
	public static void main(String[] args) {
		
		StackOfIntegers1 s1 = new StackOfIntegers1();
		for(int i = 1;i <= 120;i++){
			if(isPrimeCheck(i))
				s1.push(i);
			else
				continue;
		}
      
		System.out.println("Prime numbers between 1 to 120 in the descending order are:");
		while(s1.getSize()!=0)
		System.out.println(s1.pop());
		
	}

}


class StackOfIntegers1 {
	 private int[] elements;
	 private int size;
	 public static final int DEFAULT_CAPACITY = 10;
	 
	public StackOfIntegers1(){
	 this (DEFAULT_CAPACITY);
	}
	public StackOfIntegers1(int capacity){
	elements = new int[capacity];
	}
	public void push(int value) {
	 if (size >= elements.length) {
	 int[] temp = new int[elements.length * 2];
	 System.arraycopy(elements, 0, temp, 0, elements.length);
	 elements = temp;
	 }

	 elements[size++] = value;
	}
	public int pop() {
	return elements[--size];
	 }

	public int peek() {
	return elements[size - 1];
	 }

	public boolean empty() {
	 return size == 0;
	 }

	public int getSize() {
	return size;
	 }
	 }




