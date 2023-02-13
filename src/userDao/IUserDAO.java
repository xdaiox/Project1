package userDao;

import java.util.ArrayList;

import bean.User;

public interface IUserDAO {

	//C
	boolean createData(User user);//V

	//R
	User findDataByYear(int year);//V

	ArrayList<User> findAllData();

	//U
	boolean updateUser(User user);

	//D
	boolean deleteUserById(int id);

}