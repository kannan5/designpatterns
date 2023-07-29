package BehaviouralPatterns.State.Exercise;

public class Bicycling extends Commute{
	protected int type = 2;
	@Override
	public Object getEta() {
		System.out.println("Calculating ETA (Bicycling)");
		return type;
	}
	@Override
	public Object getDirection() {
		System.out.println("Calculating Direction (Bicycling)");
		return type;
	}

}
