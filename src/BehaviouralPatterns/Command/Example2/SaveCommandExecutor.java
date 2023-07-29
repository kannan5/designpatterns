package BehaviouralPatterns.Command.Example2;

public class SaveCommandExecutor implements IDoCommand {
	private HtmlDocument htmlDocument;

	@Override
	public void Execute() {
		htmlDocument.setContent("Save Done");
		System.out.println("Save Successfully");
	}

	public SaveCommandExecutor(HtmlDocument htmlDocument) {
		this.htmlDocument = htmlDocument;
	}
}
