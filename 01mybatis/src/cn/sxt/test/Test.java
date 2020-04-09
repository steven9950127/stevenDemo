package cn.sxt.test;




import java.util.List;

import cn.sxt.dao.UserDao;
import cn.sxt.dao.impl.UserDaoImpl;
import cn.sxt.vo.User;

public class Test {
	public static void main(String[] args) {
		
		UserDao userDao=new UserDaoImpl();
		//查询用户
//		User user=userDao.getById(1001);
//		System.out.println(user);
		//添加用户
//		User user=new User();
//		user.setName("zhangsan");
//		user.setPwd("123");
//		userDao.addUser(user);
//		User user=userDao.getById(1001);
//		user.setPwd("admin");
//		System.out.println(userDao.updateUser(user));
//		System.out.println(userDao.delete(1001));
		List<User> list=userDao.getAll();
		for(User u:list) {
			System.out.println(u);
		}
//		
		
	}
}
