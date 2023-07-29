package CreationalPatterns.Singleton.ExerciseSolution;

public class SingletonExerciseSolution {
	public void  RunSolution(){

		Logger logger = Logger.GetInstance("Test file");
		logger.write("Test Message");

		Logger logger2 = Logger.GetInstance("Test file");
		logger2.write("Test Message");
		}
}
