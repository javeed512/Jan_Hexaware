package inheritance;

public class Parent extends Object {
	
  private	int pid = 100;
	
	public Parent() {  // super refer to immediate parent obj
						// super() refer to immediate parent class constructor
		super();   // Object(); 
		System.out.println("Parent object is created");
		
	}
	
	
	public Object m1() {
		
		
		System.out.println("m1() called from Parent..");
		
		return null;
		
	}

}
