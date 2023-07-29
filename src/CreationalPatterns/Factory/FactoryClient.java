package CreationalPatterns.Factory;

import CreationalPatterns.Factory.ExampleSolution.ProductController;
import CreationalPatterns.Factory.ExerciseSolution.Demo;

public class FactoryClient {

	public void FactoryExample(){
		CreationalPatterns.Factory.ExampleProblem.ProductController productController = new CreationalPatterns.Factory.ExampleProblem.ProductController();
		productController.ListProducts();

	}

	public void FactoryExampleSolution(){
		ProductController productController = new ProductController();
		productController.ListProducts();

	}

	public void FactoryExercise(){
		Demo.show();
	}
}
