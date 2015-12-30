package com.hotel.utils;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.text.ParseException;

/**
 * java bean 操作工具类
 * @author jiazhixin
 *
 */
public class BeanUtils {

	/**
	 * Student bean1 = new Student();
	 * BeanUt.setProperty(bean1, "name", "李四");
	 * System.out.println(bean1.getName());
	 * @param bean 实体类
	 * @param name 实体类的属性
	 * @param value 值
	 */
	public static void setProperty(Object bean, String name, Object value)
			throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException,
			InvocationTargetException, NoSuchFieldException, ParseException {
		Class<? extends Object> cs = bean.getClass();
		Field field = cs.getDeclaredField(name);
		field.setAccessible(true);
		Object object = TypeConverter.convert(field.getType(), String.valueOf(value));
		field.set(bean, object);
	}
	
	/**
	 * Student bean1 = new Student();
	 * String name = BeanUtils.getProperty(bean1, "name");
	 * System.out.println(bean1.getName());
	 * @param bean
	 * @param name 属性名
	 * @return
	 */
	public static String getProperty(Object bean,String name) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		Class<? extends Object> cs = bean.getClass();
		Field field = cs.getDeclaredField(name);
		field.setAccessible(true);
		return field.get(bean) + "";
	}
}
