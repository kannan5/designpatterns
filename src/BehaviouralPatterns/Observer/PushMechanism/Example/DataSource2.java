package BehaviouralPatterns.Observer.PushMechanism.Example;

public class DataSource2 extends Observable2 {
	private int dataid;
	public int getDataid(){
		return dataid;
	}
	public void setDataId(int dataid){
		this.dataid = dataid;
		System.out.println("The Data Id was Updated " + getDataid());
		notifyObserver(dataid);
	}
}
