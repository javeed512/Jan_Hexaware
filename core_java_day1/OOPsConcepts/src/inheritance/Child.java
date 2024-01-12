package inheritance;

public class Child extends Parent{
	
	int cid = 99;
	
	
	public Child() {
		super();
		System.out.println("Child object created");
		
	}
	
	public Child(int cid) {
		
		this.cid = cid;
		
		System.out.println("Parameter constructor for Child class");
	}
	
	
	public void m2() {
		
		System.out.println("m2() is called from Child");
	}

	@Override
	public Child m1() {  // method overriding
		
		System.out.println("m1() from Child class");
		return null;
	}
	
	@Override
	public String toString() {
		
		return "Child Object Here";
		
	}
	
		public static void main(String[] args) {
			
			
			Child c = new Child();
			
			System.out.println(c.toString());
			
			Child c2 = new Child(101);
			
			System.out.println(c2.cid);
			
			//c.pid;
			
			//Parent p = new Parent();
			
			Parent p = new Child();
			
			System.out.println(p);
			
		}
	
	
}
