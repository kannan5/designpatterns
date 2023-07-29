package CreationalPatterns.AbstractFactory.ExerciseSolution;

public class HomePage {
    private WorkoutPlan workoutPlan;
    private MealPlan mealPlan;

    public void setGoal(GymFactory weightLossFactory) {
        workoutPlan = weightLossFactory.Workout();
        mealPlan = weightLossFactory.MealPlan();
        System.out.println(workoutPlan);
        System.out.println(mealPlan);

    }
}
