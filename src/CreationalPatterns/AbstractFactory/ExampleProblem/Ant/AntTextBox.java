package CreationalPatterns.AbstractFactory.ExampleProblem.Ant;

import CreationalPatterns.AbstractFactory.ExampleProblem.TextBox;

public class AntTextBox implements TextBox {
	@Override
	public void Render() {
		System.out.println("The Ant Text box was rendered");
	}
}
