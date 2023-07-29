package BehaviouralPatterns.Strategy.Example;

public class RGBFilter implements Filter{
	@Override
	public void ApplyFilter() {
		System.out.println("RGB Filter was Applied");
	}

	@Override
	public void RevertFilter() {
		System.out.println("Applied RGB Filter was Reverted");
	}
}
