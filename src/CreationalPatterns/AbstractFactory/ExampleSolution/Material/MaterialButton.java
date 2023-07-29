package CreationalPatterns.AbstractFactory.ExampleSolution.Material;

import CreationalPatterns.AbstractFactory.ExampleSolution.Button;

public class MaterialButton implements Button {
	@Override
	public void Render() {
		System.out.println("The Material Button was rendered");
	}
}
