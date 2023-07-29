package CreationalPatterns.AbstractFactory.ExampleProblem.Material;

import CreationalPatterns.AbstractFactory.ExampleProblem.TextBox;

public class MaterialTextBox implements TextBox {
	@Override
	public void Render() {
		System.out.println("The Material Text box was rendered");
	}
}
