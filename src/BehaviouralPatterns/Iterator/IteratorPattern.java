package BehaviouralPatterns.Iterator;

import BehaviouralPatterns.Iterator.Example.NumberHistory;
import BehaviouralPatterns.Iterator.Exercise.ProductConsumer;

public class IteratorPattern {

	public void IteratorPatternExampleClient(){
		NumberHistory numberHistory = new NumberHistory();
		Iterator numIterator = numberHistory.CreateIterator();
		numberHistory.push(1);
		numberHistory.push(2);
		numberHistory.push(3);
		numberHistory.push(4);
		numberHistory.pop();
		while(numIterator.HasNext()){
			System.out.println(numIterator.Current());
			numIterator.Next();
		}
	}


	public void IteratorPatternExerciseClient(){
		ProductConsumer productConsumer = new ProductConsumer();
		productConsumer.ProductConstruct();
	}
}
