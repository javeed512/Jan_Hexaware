package threads;

public class MyThread extends Thread{

	public static void main(String[] args) {
		
		
			MyThread t1 = new MyThread();
			
				t1.setPriority(10);
				t1.setName("Child-1");
			
				//System.out.println(t1.isAlive());
			System.out.println(t1);
			
			MyThread t2 = new MyThread();
			t2.setPriority(8);
			t2.setName("Child-2");
			
			System.out.println(t2);
			
			
			t1.start();
			t2.start();
		
			
			

	}
	
	
	public void run() {
		
		 
		  for(int i=0;i<=5;i++) {
			  
			  System.out.println(Thread.currentThread().getName());
			  
		  }
		
	}
	

}
