package datatypes;

public class DataTypesDemo {

	public static void main(String[] args) {
		

			int x = 999;
			
			byte b =0; // = (byte) 130;   // -2pow7  to (2pow7) -1   OR 
			                    //-128  to  127
		
		//	 x =  b; // implicit type casting
			 
			 b = (byte) x; // explicit type casting
			
			System.out.println(x);

			System.out.println(b);
			
				double d =	999999999.1234567891243;
				
				float f = 99.123456f;
				
				f =(float) d;
				
				System.out.println(d);
				 System.out.println(f);
				
				System.out.println(Integer.SIZE +" bits");
				 System.out.println(Integer.MIN_VALUE +" to "+ Integer.MAX_VALUE);
				 
				 
	}

}
