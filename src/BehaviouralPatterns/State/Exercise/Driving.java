package BehaviouralPatterns.State.Exercise;

public class Driving extends Commute{
	protected int type = 1;
	@Override
	public Object getEta() {
		System.out.println("Calculating ETA (driving)");
		return type;
	}
	@Override
	public Object getDirection() {
		System.out.println("Calculating Direction (driving)");
		return type;
	}
}
