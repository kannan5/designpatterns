package StructuralPatterns.Decorator.Exercise;

public class ErrorDecorator implements IArtefact{
	public ErrorDecorator(String name, boolean isError, IArtefact artefact) {
		this.name = name;
		this.IsError = isError;
		this.artefact = artefact;
	}

	private final String name;

	private final IArtefact artefact;

	private final boolean IsError;

	@Override
	public String render() {
		String renderString= "";
		renderString = String.format("%s %s ", name, IsError==Boolean.TRUE);
		renderString += this.artefact.render();
		return renderString;
	}

}
