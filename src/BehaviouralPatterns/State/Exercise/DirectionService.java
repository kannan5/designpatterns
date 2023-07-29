package BehaviouralPatterns.State.Exercise;

public class DirectionService {
	private Commute commute;

	public Object getEta() {
		return commute.getEta();
	}

	public Object getDirection() {
		return commute.getDirection();
	}

	public Commute getTravelMode() {
		return commute;
	}

	public void setTravelMode(Commute commute) {
		this.commute = commute;
	}
}
