package presentation;

import java.util.List;
import java.util.Scanner;

import dao.DeptDaoImp;
import dao.IDeptDao;
import entity.Department;

public class Client {
	
  static	Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {


		IDeptDao dao = new DeptDaoImp();
		
		boolean flag = true;
		
		
		
		while(flag) {
		System.out.println("****WELCOME DMS ***");
		System.out.println("1. INSERT");
		System.out.println("2. UPDATE");
		System.out.println("3. DELETE");
		System.out.println("4. SELECT BY ID");
		System.out.println("5. SELECT ALL");
		System.out.println("6. EXIT");
		
		
		int choice =	scanner.nextInt();
		
		
		
			switch (choice) {
			case 1:
				
				Department dept =	readData();
				
				int count =	dao.insert(dept);
				
				System.out.println(count +" record inserted successfully");
				
				break;
				
			case 2:
				 
				//update
				break;
				
			case 3:
				
				// enter dno
				
				//dao.deleteOne(dno);
				 
				break;
				
			case 4: 
				
				// enter dno
				
			//	dao.selectOne(dno);
				
				break;
			case 5:
				
			List<Department> list =	  dao.selectAll();
			
				
			
			list.stream().forEach(System.out::println);
				
				break;
				
			case 6:
				
				  flag = false;
				
				break;

			default:
				break;
			}
		
		
		
		
		
		
		}
		
		
		
	}
	
	
	
	public static Department  readData() {
		
		
		System.out.println("Enter DNO");
		
		int dno =scanner.nextInt();
		
			scanner.nextLine();
		
		System.out.println("Enter DNAME");
		
		String dname = scanner.nextLine();
		
		System.out.println("Enter LOCATION");
		
		String location = scanner.nextLine();
		
		
		Department dept = new Department(dno,dname,location);
		
		return dept;
	}
	
	
	
	

}
