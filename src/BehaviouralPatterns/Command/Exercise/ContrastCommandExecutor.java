package BehaviouralPatterns.Command.Exercise;

public class ContrastCommandExecutor implements Command{
	private float prevContrast;
	private VideoEditor videoEditor;
	private VideoHistory videoHistory = new VideoHistory();

	public ContrastCommandExecutor(VideoEditor videoEditor) {
		this.videoEditor = videoEditor;
	}

	@Override
	public void Execute() {
		prevContrast = videoEditor.getContrast();
		float newContrast = prevContrast + 5;
		videoEditor.setContrast(newContrast);
		videoHistory.add(this);
	}

	@Override
	public void Unexecute() {
		ContrastCommandExecutor prevCommand = (ContrastCommandExecutor)videoHistory.pop();
		videoEditor.setContrast(prevCommand.prevContrast);
	}
}
