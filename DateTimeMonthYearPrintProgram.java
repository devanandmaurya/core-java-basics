package com.dkh;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateTimeMonthYearPrintProgram {
	public static void main(String[] args) {

		int day, month, year;
		int hours, minute, second;
		GregorianCalendar cn = new GregorianCalendar();
		day=cn.getFirstDayOfWeek();
		System.out.println("cn??????>>>>>>>>>>>>"+cn.toString());
		Calendar cal = Calendar.getInstance();
		System.out.println("YEAR" + cal.get(Calendar.YEAR));
		System.out.println("MONTH " + (cal.get(Calendar.MONTH)+1));
		System.out.println(" DATE" + cal.get(+Calendar.DATE));

	}
}
