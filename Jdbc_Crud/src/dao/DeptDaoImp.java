package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entity.Department;

public class DeptDaoImp implements IDeptDao {

	Connection conn = null;

	public DeptDaoImp() {

		conn = DBUtil.getDBConnection();

	}

	@Override
	public int insert(Department dept) {

		// INSERT
		String insert = "insert into dept values(?,?,?)"; // ? positional parameters

		int count = 0;

		try {
			PreparedStatement pstmt = conn.prepareStatement(insert);

			pstmt.setInt(1, dept.getDno());
			pstmt.setString(2, dept.getDname());
			pstmt.setString(3, dept.getLocation());

			count = pstmt.executeUpdate();

		} catch (SQLException e) { // TODO Auto-generated catch block
			e.printStackTrace();
		}

		return count;
	}

	@Override
	public int update(Department dept) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteOne(int dno) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Department selectOne(int dno) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Department> selectAll() {

		String selectAll = "select dno,dname,location from dept";
		
		List<Department>  list = new ArrayList<Department>();

		try {
			PreparedStatement pstmt = conn.prepareStatement(selectAll);

			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {

		
				Department dept = 
						new Department(rs.getInt("dno"),rs.getString("dname") ,rs.getString("location") );
				
				list.add(dept);
			}

		} catch (SQLException e) { 
			e.printStackTrace();
		}

		return list;
	}

}
