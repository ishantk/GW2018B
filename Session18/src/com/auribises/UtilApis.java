package com.auribises;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class UtilApis {

	public static void main(String[] args) {
		
		Date date = new Date();
		
		String dateTime = date.toString();
		
		System.out.println(dateTime);

		SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MM-YYYY");
		String date1 = sdf1.format(date);
		System.out.println(date1);
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm:ss");
		String date2 = sdf2.format(date);
		System.out.println(date2);
		
		Calendar cal = Calendar.getInstance();
		int dd = cal.get(Calendar.DAY_OF_MONTH);
		int mm = cal.get(Calendar.MONTH); // 0-11
		int yy = cal.get(Calendar.YEAR);
		
		int hh = cal.get(Calendar.HOUR_OF_DAY);
		int mi = cal.get(Calendar.MINUTE);
		
		System.out.println(dd+"/"+(mm+1)+"/"+yy);
		System.out.println(hh+":"+mi);
		
		System.out.println(Math.PI);
		System.out.println(Math.sqrt(2));
		System.out.println(Math.log10(100));
		System.out.println(Math.sin(100));
	}

}
