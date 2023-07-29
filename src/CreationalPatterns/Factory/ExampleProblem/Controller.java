package CreationalPatterns.Factory.ExampleProblem;

import java.util.Map;

public class Controller {
	public void Render(String viewName, Map<String, Object> context){
		var engine = new MachaViewEngine();
		var result = engine.Render(viewName, context);
		System.out.println(result);
	}

	public void Render(String viewName, Map<String, Object> context, ViewEngine viewEngine) {
		var result = viewEngine.Render(viewName, context);
		System.out.println(result);
	}

}
