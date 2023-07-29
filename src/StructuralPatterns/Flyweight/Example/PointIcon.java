package StructuralPatterns.Flyweight.Example;

public class PointIcon {
	private final PointType type;
	private final byte[] icon;

	public PointIcon(PointType type, byte[] icon) {
		this.type = type;
		this.icon = icon;
	}
	public String getPointType(){
		return type.toString();
	}
}
