package BehaviouralPatterns.Observer.PushMechanism.Example;

public class SpreadSheet2 implements Observer2 {

	@Override
	public void Update(int notifyValue) {
		System.out.println("SpreadSheet Got Notified" + notifyValue);
	}
}
