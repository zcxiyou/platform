package com.hx.common.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;


/**
 * @Title: DozerMapperSingleton.java
 * @Package com.kingstar.securities.bs.suss.bu.base.util
 * @Description: bean 深度复制
 * @author Quangang.Zhao
 * @date 2016-5-20 下午4:44:58
 * @version V1.0
 */
public class DozerMapperSingleton {

	private Mapper instance;

	private DozerMapperSingleton() {
		if (instance == null) {
			instance = new DozerBeanMapper();
		}
	}

	private static class InnerClass {
		// 内部类的实例与外部类的实例没有绑定关系，而且只有被调用到时才会装载，从而实现了延迟加载
		private static DozerMapperSingleton instanceInner = new DozerMapperSingleton();
	}

	public static DozerMapperSingleton getInstance() {
		return InnerClass.instanceInner;
	}

	/**
	 * @Title: map
	 * @Description 构造新的destClass实例对象，通过source对象中的字段内容 映射到destClass实例对象中，并返回新的destClass实例对象。
	 * 
	 * @param source 源数据对象
	 * @param destClass 要构造新的实例对象Class
	 */
	public <T> T map(Object source, Class<T> destClass) {
		if (SimpleUtil.isNotNull(source) && SimpleUtil.isNotNull(destClass)){
			return instance.map(source, destClass);
		}else{
			return null;
		}
	}

	/**
	 * @Title: mapList
	 * @Description 构造新的destClass List实例对象，通过source对象中的字段内容 映射到destClass实例对象中，并返回新的destClass实例对象。
	 * @param sourceList 源数据对象
	 * @param destClass 要构造新的实例对象Class
	 * @return List<T>
	 */
	@SuppressWarnings("rawtypes")
	public <T> List<T> mapList(Collection sourceList, Class<T> destClass) {
		if (SimpleUtil.isNotNull(sourceList) && SimpleUtil.isNotNull(destClass)){
			List<T> destinationList = new ArrayList<T>();
			Iterator iterator = sourceList.iterator();
			while (iterator.hasNext()) {
				Object sourceObject = iterator.next();
				T destinationObject = instance.map(sourceObject, destClass);
				destinationList.add(destinationObject);
			}
			return destinationList;
		}else if (SimpleUtil.isNotNull(sourceList) && sourceList.isEmpty()){
			return new ArrayList<T>();
		}else{
			return null;
		}
	}

	/**
	 * @Title: mapMap
	 * @Description 构造新的destClass Map实例对象，通过source对象中的字段内容 映射到destClass实例对象中，并返回新的destClass实例对象。
	 * @param sourceMap 源数据对象
	 * @param destClass 要构造新的实例对象Class
	 * @return Map<Object,T>
	 */
	@SuppressWarnings("rawtypes")
	public <T> Map<Object, T> mapMap(Map sourceMap, Class<T> destClass) {
		if (SimpleUtil.isNotNull(sourceMap) && SimpleUtil.isNotNull(destClass)){
			Map<Object, T> destinationList = new HashMap<Object, T>();
			Iterator iterator = sourceMap.entrySet().iterator();
			while (iterator.hasNext()) {
				Map.Entry entry = (Map.Entry) iterator.next();
				Object sourceObject = entry.getValue();
				T destinationObject = instance.map(sourceObject, destClass);
				destinationList.put(entry.getKey(), destinationObject);
			}
			return destinationList;
		}else if (SimpleUtil.isNotNull(sourceMap) && sourceMap.isEmpty()){
			return new HashMap<Object, T>();
		}else{
			return null;
		}
	}

	/**
	 * @Title: copy
	 * @Description 将对象source的所有属性值拷贝到对象destObj中.
	 * @param source 对象source
	 * @param destObj 对象destObj
	 */
	public void copy(Object source, Object destObj) {
		instance.map(source, destObj);
	}
}
