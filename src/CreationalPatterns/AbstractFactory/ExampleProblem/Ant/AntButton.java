package CreationalPatterns.AbstractFactory.ExampleProblem.Ant;

import CreationalPatterns.AbstractFactory.ExampleProblem.Button;

public class AntButton implements Button {
	@Override
	public void Render() {
		System.out.println("The Ant Button was rendered");
	}
}
