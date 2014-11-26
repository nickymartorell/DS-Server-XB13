package model.calendar;

import java.sql.SQLException;

import model.QueryBuild.QueryBuilder;

public class CalendarDataHandler {
	
	QueryBuilder qb = new QueryBuilder();
	GetCalendarData gc = new GetCalendarData();
	
	public void export2Database(int userId, String cbsUserId) {
		
		long startTime = System.nanoTime();
				
		String[] fields = {"event_id", " createdby", "start", "end", "title", "description", "location", "calendarid", "active"};
		String[] values = {gc.getDataFromCalendar().get(i).getEventId(), String.valueOf(userId)};
		
		try {
			qb.insertInto("events", fields).values(values).Execute();
			
			System.out.println("Event created");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
	
}
}