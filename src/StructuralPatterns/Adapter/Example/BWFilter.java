package StructuralPatterns.Adapter.Example;

public class BWFilter extends ImageFilter{
	private Image image;

	public BWFilter(Image image) {
		this.image = image;
	}


	@Override
	public void Apply() {
		System.out.println("B/W Filter Applied "+ image.getFileName());
	}

	@Override
	public void Revoke() {
		System.out.println("The B/W Filter Was Revoked");
	}
}
