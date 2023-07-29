package StructuralPatterns.Bridge.ExampleProblem;

public class SamsungAdvancedRemoteControl extends AdvancedRemoteControl {
	private final SamsungRemoteControl samsungRemoteControl = new SamsungRemoteControl();
	@Override
	public void ScanChannels() {

	}

	@Override
	public void SetChannel(int channelId) {

	}

	@Override
	public void TurnOn() {
		samsungRemoteControl.TurnOn();
	}

	@Override
	public void TurnOff() {
		samsungRemoteControl.TurnOff();
	}
}
