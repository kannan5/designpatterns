package CreationalPatterns.AbstractFactory.ExampleSolution.Material;

import CreationalPatterns.AbstractFactory.ExampleSolution.TextBox;

public class MaterialTextBox implements TextBox {
	@Override
	public void Render() {
		System.out.println("The Material Text box was rendered");
	}
}
