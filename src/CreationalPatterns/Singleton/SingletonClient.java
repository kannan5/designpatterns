package CreationalPatterns.Singleton;

import CreationalPatterns.Singleton.ExampleProblem.SingletonProblemClient;
import CreationalPatterns.Singleton.ExampleSolution.SingletonSolutionClient;

public class SingletonClient {
	public void SingletonProblem(){
		SingletonProblemClient singletonproblemClient = new SingletonProblemClient();
		singletonproblemClient.RunProblem();
	}
	public void SingletonSolution(){
		SingletonSolutionClient singletonSolutionClient = new SingletonSolutionClient();
		singletonSolutionClient.RunSolution();
	}
}
