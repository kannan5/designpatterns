package StructuralPatterns.Proxy.ExampleSolution;

import java.util.HashMap;
import java.util.Map;

public class Library {
	private Map<String, Ebook> books = new HashMap<>();
	public void Add(Ebook ebook){
		books.put(ebook.getFileName(), ebook);
	}
	public Ebook GetBook(String bookName) throws NoSuchFieldException {
		if (books.containsKey(bookName))
			return books.get(bookName);
		throw new NoSuchFieldException();
	}
}
