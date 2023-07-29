package CreationalPatterns.Factory.ExerciseSolution.Arabian;

import CreationalPatterns.Factory.ExerciseSolution.ICalendar;
import CreationalPatterns.Factory.ExerciseSolution.Scheduler;

public class ArabianScheduler extends Scheduler {
	@Override
	protected ICalendar GetCalendar() {
		return new ArabianYearCalendar();
	}
}
