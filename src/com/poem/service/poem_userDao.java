package com.poem.service;

import com.poem.dao.Basedao;
import com.poem.entity.poem_user;

public class poem_userDao {
	public static int insert(poem_user u) {
		String sql = "insert into poem_user values(?,?,?,DATE_FORMAT(?,'%Y-%m-%d'),?,?,?,?,?)";
		Object[] params = {
				u.getUSER_ID(),
				u.getUSER_PASSWORD(),
				u.getUSER_GENDER(),
				u.getUSER_BIRTHDAY(),
				u.getUSER_EMAIL(),
				u.getUSER_CODE(),
				u.getUSER_AVATAR(),
				u.getUSER_ENTEND(),
				u.getUSER_STATUS()
			};
		return Basedao.exectuIUD(sql, params);
	}
}
