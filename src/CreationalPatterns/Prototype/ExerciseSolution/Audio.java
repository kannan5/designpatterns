package CreationalPatterns.Prototype.ExerciseSolution;

public class Audio implements Component {
	@Override
	public Component Clone() {
		return new Audio();
	}
}
