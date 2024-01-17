package exceptions;

public class ExpDemo {

	public static void main(String[] args) {  // caller


		System.out.println("Open File");
		System.out.println("Read Data from file");
		
		int result = 0;
		
		try {
		
		String name = "javeed";
		
			System.out.println(name.length());
			
		  result =  div(10,2); // new ArithmeticException();
		 
		  System.out.println("Result "+result);

		}
		catch(ArithmeticException e) {
			
			System.err.println("Sorry! You cant div number by zero");
		}
		catch (NullPointerException e) {

			e.printStackTrace();
		}
		
		
		finally {
		System.out.println("Close File");
		}
		
		
	}
	
	
	public static int div(int a,int b) throws ArithmeticException {  //callee
		
		return a/b;
	}
	

}
