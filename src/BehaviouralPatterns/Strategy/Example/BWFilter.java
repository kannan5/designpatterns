package BehaviouralPatterns.Strategy.Example;

public class BWFilter implements Filter{
	@Override
	public void ApplyFilter() {
		System.out.println("B/W Filter was Applied");
	}

	@Override
	public void RevertFilter() {
		System.out.println("Applied B/W Filter was Reverted");
	}
}
