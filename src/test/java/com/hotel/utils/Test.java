package com.hotel.utils;


public class Test {

	
	static String finduser = "http://127.0.0.1:8888/finduser?uid=2";
	static String userlist = "http://127.0.0.1:8888/userlist";
	static String adduser = "http://127.0.0.1:8888/adduser";
	static String adduser_param = "name=李四&age=19"; //添加用户提交的参数
	static String updateuser = "http://127.0.0.1:8888/updateuser";
	static String updateuser_param = "name=王五&age=19&id=2"; //添加用户提交的参数
	static String deleteuser = "http://127.0.0.1:8888/deleteuser?uid=2";
		
	public static void main(String[] args) throws Exception {
		// 根据id获取单个用户
		HttpGetRequest.doGet(finduser);
		// 获取用户列表
		HttpGetRequest.doGet(userlist);
		// 添加用户信息
		HttpPostRequest.doPost(adduser,adduser_param);
		// 修改用户信息
		HttpPostRequest.doPost(updateuser, updateuser_param);
		// 删除用户根据id删除
		HttpGetRequest.doGet(deleteuser);
	}
}

