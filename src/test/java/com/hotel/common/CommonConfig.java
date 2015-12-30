package com.hotel.common;

import com.web.core.Routes;
import com.web.core.WebConfig;
import com.web.core.db.DruidPlugin;
import com.web.ext.mvc.AutoBindRoutes;
import com.zhucheng.database.WebSources;

public class CommonConfig extends WebConfig {

	@Override
	public void configRoute(Routes me) {
		// 路由注解的方式
		me.add(new AutoBindRoutes().autoScan(false));
	}

	@Override
	public void configPlugin(WebSources db) {
		DruidPlugin dp = new DruidPlugin();
		dp.setDriverClass("com.mysql.jdbc.Driver");  	// jdbc 驱动
		dp.setUrl("jdbc:mysql://127.0.0.1:3306/test");	// url
		dp.setPassword("root");							// 密码
		dp.setUsername("root"); 						// 用户名
		dp.init();										// init 就是可以连接了哈
	}

}
