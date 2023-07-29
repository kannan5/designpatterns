package CreationalPatterns.Prototype.ExerciseSolution;

public class Clip implements Component {
	@Override
	public Component Clone() {
		return new Clip();
	}
}
