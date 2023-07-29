package CreationalPatterns.Singleton.ExampleProblem;

public class SingletonProblemClient {

	public void RunProblem(){
		ConfigManager configManager = new ConfigManager();
		configManager.Add("ConnectionValue", "Test");
		System.out.println(configManager.Get("ConnectionValue"));

		ConfigManager configManager2 = new ConfigManager();
		System.out.println(configManager2.Get("ConnectionValue"));

/*		Here We need to create Single Instance over the application and use across the single instance
		we can go for static class for this logic but
	 the challenge is the class should not be static class for Certain Reason so we go for singleton pattern*/

	}
}
