package com.poem.servlet.user;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.poem.entity.poem_user;
import com.poem.service.poem_userDao;

/**
 * Servlet implementation class DoUserAdd
 */
@WebServlet("/do_user_add")
public class DoUserAdd extends HttpServlet {
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 设置字符集
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		// 获取参数
		String user_id = request.getParameter("username");
		String user_password = request.getParameter("psw");
		String user_gender = request.getParameter("sex");
		String user_birthday = request.getParameter("birthday");
		String user_email = request.getParameter("email");
		// 创建用户实体
		poem_user user = new poem_user(user_id,user_password,user_gender,user_birthday,user_email,null,null,null,1);
		// 加入到数据库中
		int count = poem_userDao.insert(user);
		// 成功或失败的重定向
		if(count > 0) {
			PrintWriter out = response.getWriter();
			out.write("<script>");
			out.write("alert('注册成功！')");
			out.write("location.href = 'register.jsp'");
			out.write("</script>");
			response.sendRedirect("index.jsp");
		}else {
			PrintWriter out = response.getWriter();
			out.write("<script>");
			out.write("alert('注册失败！')");
			out.write("location.href = 'register.jsp'");
			out.write("</script>");
		}
	}

}
