package com.hotel.utils;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

/**
 * map 操作工具类
 * @author jiazhixin
 *
 */
public class Maps {

	public static <K,V> HashMap<K,V> newHashMap() {
		return new HashMap<K,V>();
	}
	
	public static <K,V> TreeMap<K, V> newTreeMap() {
		return new TreeMap<K,V>();
	}
	
	public static <K,V> LinkedHashMap<K, V> newLinkedHashMap() {
		return new LinkedHashMap<K, V>();
	}
}
