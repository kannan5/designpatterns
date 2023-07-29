package CreationalPatterns.AbstractFactory.ExerciseSolution.BuildMuscle;

import CreationalPatterns.AbstractFactory.ExerciseSolution.MealPlan;
import CreationalPatterns.AbstractFactory.ExerciseSolution.WeightLoss.WeightLossWorkout;
import CreationalPatterns.AbstractFactory.ExerciseSolution.GymFactory;
import CreationalPatterns.AbstractFactory.ExerciseSolution.WorkoutPlan;

public class BuildMuscleFactory implements GymFactory {
	@Override
	public MealPlan MealPlan() {
		System.out.println("Build Muscle For Build Muscle");
		return new BuildMuscleMealPlan();
	}

	@Override
	public WorkoutPlan Workout() {
		System.out.println("Workout For Build Muscle");
		return new WeightLossWorkout();
	}
}
