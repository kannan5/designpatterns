package StructuralPatterns.Proxy;

import StructuralPatterns.Proxy.ExampleProblem.ProxyProblemClient;
import StructuralPatterns.Proxy.ExampleSolution.ProxySolutionClient;

public class ProxyClient {
	public void RunProxyProblem() throws NoSuchFieldException {
		ProxySolutionClient proxySolutionClient = new ProxySolutionClient();
		proxySolutionClient.SolutionRun();
	}

	public void RunProxySolution() throws NoSuchFieldException {
		ProxySolutionClient proxySolutionClient = new ProxySolutionClient();
		proxySolutionClient.SolutionRun();
	}
}
