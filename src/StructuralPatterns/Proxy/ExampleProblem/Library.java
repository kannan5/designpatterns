package StructuralPatterns.Proxy.ExampleProblem;

import StructuralPatterns.Proxy.ExampleSolution.Ebook;
import StructuralPatterns.Proxy.ExampleSolution.EbookProxy;
import StructuralPatterns.Proxy.ExampleSolution.RealEbook;

import java.util.HashMap;
import java.util.Map;

public class Library {
	private Map<String, Ebook> books = new HashMap<>();
	public void Add(EbookProxy ebook){
		books.put(ebook.getFileName(), ebook);
	}
	public Ebook GetBook(String bookName) throws NoSuchFieldException {
		if (books.containsKey(bookName))
			return books.get(bookName);
		throw new NoSuchFieldException();
	}
}
