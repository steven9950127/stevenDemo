package cn.sxt.dao;

import java.util.List;

import cn.sxt.vo.User;

public interface UserDao {
	public User getById(int id);
	public int addUser(User user);
	public int updateUser(User user);
	public int delete(int id);
	public List<User> getAll();
}
