package com.exe.springdi4;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MyTimeService implements TimeService{

	public String getTimeString() {
		
		SimpleDateFormat sbf = 
				(SimpleDateFormat)SimpleDateFormat.
				getDateTimeInstance(SimpleDateFormat.LONG,
						SimpleDateFormat.LONG);//날짜,시간 위치로판단
		
		String now = sbf.format(new Date());
		
		return now;
	}

}
