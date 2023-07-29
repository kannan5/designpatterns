package StructuralPatterns.Adapter.Example;

public class RedFilter extends ImageFilter{
	private Image image;

	public RedFilter(Image image) {
		this.image = image;
	}

	@Override
	public void Apply() {
		System.out.println("Red Filter Applied" + image.getFileName());
	}

	@Override
	public void Revoke() {
		System.out.println("The Red Filter Was Revoked");
	}
}
