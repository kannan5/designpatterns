package CreationalPatterns.Factory.ExampleSolution.Sharp;

import CreationalPatterns.Factory.ExampleSolution.ViewEngine;

import java.util.Map;

public class SharpViewEngine implements ViewEngine {
	public String Render(String viewName, Map<String, Object> context){
		return "View Rendered By Sharp";
	}
}
