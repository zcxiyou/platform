package com.hx.common.utils;

import java.util.Collection;
import java.util.List;


/**
 * @author lenovo
 *
 */
public class DozerUtil {

	/**
	 * @Title: map
	 * @Description: 对象映射
	 * @param source
	 * @param destClass
	 * @return
	 * @return T 返回类型
	 * @throws
	 */
	public static <T> T map(Object source, Class<T> destClass) {
		return DozerMapperSingleton.getInstance().map(source, destClass);
	}

	/**
	 * @Title: mapList
	 * @Description: 集合映射
	 * @param sourceList
	 * @param destClass
	 * @return
	 * @return List<T> 返回类型
	 * @throws
	 */
	public static <T> List<T> mapList(Collection<?> sourceList, Class<T> destClass) {
		return DozerMapperSingleton.getInstance().mapList(sourceList, destClass);
	}
}
