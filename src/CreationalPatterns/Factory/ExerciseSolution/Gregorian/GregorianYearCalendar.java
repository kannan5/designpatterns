package CreationalPatterns.Factory.ExerciseSolution.Gregorian;

import CreationalPatterns.Factory.ExerciseSolution.Event;
import CreationalPatterns.Factory.ExerciseSolution.ICalendar;

import java.util.Date;

public class GregorianYearCalendar implements ICalendar {
    public void AddEvent(Event event, Date date) {
        System.out.println("Adding an event on the given date. - Geogorian Calendar");
    }
}
