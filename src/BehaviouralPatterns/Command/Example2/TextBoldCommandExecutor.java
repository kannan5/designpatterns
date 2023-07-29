package BehaviouralPatterns.Command.Example2;

public class TextBoldCommandExecutor implements IUndoCommand{
	private String prevcontent;
	private HtmlDocument htmlDocument;
	private StoreHistory history = new StoreHistory();
	public TextBoldCommandExecutor(HtmlDocument htmlDocument) {
		this.htmlDocument = htmlDocument;
	}

	@Override
	public void Execute() {
		prevcontent = htmlDocument.getContent();
		htmlDocument.MakeBold();
		history.Add(this);
	}

	@Override
	public void Unexecute() {
		var prevState = (TextBoldCommandExecutor)history.Pop();
		htmlDocument.setContent(prevState.prevcontent);
	}
}
