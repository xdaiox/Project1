package userDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import bean.User;
import connUtil.ConnectionFactory;

public class UserDataAccessObject implements IUserDAO {// DAO

	// C
	@Override
	public boolean createData(User user) {
		String sql="insert into [HotelGuest] (Year,Total,OverseaChinese,Asia,Taiwan,"
				+ "Japan,AsiaLand,AsiaOther,Europe,AustraliaNewZealand,NorthAmerica,Other) "
				+ "values(?,?,?,?,?,?,?,?,?,?,?,?)";
		ConnectionFactory connFactory = new ConnectionFactory();
		try (Connection conn = connFactory.getConnection()){
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, user.getYear());
			pstmt.setString(2, user.getTotal());
			pstmt.setString(3, user.getOverseaChinese());
			pstmt.setString(4, user.getAsia());
			pstmt.setString(5, user.getTaiwan());
			pstmt.setString(6, user.getJapan());
			pstmt.setString(7, user.getAsiaLand());
			pstmt.setString(8, user.getAsiaOther());
			pstmt.setString(9, user.getEurope());
			pstmt.setString(10, user.getAustraliaNewZealand());
			pstmt.setString(11, user.getNorthAmerica());
			pstmt.setString(12, user.getOther());
			int updateCount = pstmt.executeUpdate();
			if(updateCount<1) {
				return false;
			}else {
				return true;
			}
						
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return false;
	}

	// R
	@Override
	public User findUserById(int id) {
		String sql = "select id,account,pwd from [user] where id=?";
		ConnectionFactory connFactory = new ConnectionFactory();
		try (Connection conn = connFactory.getConnection()) {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			rs.next();
			User user = new User();
//			user.setId(rs.getInt(1));
//			user.setAccount(rs.getString(2));
//			user.setPwd(rs.getString(3));
			return user;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public ArrayList<User> findAllUser() {
		ArrayList<User> list = new ArrayList<>();
		String sql="select * from [HotelGuest]";
		ConnectionFactory connFactory = new ConnectionFactory();
		try(Connection conn = connFactory.getConnection()) {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			
			User user0 = new User("Year","Total","OverseaChinese","Asia",
					"Taiwan","Japan","AsiaLand","AsiaOther","Europe",
					"AustraliaNewZealand","NorthAmerica","Other");
			list.add(user0);
			
			
			
			while(rs.next()) {
				User user = new User(rs.getString(2),rs.getString(3),
						rs.getString(4),rs.getString(5),rs.getString(6),
						rs.getString(7),rs.getString(8),rs.getString(9),
						rs.getString(10),rs.getString(11),rs.getString(12),
						rs.getString(13));
				list.add(user);
			}
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	// U
	@Override
	public boolean updateUser(User user) {
		String sql="UPDATE [dbo].[user]  SET [account] = ?"//1
				+ "      ,[pwd] = ?"//2
				+ " WHERE id= ?";//3
		ConnectionFactory connFactory = new ConnectionFactory();
		try(Connection conn = connFactory.getConnection()) {
			PreparedStatement pstmt = conn.prepareStatement(sql);
//			pstmt.setString(1,user.getAccount());
//			pstmt.setString(2, user.getPwd());
//			pstmt.setInt(3, user.getId());
			int updateCount = pstmt.executeUpdate();
			if(updateCount>=1) {
				return true;
			}else {
				return false;
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
		return false;

	}

	// D
	@Override
	public boolean deleteUserById(int id) {
		String sql="DELETE FROM [dbo].[user]"
				+ "      WHERE id=?";
		ConnectionFactory connf = new ConnectionFactory();
		try(Connection conn = connf.getConnection()) {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			int updatecount = pstmt.executeUpdate();
			if(updatecount>=1) {
				return true;
			}else {
				return false;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;

	}
}
