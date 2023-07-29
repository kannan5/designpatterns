package BehaviouralPatterns.Iterator.Example;

import BehaviouralPatterns.Iterator.Iterator;

public class ArrayIterator implements Iterator<Integer> {
	private int index = 0;
	private int[] intArray;
	@Override
	public boolean HasNext() {
		return (intArray.length -1 > index);
	}

	@Override
	public Integer Current() {
		return intArray[index];
	}

	@Override
	public void Next() {
		index++;
	}

	public ArrayIterator(int arraySize) {
		this.intArray = new int[arraySize];
	}
}
