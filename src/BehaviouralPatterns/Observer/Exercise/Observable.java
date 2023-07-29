package BehaviouralPatterns.Observer.Exercise;

import java.util.ArrayList;
import java.util.List;

public class Observable {
	private List<Observer> observableList = new ArrayList<>();

	public void AddObserver(Observer observer){ this.observableList.add(observer);}

	public void notifyObserver(){
		for (var observer: observableList) {
			observer.Update();
		}
	}

}
