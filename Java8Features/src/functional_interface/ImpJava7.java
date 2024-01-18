package functional_interface;

public class ImpJava7 implements MyInterface {

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	
	public static void main(String[] args) {
		
	   MyInterface  mi = new ImpJava7();
	   
	   	int res =	mi.add(5, 5);		
	   	System.out.println(res);
		
	}
	
}
