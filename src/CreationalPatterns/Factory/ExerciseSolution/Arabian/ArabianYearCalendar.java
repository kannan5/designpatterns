package CreationalPatterns.Factory.ExerciseSolution.Arabian;

import CreationalPatterns.Factory.ExerciseSolution.Event;
import CreationalPatterns.Factory.ExerciseSolution.Gregorian.GregorianYearCalendar;

import java.util.Date;

public class ArabianYearCalendar extends GregorianYearCalendar {

	@Override
	public void AddEvent(Event event, Date date) {
		System.out.println("Adding an event on the given date. - Arabian Calendar");
	}
}
