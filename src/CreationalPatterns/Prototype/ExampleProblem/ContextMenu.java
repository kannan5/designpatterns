package CreationalPatterns.Prototype.ExampleProblem;

public class ContextMenu {
	public Component Duplicate(Component component){
		/*
			Problem: In the Future, if new types of Component was Extended (Ex: Cyclinder, Square)
			we need to modify this Duplicate Method and add If statement and Implement Duplicate Steps

			Violation: This Violates The Open Closed Principle, Instead Of Extend The SubClasses We Introduced Modification
			of Existing Classes
		*/
		if(component instanceof Circle){
			Circle circleClone = new Circle();
			circleClone.setRadius(((Circle) component).getRadius());
			return circleClone;
		}
		return null;
	}
}
