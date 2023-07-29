package CreationalPatterns.Factory.ExampleSolution.Macha;

import CreationalPatterns.Factory.ExampleSolution.ViewEngine;

import java.util.Map;

public class Controller {
	protected ViewEngine CreateViewEngine(){
		return new MachaViewEngine();
	}

	public String Render(String viewName, Map<String, Object> context) {
		var engine = this.CreateViewEngine();
		var result = engine.Render(viewName, context);
		System.out.println(result);
		return "View Rendered By Macha";
	}
}
