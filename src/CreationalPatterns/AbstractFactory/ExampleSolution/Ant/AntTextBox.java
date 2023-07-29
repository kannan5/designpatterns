package CreationalPatterns.AbstractFactory.ExampleSolution.Ant;

import CreationalPatterns.AbstractFactory.ExampleSolution.TextBox;

public class AntTextBox implements TextBox {
	@Override
	public void Render() {
		System.out.println("The Ant Text box was rendered");
	}
}
