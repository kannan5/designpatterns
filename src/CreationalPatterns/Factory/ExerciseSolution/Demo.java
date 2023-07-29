package CreationalPatterns.Factory.ExerciseSolution;

import CreationalPatterns.Factory.ExerciseSolution.Arabian.ArabianScheduler;
import CreationalPatterns.Factory.ExerciseSolution.Gregorian.GregorianScheduler;

public class Demo {
    public static void show() {
        var gregorianScheduler = new GregorianScheduler();
        gregorianScheduler.schedule(new Event());

        var arabianScheduler = new ArabianScheduler();
        arabianScheduler.schedule(new Event());
    }
}
