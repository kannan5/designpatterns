package BehaviouralPatterns.State.Exercise;


public class Transit extends Commute{
	protected int type = 3;
	@Override
	public Object getEta() {
		System.out.println("Calculating ETA (Transit)");
		return type;
	}
	@Override
	public Object getDirection() {
		System.out.println("Calculating Direction (Transit)");
		return type;
	}
}
