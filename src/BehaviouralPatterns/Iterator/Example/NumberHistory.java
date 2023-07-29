package BehaviouralPatterns.Iterator.Example;

import BehaviouralPatterns.Iterator.Iterator;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

public class NumberHistory {
	private List<Integer> numberList = new ArrayList<Integer>(10);

	public void push(int number){
		numberList.add(number);
		System.out.println(MessageFormat.format("The Number {0} Was Added Successfully", number));
	}

	public void pop(){
		var deletedNum = numberList.remove(numberList.size()-1);
		System.out.println(MessageFormat.format("The Number {0} Was Deleted Successfully", deletedNum));
	}

	public Iterator CreateIterator(){
		return new ListIterator(numberList);
	}


	private class ListIterator implements Iterator<Integer> {
		private int index = 0;
		private List<Integer> intArray;
		@Override
		public boolean HasNext() {
			return (intArray.size() > index);
		}

		@Override
		public Integer Current() {
			return intArray.get(index);
		}

		@Override
		public void Next() {
			index++;
		}

		public ListIterator(List<Integer> intarrayList) {
			this.intArray = intarrayList;
		}
	}

}
