package com.hotel.controller;

import java.util.Arrays;
import java.util.List;

import com.hotel.common.BaseController;
import com.hotel.model.UserModel;
import com.hotel.service.UserServiceImpl;
import com.web.annotation.ControllerBind;

/**
 * demo
 * @author jiazhixin
 *
 */
@ControllerBind(controllerKey = "/" , viewPath = "/page/index")
public class UserController extends BaseController<Object> {

	/**
	 * 首页
	 */
	public void index() {
		render("page/index.html");
	}
	
	/**
	 * 单查用户
	 */
	public void finduser() {
		String uid = getPara("uid");
		UserModel model = UserServiceImpl.getInstance().findById(uid);
		System.out.println(model.toString());
	}
	
	/**
	 * 用户列表
	 */
	
	public void userlist() {
		List<UserModel> model = UserServiceImpl.getInstance().findList();
		System.out.println(Arrays.toString(model.toArray()));
	}
	
	/**
	 * 添加用户
	 */
	public void adduser() {
		UserModel model = getModel(UserModel.class);
		UserServiceImpl.getInstance().addUser(model);
	}
	
	/**
	 * 修改用户
	 */
	public void updateuser() {
		// 如果我们页面有很多的参数 你一直 getPara 很累，那么就可以定义一个类接收器
		// 使用我们的 model 里面就有值了很方便吧
		UserModel model = getModel(UserModel.class);
		UserServiceImpl.getInstance().updateUser(model);
	}
	
	/**
	 * 删除用户
	 */
	public void deleteuser() {
		// 获取浏览器参数uid
		String uid = getPara("uid");
		UserServiceImpl.getInstance().deleteUser(uid);
	}
}
