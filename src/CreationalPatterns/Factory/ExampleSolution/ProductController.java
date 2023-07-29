package CreationalPatterns.Factory.ExampleSolution;

import CreationalPatterns.Factory.ExampleSolution.Macha.Controller;
import CreationalPatterns.Factory.ExampleSolution.Sharp.SharpController;

import java.util.HashMap;
import java.util.Map;

public class ProductController extends SharpController {
	public void ListProducts(){
		Map<String, Object> context = new HashMap<>();
		context.put("Product1", "ProductValue");
		super.Render("productRender", context);
	}
}
