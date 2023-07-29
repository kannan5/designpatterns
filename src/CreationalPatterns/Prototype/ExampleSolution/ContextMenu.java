package CreationalPatterns.Prototype.ExampleSolution;

public class ContextMenu {
	public Component Duplicate(Component component){
		/*
			Problem: In the Future, if new types of Component was Extended (Ex: Cyclinder, Square)
			we need to modify this Duplicate Method and add If statement and Implement Duplicate Steps

			Violation: This Violates The Open Closed Principle, Instead Of Extend The SubClasses We Introduced Modification
			of Existing Classes

			Solution: We Introduced Clone Method in Component Interface, So the Every Subclass's will Implement the Clone
			and Taken care of how clone should happen
		*/
		return component.Clone();
	}
}
