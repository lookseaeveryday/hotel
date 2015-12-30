package com.hotel.service;

import java.sql.SQLException;
import java.util.List;

import com.hotel.dao.UserDao;
import com.hotel.model.UserModel;
import com.zhucheng.database.exception.SQLCloseException;

// jiazhixin
// 2015/12/22
public class UserServiceImpl {

	private UserServiceImpl() {
	}

	private static UserServiceImpl service = new UserServiceImpl();

	public static UserServiceImpl getInstance() {
		return service;
	}

	/**
	 * dao 层单查
	 */
	public UserModel findById(String id) {
		try {
			return UserDao.getInstance().findById(id);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (SQLCloseException e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * dao 层列表查询
	 */
	public List<UserModel> findList() {
		try {
			return UserDao.getInstance().findList();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (SQLCloseException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * dao 层添加
	 */
	public void addUser(UserModel model) {
		 try {
			UserDao.getInstance().addUser(model);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (SQLCloseException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * dao 层修改
	 */
	public void updateUser(UserModel model) {
		try {
			UserDao.getInstance().updateUser(model);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (SQLCloseException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * dao 层删除
	 */
	public void deleteUser(String uid) {
		try {
			UserDao.getInstance().deleteUser(uid);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (SQLCloseException e) {
			e.printStackTrace();
		}
	}
}