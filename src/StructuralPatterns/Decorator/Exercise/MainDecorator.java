package StructuralPatterns.Decorator.Exercise;

public class MainDecorator implements IArtefact{
	private final String name;
	private final Boolean IsMain;
	private final IArtefact artefact;

	public MainDecorator(String name, Boolean isMain, IArtefact artefact) {
		this.name = name;
		this.IsMain = isMain;
		this.artefact = artefact;
	}

	@Override
	public String render() {
		String renderString= "";
		renderString = String.format("%s %s ", name, IsMain==Boolean.TRUE);
		renderString += this.artefact.render();
		return renderString;
	}
}
