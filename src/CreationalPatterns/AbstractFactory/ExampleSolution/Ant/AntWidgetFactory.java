package CreationalPatterns.AbstractFactory.ExampleSolution.Ant;

import CreationalPatterns.AbstractFactory.ExampleProblem.Ant.AntButton;
import CreationalPatterns.AbstractFactory.ExampleProblem.Ant.AntTextBox;
import CreationalPatterns.AbstractFactory.ExampleProblem.Button;
import CreationalPatterns.AbstractFactory.ExampleProblem.Material.MaterialButton;
import CreationalPatterns.AbstractFactory.ExampleProblem.Material.MaterialTextBox;
import CreationalPatterns.AbstractFactory.ExampleProblem.TextBox;
import CreationalPatterns.AbstractFactory.ExampleSolution.WidgetFactory;

public class AntWidgetFactory implements WidgetFactory {
	@Override
	public Button CreateButton() {
		return new AntButton();
	}

	@Override
	public TextBox CreateTextBox() {
		return new AntTextBox();
	}
}
