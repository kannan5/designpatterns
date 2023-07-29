package StructuralPatterns.Proxy.ExampleSolution;

import StructuralPatterns.Proxy.ExampleSolution.Library;

public class ProxySolutionClient {

	public void SolutionRun() throws NoSuchFieldException {
		var library = new Library();
		String[] fileNames = { "a", "b", "c"};
		for(var fileName : fileNames)
			library.Add(new EbookProxy(fileName));
		library.GetBook("a").Show();
	}
}
