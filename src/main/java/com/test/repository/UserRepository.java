package com.test.repository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.test.common.DBCon;
import com.test.vo.UserVO;

public class UserRepository {

	public List<UserVO> getUsers(){
		List<UserVO> users = new ArrayList<>();
		try(Connection con = DBCon.getCon()){
			try(Statement stmt = con.createStatement()){
				String sql = "SELECT * FROM USERS";
				try(ResultSet rs = stmt.executeQuery(sql)){
					while (rs.next()) {
						UserVO user = new UserVO();
						user.setName(rs.getString("name"));
						user.setName(rs.getString("age"));
						user.setName(rs.getString("address"));
						users.add(user);
						
					}
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return users;
	}
	public static void main(String[] args) {
		UserRepository ur = new UserRepository();
		List<UserVO> users = ur.getUsers();
		System.out.println(users);
	}
}
