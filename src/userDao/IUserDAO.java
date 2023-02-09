package userDao;

import java.util.ArrayList;

import bean.User;

public interface IUserDAO {

	//C
	boolean creatData(User user);//V

	//R
	User findUserById(int id);//V

	ArrayList<User> findAllUser();

	//U
	boolean updateUser(User user);

	//D
	boolean deleteUserById(int id);

}