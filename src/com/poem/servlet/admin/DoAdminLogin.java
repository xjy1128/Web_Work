package com.poem.servlet.admin;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DoAdminLogin
 */
@WebServlet("/admin_doadminlogin")
public class DoAdminLogin extends HttpServlet {
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 设置字符集
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		// 获取参数
		String admin_id = request.getParameter("admin_id");
		String admin_password = request.getParameter("admin_password");
		// 创建实体
//		poem_admin admin = new poem_admin();
	}

}
