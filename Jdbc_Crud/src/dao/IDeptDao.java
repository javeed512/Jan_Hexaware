package dao;

import java.util.List;

import entity.Department;

public interface IDeptDao {
	
	  public int insert(Department dept);
	  public int update(Department dept);
	  
	  
	  public int deleteOne(int dno);
	  public Department     selectOne(int dno);
	  
	  public  List<Department>   selectAll();

}
