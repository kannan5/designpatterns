package CreationalPatterns.Factory.ExampleSolution.Sharp;

import CreationalPatterns.Factory.ExampleSolution.Macha.Controller;
import CreationalPatterns.Factory.ExampleSolution.Macha.MachaViewEngine;
import CreationalPatterns.Factory.ExampleSolution.ViewEngine;

import java.util.Map;

public class SharpController extends Controller {

	@Override
	protected ViewEngine CreateViewEngine(){
		return new SharpViewEngine();
	}
}
