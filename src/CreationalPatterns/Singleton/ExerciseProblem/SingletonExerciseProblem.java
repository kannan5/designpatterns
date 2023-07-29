package CreationalPatterns.Singleton.ExerciseProblem;

public class SingletonExerciseProblem {
	public void  RunProblem(){

		Logger logger = new Logger("Test file");
		logger.write("Test Message");

		Logger logger2 = new Logger("Test file");
		logger2.write("Test Message");
	}
}
