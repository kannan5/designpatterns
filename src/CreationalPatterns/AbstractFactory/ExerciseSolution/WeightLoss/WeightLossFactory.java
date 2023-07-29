package CreationalPatterns.AbstractFactory.ExerciseSolution.WeightLoss;

import CreationalPatterns.AbstractFactory.ExerciseSolution.BuildMuscle.BuildMuscleMealPlan;
import CreationalPatterns.AbstractFactory.ExerciseSolution.GymFactory;
import CreationalPatterns.AbstractFactory.ExerciseSolution.MealPlan;
import CreationalPatterns.AbstractFactory.ExerciseSolution.WorkoutPlan;

public class WeightLossFactory implements GymFactory {
	@Override
	public MealPlan MealPlan() {
		System.out.println("Build Muscle For WeightLoss");
		return new WeighLossMealPlan();
	}

	@Override
	public WorkoutPlan Workout() {
		System.out.println("Workout For WeightLoss");
		return new WeightLossWorkout();
	}
}
