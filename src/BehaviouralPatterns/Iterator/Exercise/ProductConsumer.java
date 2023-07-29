package BehaviouralPatterns.Iterator.Exercise;

import BehaviouralPatterns.Iterator.Iterator;

public class ProductConsumer {
	public void ProductConstruct(){
		ProductCollection productCollection = new ProductCollection();
		productCollection.push(new Product(1,"Apple"));
		productCollection.push(new Product(2,"Samsung"));
		productCollection.push(new Product(3,"Huawei"));
		productCollection.pop();
		Iterator productIterator = productCollection.CreateIterator();
		while (productIterator.HasNext()){
			System.out.println(productIterator.Current());
			productIterator.Next();
		}
	}
}
