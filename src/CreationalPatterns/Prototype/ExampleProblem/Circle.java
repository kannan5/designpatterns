package CreationalPatterns.Prototype.ExampleProblem;

public class Circle implements Component{
	private int radius;
	@Override
	public void Render() {
		System.out.println("The Circle was rendered");
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
}
