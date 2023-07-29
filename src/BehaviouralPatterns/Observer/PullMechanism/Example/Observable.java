package BehaviouralPatterns.Observer.PullMechanism.Example;

import java.util.ArrayList;
import java.util.List;

public abstract class Observable {
	List<Observer> observerList = new ArrayList<>();

	public void AddObserver(Observer observer){
		observerList.add(observer);
	}

	public void DeleteObserver(){
		observerList.remove(observerList.size()-1);
	}

	public void notifyObserver(){
		for (var observer :observerList) {
			observer.Update();
		}
	}
}
