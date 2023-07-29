package StructuralPatterns.Bridge.ExampleProblem;

public class SonyAdvancedRemoteControl extends AdvancedRemoteControl {
	private final SonyRemoteControl sonyRemoteControl = new SonyRemoteControl();
	@Override
	public void ScanChannels() {
		System.out.println("The Scan was Started");
		System.out.println("The Scan was Completed");
	}

	@Override
	public void SetChannel(int channelId) {
		System.out.println("The Channel Set to " + Integer.toString(channelId));
	}

	@Override
	public void TurnOn() {
		sonyRemoteControl.TurnOn();
	}

	@Override
	public void TurnOff() {
		sonyRemoteControl.TurnOff();
	}
}
