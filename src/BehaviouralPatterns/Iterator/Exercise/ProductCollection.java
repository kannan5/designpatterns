package BehaviouralPatterns.Iterator.Exercise;

import java.util.*;
import BehaviouralPatterns.Iterator.Iterator;
public class ProductCollection{
	private List<Product> products = new ArrayList<>();

	public void push(Product product) {
		products.add(product);
	}

	public void pop(){
		products.remove(products.size()-1);
	}

	public Iterator<Product> CreateIterator() {
		return new ProductListIterator(products);
	}

	private class ProductListIterator implements Iterator<Product>{

		private List<Product> products;
		private int index;

		@Override
		public boolean HasNext() {
			return products.size() > index;
		}

		@Override
		public Product Current() {
			return products.get(index);
		}

		@Override
		public void Next() {
			index++;
		}
		public ProductListIterator(List<Product> products) {
			this.products = products;
		}
	}

}
