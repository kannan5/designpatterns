package CreationalPatterns.Singleton.ExampleSolution;

import java.util.HashMap;

public class ConfigManager {


	// The Config Manager Class set as Private So we can't create multiple Instances of Class
	private ConfigManager() {}

	// We Created Static Instance of Config Manager so only single instance will be used across the application.
	private static ConfigManager configManager = new ConfigManager();

	// The Get Instance Method will return the static instance that we created

	public static ConfigManager GetInstance(){
		return configManager;
	}

	private final HashMap<String, String> configList = new HashMap<>();

	public void Add(String key, String value){
		configList.put(key, value);
	}

	public String Get(String key){
		if(configList.containsKey(key))
			return configList.get(key);
		return null;
	}

}
