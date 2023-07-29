package CreationalPatterns.AbstractFactory.ExampleProblem.App;

import CreationalPatterns.AbstractFactory.ExampleProblem.Ant.AntButton;
import CreationalPatterns.AbstractFactory.ExampleProblem.Ant.AntTextBox;
import CreationalPatterns.AbstractFactory.ExampleProblem.Material.MaterialButton;
import CreationalPatterns.AbstractFactory.ExampleProblem.Material.MaterialTextBox;
import CreationalPatterns.AbstractFactory.ExampleProblem.Theme;

public class ContactForm {
	public void Render(Theme theme){
		if(theme == Theme.Ant){
			new AntButton().Render();
			new AntTextBox().Render();
		}
		else if(theme == Theme.Material){
			new MaterialButton().Render();
			new MaterialTextBox().Render();
		}
	}
}
