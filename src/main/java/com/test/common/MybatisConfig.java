package com.test.common;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisConfig {
	private static SqlSessionFactory ssf;
	static {
		String path = "resources/mybatis-config.xml";
		try {
			InputStream is = Resources.getResourceAsStream(path);
			SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();
			ssf = ssfb.build(is);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static SqlSessionFactory getSsf() {
		return ssf;
	}
	public static void main(String[] args) {
		System.out.println(ssf);
	}
}
