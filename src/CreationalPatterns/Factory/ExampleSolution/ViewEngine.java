package CreationalPatterns.Factory.ExampleSolution;

import java.util.Map;

public interface ViewEngine {

	String Render(String viewName, Map<String, Object> context);
}
