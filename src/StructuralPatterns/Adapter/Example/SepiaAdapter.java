package StructuralPatterns.Adapter.Example;

import StructuralPatterns.Adapter.Example.ThirdPartyFramework.SepiaFilter;

public class SepiaAdapter extends ImageFilter {
	private SepiaFilter sepiaFilter;

	public SepiaAdapter(Image image) {
		sepiaFilter = new SepiaFilter(image);
	}

	@Override
	public void Apply() {
		sepiaFilter.Enable();
	}

	@Override
	public void Revoke() {
		sepiaFilter.Disable();
	}
}
