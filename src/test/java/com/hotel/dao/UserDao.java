package com.hotel.dao;

import java.sql.SQLException;
import java.util.List;

import com.hotel.model.UserModel;
import com.zhucheng.database.ZCQuery;
import com.zhucheng.database.exception.SQLCloseException;
import com.zhucheng.database.handler.BeanHandler;
import com.zhucheng.database.handler.BeanListHandler;

public class UserDao {

	private UserDao() {}
	private static UserDao dao = new UserDao();
	
	public static UserDao getInstance() {
		return dao;
	}
	
	// 单查方法
	public UserModel findById(String id) throws SQLException, SQLCloseException {
		ZCQuery zc = new ZCQuery();
		// 这个可以把我们写的实体类自动负载，避免了传统方式的赋值
		return zc.query("select * from t_user where id=?", new BeanHandler<>(UserModel.class),new Object[]{id});
	}
	
	// 获取列表
	public List<UserModel> findList() throws SQLException, SQLCloseException {
		ZCQuery zc = new ZCQuery();
		return zc.query("select * from t_user", new BeanListHandler<>(UserModel.class));
	}
	
	// 添加方法
	public void addUser(UserModel model) throws SQLException, SQLCloseException {
		ZCQuery zc = new ZCQuery();
		zc.update("insert into t_user(name,age) values(?,?)",new Object[]{model.getName(),model.getAge()});
	}
	
	// 修改方法
	public void updateUser(UserModel model) throws SQLException, SQLCloseException {
		ZCQuery zc = new ZCQuery();
		zc.update("update t_user set name=?,age=? where id=?",new Object[]{model.getName(),model.getAge(),model.getId()});
	}
	
	// 删除方法
	// uid 删除id 主键
	public void deleteUser(String uid) throws SQLException, SQLCloseException {
		ZCQuery zc = new ZCQuery();
		zc.update("delete from t_user where id=?",uid);
	}
}
