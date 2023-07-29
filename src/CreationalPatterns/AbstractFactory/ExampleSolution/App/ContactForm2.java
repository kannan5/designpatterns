package CreationalPatterns.AbstractFactory.ExampleSolution.App;

import CreationalPatterns.AbstractFactory.ExampleSolution.WidgetFactory;

public class ContactForm2 {
	public void Render(WidgetFactory widgetFactory){
		widgetFactory.CreateTextBox().Render();
		widgetFactory.CreateButton().Render();
	}
}
