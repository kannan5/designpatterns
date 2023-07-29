package CreationalPatterns.Factory.ExampleProblem;

import java.util.Map;

public class SharpViewEngine implements ViewEngine {
	public String Render(String viewName, Map<String, Object> context){
		return "View Rendered By Sharp";
	}
}
