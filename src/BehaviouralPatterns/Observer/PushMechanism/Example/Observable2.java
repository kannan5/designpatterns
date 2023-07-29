package BehaviouralPatterns.Observer.PushMechanism.Example;

import java.util.ArrayList;
import java.util.List;

public class Observable2 {
	List<Observer2> observerList = new ArrayList<>();

	public void AddObserver(Observer2 observer){
		observerList.add(observer);
	}

	public void DeleteObserver(){
		observerList.remove(observerList.size()-1);
	}

	public void notifyObserver(int notifyValue){
		for (var observer :observerList) {
			observer.Update(notifyValue);
		}
	}
}
