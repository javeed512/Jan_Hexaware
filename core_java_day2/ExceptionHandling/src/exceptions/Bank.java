package exceptions;

public class Bank {

	public static void main(String[] args) {


		int acno[] =  {101,102,103,104};
		String names[] = {"tom","ravi","smith","ford"};
		double balance[] = {3000 , 50 ,7000,6000};
		
		
		System.out.println("AcNo Name Balance");
		
		for (int i = 0; i < acno.length; i++) {
			
			
	System.out.println(acno[i] +" "+names[i] +" "+balance[i]);
			
			if(balance[i] < 1000) {
				
				try {
			throw	new LowBalanceException("Please Deposit some amount");
				}
				catch(LowBalanceException e) {
					
					System.err.println(names[i]+" your balance is low");
					System.out.println(e);
				}
			}
			
	
			
		}
		

	}

}
