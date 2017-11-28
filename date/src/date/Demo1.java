package date;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

import javax.print.attribute.standard.DateTimeAtCompleted;

import org.joda.time.DateTime;
import org.joda.time.Minutes;
import org.joda.time.Period;
import org.joda.time.Years;
import org.joda.time.DateTime.Property;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.junit.Test;

public class Demo1 {
	public static void main(String[] args) {
		long currentTimeMillis = System.currentTimeMillis();
		//			System.out.println(currentTimeMillis);
		//		System.out.println(System.getProperty("user.timezone"));
		TimeZone tz = TimeZone.getDefault();
		System.out.println(tz.getID());

		Locale locale = Locale.getDefault();
		System.out.println(locale.toString());
	}

	@Test
	public void fun1()
	{
		Calendar calendar = Calendar.getInstance();
		System.out.println("year: "+calendar.get(Calendar.YEAR));
		System.out.println("month: "+calendar.get(Calendar.MONTH));
		System.out.println("day: "+calendar.get(Calendar.DAY_OF_MONTH));
		System.out.println("hour: "+calendar.get(Calendar.HOUR_OF_DAY));
		System.out.println("minute: "+calendar.get(Calendar.MINUTE));
		System.out.println("second: "+calendar.get(Calendar.SECOND));
		System.out.println("millisecond: " +calendar.get(Calendar.MILLISECOND));
		System.out.println("day_of_week: " + calendar.get(Calendar.DAY_OF_WEEK));
	}
	@Test
	public void fun2()
	{
		java.util.Date date=new java.util.Date();
		System.out.println(date.getTime());
		Calendar date1=Calendar.getInstance();
//		System.out.println(date1.getTime(
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd E hh:mm:ss");
		String format = sdf.format(date1.getTime());
		System.out.println(format);
	}
	@Test
	public void fun3()
	{
		DateTime dt=new DateTime(2017,11,26,1,1,1);
		System.out.println(dt.getYear());
		System.out.println(dt.getMonthOfYear());
		System.out.println(dt.getDayOfMonth());
		System.out.println(dt.getHourOfDay());
		System.out.println(dt.getMinuteOfDay());
		System.out.println(dt.getSecondOfDay());
		System.out.println(dt.getDayOfWeek());
//		System.out.println(dt.getWeekOfWeekyear());
	}
	@Test
	public void fun4()
	{
		DateTime dt=new DateTime();
		System.out.println(dt);
		System.out.println(dt.toString("yyyy-MM-dd HH:mm:ss"));
	}
	@Test
	public void fun5()
	{
		DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm");
		DateTime dt = formatter.parseDateTime("2016-08-18 14:20");
		System.out.println(dt);
	}
	@Test
	public void fun6()
	{
		DateTime dateTime=new DateTime();
//		DateTime plusHours = dateTime.plusMinutes(19).plusHours(1);
//		System.out.println(plusHours);
		
		//调整时间
		DateTime withHourOfDay = dateTime.withHourOfDay(3).millisOfDay().withMaximumValue();
		DateTime dayOfWeek = dateTime.dayOfWeek().withMaximumValue();
		
		System.out.println(withHourOfDay);
		System.out.println(dayOfWeek);
//		DateTime dateTime2=new DateTime(year, monthOfYear, dayOfMonth, hourOfDay, minuteOfHour, secondOfMinute, chronology)
	}
	@Test
	public void fun7()
	{
		DateTime date1=new DateTime(2017,10,25,0,0);
		DateTime date2=new DateTime(2017,10,25,10,10);
		Period period=new Period(date1,date2);
		System.out.println(period.getDays());
		System.out.println(period.getHours());
		System.out.println(period.getMinutes());
		int yearsBetween = Years.yearsBetween(date1, DateTime.now()).getYears();
		System.out.println(yearsBetween);
	}
	@Test
	public void fun8()
	{
		DateTime withMillisOfDay = DateTime.now().withMillisOfDay(0).withHourOfDay(13);
		int minutesBetween = Minutes.minutesBetween(withMillisOfDay, DateTime.now()).getMinutes();
		System.out.println(minutesBetween);
//		System.out.println(withMillisOfDay);
	}
	@Test
	public void fun9()
	{
		DateTime dt = new DateTime(new java.util.Date());
		java.util.Date date = dt.toDate();
		
	}


}
enum Week{
	
}
