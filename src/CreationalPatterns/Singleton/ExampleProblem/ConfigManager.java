package CreationalPatterns.Singleton.ExampleProblem;

import java.util.HashMap;

public class ConfigManager {
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
