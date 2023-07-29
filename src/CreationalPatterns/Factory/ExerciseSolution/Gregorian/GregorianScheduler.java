package CreationalPatterns.Factory.ExerciseSolution.Gregorian;

import CreationalPatterns.Factory.ExerciseSolution.ICalendar;
import CreationalPatterns.Factory.ExerciseSolution.Scheduler;

public class GregorianScheduler extends Scheduler {
	@Override
	protected ICalendar GetCalendar(){
		return new GregorianYearCalendar();
	}
}
