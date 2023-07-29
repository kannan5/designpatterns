package BehaviouralPatterns.Command.Exercise;

public class TextCommandExecutor implements Command{
	private String prevText;
	private VideoEditor videoEditor;
	private VideoHistory videoHistory = new VideoHistory();

	public TextCommandExecutor(VideoEditor videoEditor) {
		this.videoEditor = videoEditor;
	}

	@Override
	public void Execute() {
		prevText = videoEditor.getText();
		videoHistory.add(this);
	}
	public void Execute(String newText){
		Execute();
		videoEditor.setText(newText);
	}

	@Override
	public void Unexecute() {
		TextCommandExecutor prevCommand = (TextCommandExecutor)videoHistory.pop();
		videoEditor.setText(prevCommand.prevText);
	}
}
