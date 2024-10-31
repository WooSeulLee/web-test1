package com.test.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.test.common.MybatisConfig;
import com.test.vo.UserVO;

public class UserDAO {

	public List<UserVO> getUsers(){
		try(SqlSession ss = MybatisConfig.getSsf().openSession()){
			return ss.selectList("om.test.dao.UserDAO.selectUsers");
		}
	}
}
