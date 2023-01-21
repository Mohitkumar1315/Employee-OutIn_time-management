package com.cetpa.util;

import java.time.LocalDate;
import java.time.LocalTime;

public class LocalDateTime 
{
	public static String getCurrentTime()
	{
		LocalTime lt=LocalTime.now();
		String time=lt.getHour()+":"+lt.getMinute()+":"+lt.getSecond();
		return time;
	}
	public static String getCurrentDate()
	{
		LocalDate dt=LocalDate.now();
		String date=dt.getDayOfMonth()+"-"+dt.getMonthValue()+"-"+dt.getYear();
		return date;
	}
	public static String chageDateFormat(String date)
	{
		String []str=date.split("-");
		date=Integer.parseInt(str[2])+"-"+Integer.parseInt(str[1])+"-"+Integer.parseInt(str[0]);
		return date;
	}
	public static String getTotal(String intime,String outtime)
	{
		String[] x=intime.split(":");
		String[] y=outtime.split(":");
		int n1=convert(x[0])*60*60+convert(x[1])*60+convert(x[2]);
		int n2=convert(y[0])*60*60+convert(y[1])*60+convert(y[2]);
		int d=n1-n2;
		String total=d/60+" min "+d%60+" sec";
		return total;
	}
	public static int convert(String n)
	{
		return Integer.parseInt(n);
	}
}
