package com.poem.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

// 连接 关闭 增删改查
public class Basedao {

	static {
		// 加载驱动
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static Connection getconn() {
		// 创建一个连接对象
		Connection conn = null;

		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/poem?useSSL=false&serverTimezone=UTC",
					"root", "root");
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return conn;
	}

	public static int exectuIUD(String sql, Object[] params) {
		// 增删改
		int count = 0; // 影响的行数
		Connection conn = Basedao.getconn();

		// 准备SQL语句
		PreparedStatement ps = null;

		// insert into user('''''''','')value(?,?,?)
		try {
			ps = conn.prepareStatement(sql);

			for (int i = 0; i < params.length; i++) {
				ps.setObject(i + 1, params[i]);
			}

			// SQL语句执行
			count = ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			Basedao.closeall(null, ps, conn);
		}
		return count;
	}

	public static void closeall(ResultSet rs, PreparedStatement ps, Connection conn) {

		// 判断
		try {
			if (rs != null)
				rs.close();
			if (ps != null)
				ps.close();
			if (conn != null)
				conn.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}