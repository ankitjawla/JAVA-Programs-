import java.util.Scanner;
	
	public class C9E27Bioinformatics {
		
		
		
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			
					    System.out.println("Enter the genome ");
					    String genome = input.next().toUpperCase();
				
					    int temp = -1;
						StringBuilder sb = new StringBuilder();
						for(int i = 0; i < genome.length() - 2; i++){
							if(genome.substring(i,i+3).equals("ATG"))
							  {
								if(temp != -1)
								sb.append("\n");
								int count = i + 3;
							  
								while(!(genome.substring(count,count + 3).equals("ATG")) && !(genome.substring(count,count + 3).equals("TAG")) && !(genome.substring(count,count + 3).equals("TAA")) && !(genome.substring(count,count + 3).equals("TGA")))
								  {
									temp = 0;
									if(count < genome.length()){
								    sb.append(genome.charAt(count));
								    count++;
									}
								
								  }
								i = count;
							  }
						}
						
					
					//	return sb.toString();
						if(sb.toString().equals(""))
					    	System.out.println("no gene is found");
					   
					   
					    else{
					    	int count =0;
					    	for(int i =0 ;i < sb.toString().length();i++)
					    	 if(Character.isLetter(sb.toString().charAt(i))){
					    		 count++;
					    	 }
					    	if(count%3==0)
					    	System.out.println(sb.toString());
					    	 else 
					    		 System.out.println("Invalid Input");
					    }
					
		}

	}

