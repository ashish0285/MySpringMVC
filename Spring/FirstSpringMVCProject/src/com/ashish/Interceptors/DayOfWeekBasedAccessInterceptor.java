package com.ashish.Interceptors;

import java.util.Calendar;
import java.util.TimeZone;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class DayOfWeekBasedAccessInterceptor extends HandlerInterceptorAdapter{

	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
	Calendar cal = Calendar.getInstance();
	int dayOfWeek= cal.get(cal.DAY_OF_WEEK);
		
	 if (dayOfWeek == Calendar.SUNDAY){
		 
		String day="Sunday";
		switch (dayOfWeek){
		case Calendar.MONDAY: day="Monday"; break;
		case Calendar.TUESDAY: day="Tuesday"; break;
		case Calendar.WEDNESDAY: day="Wednesday"; break;
		case Calendar.THURSDAY: day="Thursday"; break;
		case Calendar.FRIDAY: day="Friday"; break;
		case Calendar.SATURDAY: day="Saturday"; break;
		case Calendar.SUNDAY: day="Sunday"; break;
		
		}
		response.getWriter().write("This Website is Closed on " + day + ", Please Access it on any other WeekDay");
		 return false;
	 }
	 
		return true;
	}

}
