package StructuralPatterns.Proxy.ExampleProblem;

import StructuralPatterns.Proxy.ExampleSolution.EbookProxy;
import StructuralPatterns.Proxy.ExampleSolution.RealEbook;

public class ProxyProblemClient {
	public void ProblemRun() throws NoSuchFieldException {
		var library = new Library();
		String[] fileNames = { "a", "b", "c"};
		for(var fileName : fileNames)
			library.Add(new EbookProxy(fileName));
		library.GetBook("a").Show();
	}

}
