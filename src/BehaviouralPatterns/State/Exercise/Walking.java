package BehaviouralPatterns.State.Exercise;

public class Walking extends Commute{
	protected int type = 4;
	@Override
	public Object getEta() {
		System.out.println("Calculating ETA (Walking)");
		return type;
	}
	@Override
	public Object getDirection() {
		System.out.println("Calculating Direction (Walking)");
		return type;
	}

}
