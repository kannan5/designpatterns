package CreationalPatterns.Factory.ExerciseSolution;

import java.util.Date;

public abstract class Scheduler {

    public void schedule(Event event) {
        var today = new Date();
        var calendar = GetCalendar();
        calendar.AddEvent(event, today);
    }
    protected abstract ICalendar GetCalendar();
}
