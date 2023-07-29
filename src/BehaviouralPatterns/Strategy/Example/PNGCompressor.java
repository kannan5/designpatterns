package BehaviouralPatterns.Strategy.Example;

public class PNGCompressor implements Compressor{
	@Override
	public void StartCompress() {
		System.out.println("Start Compressing using PNG");
	}
}
