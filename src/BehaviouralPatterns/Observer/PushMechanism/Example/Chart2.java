package BehaviouralPatterns.Observer.PushMechanism.Example;

public class Chart2 implements Observer2 {
	@Override
	public void Update(int notifyValue) {
		System.out.println("Chart Got Notified!!!" + notifyValue);
	}
}
