package BehaviouralPatterns.Iterator;

public interface Iterator<T> {
	boolean HasNext();
	T Current();
	void Next();
}
