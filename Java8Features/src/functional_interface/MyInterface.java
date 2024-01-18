package functional_interface;

@FunctionalInterface
public interface MyInterface {
	
 public abstract	int add(int a,int b);
	
	//void setData(String data);  // consumer functional interface

 	
   default void show1() {
 		
 		System.out.println("Show 1 is default method call");
 		
 	}
   
   static void  show2() {
	   
	   System.out.println("Show 2 is static method call");
   }
 
 
}
