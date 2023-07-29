package StructuralPatterns.Adapter.Example.ThirdPartyFramework;

import StructuralPatterns.Adapter.Example.Image;

public class SepiaFilter {
	private Image image;

	public SepiaFilter(Image image) {
		this.image = image;
	}

	public void Enable(){
		System.out.println("Sepia Filter was Enabled " + image.getFileName());
	}

	public void Disable(){
		System.out.println("Sepia Filter was Disabled");
	}
}
