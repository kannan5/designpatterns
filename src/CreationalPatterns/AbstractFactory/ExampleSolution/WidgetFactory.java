package CreationalPatterns.AbstractFactory.ExampleSolution;

import CreationalPatterns.AbstractFactory.ExampleProblem.Button;
import CreationalPatterns.AbstractFactory.ExampleProblem.TextBox;

public interface WidgetFactory {
	Button CreateButton();
	TextBox CreateTextBox();
}
