package cn.sxt.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisUtil {
	public static SqlSessionFactory getSqlSessionFactory() throws IOException {
		String resource="mybatis.cfg.xml";
		InputStream input=Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(input);
		return sqlSessionFactory;
	}
	public static SqlSession getSqlSession() throws IOException {
		SqlSession sqlSession=getSqlSessionFactory().openSession();
		return sqlSession;
	}
}
