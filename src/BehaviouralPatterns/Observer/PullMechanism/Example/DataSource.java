package BehaviouralPatterns.Observer.PullMechanism.Example;

public class DataSource extends Observable {
	private int dataid;
	public int getDataid(){
		return dataid;
	}
	public void setDataId(int dataid){
		this.dataid = dataid;
		System.out.println("The Data Id was Updated " + getDataid());
		notifyObserver();
	}
}
