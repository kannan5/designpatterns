package CreationalPatterns.AbstractFactory.ExampleProblem.Material;

import CreationalPatterns.AbstractFactory.ExampleProblem.Button;

public class MaterialButton implements Button {
	@Override
	public void Render() {
		System.out.println("The Material Button was rendered");
	}
}
