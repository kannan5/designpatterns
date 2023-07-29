package CreationalPatterns.AbstractFactory.ExampleSolution.Material;

import CreationalPatterns.AbstractFactory.ExampleProblem.Button;
import CreationalPatterns.AbstractFactory.ExampleProblem.Material.MaterialButton;
import CreationalPatterns.AbstractFactory.ExampleProblem.Material.MaterialTextBox;
import CreationalPatterns.AbstractFactory.ExampleProblem.TextBox;
import CreationalPatterns.AbstractFactory.ExampleSolution.WidgetFactory;


public class MaterialWidgetFactory implements WidgetFactory {

	@Override
	public Button CreateButton() {
		return new MaterialButton();
	}

	@Override
	public TextBox CreateTextBox() {
		return new MaterialTextBox();
	}
}
