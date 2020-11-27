package com.hx.common.utils;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @Title: DateUtil.java
 * @Package com.shcf.iomp.util
 * @Description: 日期工具类
 * @author zcxiyou
 * @date 2018年5月16日 下午1:15:35
 * @version V1.0
 * @FunctionCode:
 */
public class DateUtil {

	public static final String PATTERN_DATE_yyyyMMdd = "yyyyMMdd";
	public static final String PATTERN_DATE_yyyy_MM_dd = "yyyy-MM-dd";
	public static final String PATTERN_DATE_yyyy_MM_dd_HH_mm_ss = "yyyy-MM-dd HH:mm:ss";
	public static final String PATTERN_DATE_yyyyMMddHHmmss = "yyyyMMddHHmmss";
	public static final String PATTERN_TIME_HH = "HH:mm:ss";
	public static final String PATTERN_TIME_HHMMSS = "HHmmss";

	/**
	 * 根据传入的格式,返回日期字符串
	 * 
	 * @param date
	 * @param format
	 * @return
	 */
	public static String getDateString(Date date, String format) {
		if (date == null)
			return "";
		SimpleDateFormat formatter = new SimpleDateFormat(format);
		String dateString = formatter.format(date);
		return dateString;
	}

	/**
	 * 获取当年第一天日期
	 * 
	 * @param year 年份
	 * @return Date
	 */
	public static Date getCurrYearFirst() {
		int year = Integer.parseInt(getDateString(new Date(), "yyyy"));
		Calendar calendar = Calendar.getInstance();
		calendar.clear();
		calendar.set(Calendar.YEAR, year);
		Date currYearFirst = calendar.getTime();
		return getDate(getDateString(currYearFirst, "yyyy-MM-dd"));
	}

	/**
	 * 获取当年最后一天日期
	 * 
	 * @param year 年份
	 * @return Date
	 */
	public static Date getCurrYearLast() {
		int year = Integer.parseInt(getDateString(new Date(), "yyyy"));
		Calendar calendar = Calendar.getInstance();
		calendar.clear();
		calendar.set(Calendar.YEAR, year);
		calendar.roll(Calendar.DAY_OF_YEAR, -1);
		Date currYearLast = calendar.getTime();
		return getDate(getDateString(currYearLast, "yyyy-MM-dd"));
	}

	/*
	 * 将字符串格式yyyy-MM-dd HH:mm:ss转让日期类型
	 * @param dateStr
	 * @return
	 */
	public static Date getDateAll(String dateStr) {
		Date ddd = new Date();
		try {
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			// formatter.applyPattern("yyyy-MM-dd");
			ddd = formatter.parse(dateStr);
		} catch (Exception e) {
		}
		return ddd;
	}

	/**
	 * 将字符串格式yyyy-MM-dd转让日期类型
	 * 
	 * @param dateStr
	 * @return
	 */
	public static Date getDate(String dateStr) {
		Date ddd = new Date();
		try {
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
			// formatter.applyPattern("yyyy-MM-dd");
			ddd = formatter.parse(dateStr);
		} catch (Exception e) {
		}
		return ddd;
	}

	/**
	 * 将字符串格式yyyyMMdd转让日期类型
	 * 
	 * @param dateStr
	 * @return
	 */
	public static Date getDateyyyyMMdd(String dateStr) {
		Date ddd = new Date();
		try {
			SimpleDateFormat formatter = new SimpleDateFormat(PATTERN_DATE_yyyyMMdd);
			ddd = formatter.parse(dateStr);
		} catch (Exception e) {
		}
		return ddd;
	}

	/**
	 * 将日期类型转字符串格式yyyyMMdd
	 * 
	 * @param dateStr
	 * @return
	 */
	public static String getDateFormate(Date date) {
		String str = "";
		try {
			SimpleDateFormat formatter = new SimpleDateFormat(PATTERN_DATE_yyyyMMdd);
			str = formatter.format(date);
		} catch (Exception e) {
		}
		return str;
	}

	/**
	 * 计算未来年
	 * 
	 * @param oldDate 传入时间
	 * @param years 年
	 * @return
	 */
	public static Date getNewDate(Date oldDate, long years) {
		int moth = (int) (years * 12);
		return getNewDateByMoth(oldDate, moth);

	}

	/**
	 * 计算未来年
	 * 
	 * @param oldDate 传入时间
	 * @param years 年
	 * @return
	 */
	public static Date getNewDateByMoth(Date oldDate, int moth) {
		/*
		 * long afterTime = (oldDate.getTime() / 1000) + 60 * 60 * 24 * 30 * moth; Date temp = new Date(); temp.setTime(afterTime * 1000); return temp;
		 */
		Calendar calender = Calendar.getInstance();
		calender.setTime(oldDate);
		calender.add(Calendar.MONTH, moth);
		return calender.getTime();
	}

	/**
	 * 计算过去年
	 * 
	 * @param oldDate 传入时间
	 * @param years 年
	 * @return
	 */
	public static Date getOldDateByMoth(Date newDate, int moth) {
		Calendar calender = Calendar.getInstance();
		calender.setTime(newDate);
		calender.add(Calendar.MONTH, -moth);
		return calender.getTime();

	}

	/**
	 * 数据四舍五入
	 * 
	 * @param d 待四舍五入的数据
	 * @param seit精度位
	 * @return 返回double精度的数据 特别注意的是0.00时返回数据是0.0
	 */
	public static double getScale(String str, int seit) {
		String dStr = getScaleString(str, seit);
		return new Double(dStr);
	}

	/**
	 * 数据四舍五入
	 * 
	 * @param d 待四舍五入的数据
	 * @param seit精度位
	 * @return 返回全精度的 字符串
	 */
	public static String getScaleString(String str, int seit) {
		BigDecimal bd = new BigDecimal(str + "");
		BigDecimal bd1 = bd.setScale(seit, BigDecimal.ROUND_HALF_UP);
		return bd1.toString();
	}

	/**
	 * 获取两日期之间的年差
	 * 
	 * @param start
	 * @param end
	 * @return
	 */
	public static Long getYears(Date start, Date end) {
		Long value = end.getTime() - start.getTime();
		if (value > 0) {
			double value1 = value;
			double del = 1000 * 3600 * 24 * 365l;
			Double year = value1 / del;
			year = getScale(year.toString(), 0);
			BigDecimal bd = new BigDecimal(year);
			if (year < 1) {
				return 1l;
			} else {
				return bd.longValue();
			}
		} else {
			return 0l;
		}
	}

	/**
	 * 如果是起始日期，时分秒设为0 如果是终止日期，时分秒设为23:59:59
	 * 
	 * @param d
	 * @param isBegin
	 * @return
	 */
	public static Date getQueryDate(Date d, boolean isBegin) {
		Calendar c = Calendar.getInstance();
		if (isBegin) {

			c.setTime(d);
			c.set(Calendar.HOUR_OF_DAY, 0);
			c.set(Calendar.MINUTE, 0);
			c.set(Calendar.SECOND, 0);
		} else {
			c.setTime(d);
			c.set(Calendar.HOUR_OF_DAY, 23);
			c.set(Calendar.MINUTE, 59);
			c.set(Calendar.SECOND, 59);
		}

		return c.getTime();
	}

	/**
	 * @Title: getCurrentDate
	 * @Description:
	 * @return
	 * @return String yyyy-MM-dd
	 * @throws @author zcxiyou
	 */
	public static String getCurrentDate() {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		return formatter.format(new Date());
	}
	/**
	* @Title: getNow
	* @Description: 获得指定格式的当前时间戳
	* @param format
	* @return 
	* @return  String    返回类型
	* @throws
	* @author zhongcheng 
	*/ 
	public static String getNow(String format) {
		long currentTime = System.currentTimeMillis();
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		return sdf.format(new Date(currentTime));
	}
	
	
	public static Date getNextDay(Date date,int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_MONTH, +day);//+1今天的时间加一天
        date = calendar.getTime();
        return date;
    }

}
