package BehaviouralPatterns.Observer.PullMechanism.Example;

public class SpreadSheet implements Observer {
	private DataSource dataSource;

	public SpreadSheet(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public void Update() {
		System.out.println("SpreadSheet Got Notified"+ dataSource.getDataid());
	}
}
