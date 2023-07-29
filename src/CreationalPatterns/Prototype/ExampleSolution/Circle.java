package CreationalPatterns.Prototype.ExampleSolution;

public class Circle implements Component {
	private int radius;
	@Override
	public void Render() {
		System.out.println("The Circle was rendered");
	}

	//	The Circle Class will Take care of how circle instance cloning should happen, what are the things.
	// Implemented OCP Principle For More Extensible and Mitigated Modification of Existing Code.
	@Override
	public Component Clone() {
		Circle circleClone = new Circle();
		circleClone.setRadius(this.getRadius());
		return circleClone;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
}
