package CreationalPatterns.AbstractFactory;

import CreationalPatterns.AbstractFactory.ExampleProblem.App.ContactForm;
import CreationalPatterns.AbstractFactory.ExampleProblem.Theme;
import CreationalPatterns.AbstractFactory.ExampleSolution.Ant.AntWidgetFactory;
import CreationalPatterns.AbstractFactory.ExampleSolution.App.ContactForm2;
import CreationalPatterns.AbstractFactory.ExampleSolution.Material.MaterialWidgetFactory;
import CreationalPatterns.AbstractFactory.ExerciseProblem.Demo;

public class AbstractFactoryClient {
	public void ExampleProblem(){
		ContactForm contactForm = new ContactForm();
		contactForm.Render(Theme.Ant);
	}

	public void ExampleSolution(){
		ContactForm2 contactForm = new ContactForm2();
		contactForm.Render(new MaterialWidgetFactory());
	}

	public void ExerciseProblem(){
		Demo.show();
	}
	public void ExerciseSolution(){
		CreationalPatterns.AbstractFactory.ExerciseSolution.Demo.show();
	}
}
