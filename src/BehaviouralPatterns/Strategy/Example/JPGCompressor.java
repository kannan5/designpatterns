package BehaviouralPatterns.Strategy.Example;

public class JPGCompressor implements Compressor{
	@Override
	public void StartCompress() {
		System.out.println("Start Compressing using JPG");
	}
}
