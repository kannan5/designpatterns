package CreationalPatterns.Factory.ExampleProblem;

import java.util.HashMap;
import java.util.Map;

public class ProductController extends Controller {
	public void ListProducts(){
		Map<String, Object> context = new HashMap<>();
		context.put("Product1", "ProductValue");
		super.Render("productRender", context, new MachaViewEngine());
	}
}
