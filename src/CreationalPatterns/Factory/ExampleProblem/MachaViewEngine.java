package CreationalPatterns.Factory.ExampleProblem;

import java.util.Map;

public class MachaViewEngine implements ViewEngine {
	public String Render(String viewName, Map<String, Object> context){
		return "View Rendered By Macha";
	}
}
