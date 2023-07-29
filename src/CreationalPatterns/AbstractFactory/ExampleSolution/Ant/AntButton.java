package CreationalPatterns.AbstractFactory.ExampleSolution.Ant;

import CreationalPatterns.AbstractFactory.ExampleSolution.Button;

public class AntButton implements Button {
	@Override
	public void Render() {
		System.out.println("The Ant Button was rendered");
	}
}
