package ex15usefulcalss;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class E05DateCalendarX {

	static Date date;
	static String myDateFormat(Calendar cal) {
		date = cal.getTime();
		return new SimpleDateFormat("yyyy-MM-dd").format(date);
	}
	
	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance();
		System.out.println("현재날짜: "+myDateFormat(cal));
		
		cal.add(Calendar.DATE, 1);
		System.out.println("내일날짜: "+myDateFormat(cal)); 
	
		Calendar cal2 = Calendar.getInstance();
		cal2.add(Calendar.MONDAY, 1);
		System.out.println("월요일+1?:"+myDateFormat(cal2));
		
		System.out.println("JANUARY-1월: "+Calendar.JANUARY);
		System.out.println("DECEMBER-11월: "+Calendar.DECEMBER);
		
	}

}
