package CreationalPatterns.AbstractFactory.ExerciseSolution;

import CreationalPatterns.AbstractFactory.ExerciseSolution.BuildMuscle.BuildMuscleFactory;
import CreationalPatterns.AbstractFactory.ExerciseSolution.WeightLoss.WeightLossFactory;

public class Demo {
    public static void show() {
        var homePage = new HomePage();
        homePage.setGoal(new BuildMuscleFactory());
        homePage.setGoal(new WeightLossFactory());
    }
}
