package BehaviouralPatterns.Observer.PullMechanism.Example;

public class Chart implements Observer {
	@Override
	public void Update() {
		System.out.println("Chart Got Notified!!!");
	}
}
