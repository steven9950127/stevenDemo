package cn.sxt.dao.impl;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import cn.sxt.dao.UserDao;
import cn.sxt.util.MybatisUtil;
import cn.sxt.vo.User;

public class UserDaoImpl implements UserDao {

	@Override
	public User getById(int id) {
		try {
			SqlSession session=MybatisUtil.getSqlSession();
			User result=session.selectOne("cn.sxt.vo.user.mapper.selectUser", id);
			session.close();
			return result;
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public int addUser(User user) {
		try {
			SqlSession session=MybatisUtil.getSqlSession();
			int result=session.insert("cn.sxt.vo.user.mapper.addUser",user);
			session.commit();
			session.close();
			return result;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		}
		
	}

	@Override
	public int updateUser(User user) {
		
		try {
			SqlSession session = MybatisUtil.getSqlSession();
			int result=session.update("cn.sxt.vo.user.mapper.updateUser",user);
			session.commit();
			session.close();
			return result;
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		
		
	}

	@Override
	public int delete(int id) {
		try {
			SqlSession session = MybatisUtil.getSqlSession();
			int result=session.delete("cn.sxt.vo.user.mapper.deleteUser",id);
			session.commit();
			session.close();
			return result;
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public List<User> getAll() {
		try {
			SqlSession session = MybatisUtil.getSqlSession();
			List<User> result=session.selectList("cn.sxt.vo.user.mapper.selectAll");
			session.close();
			return result;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		}
		
	}


}
