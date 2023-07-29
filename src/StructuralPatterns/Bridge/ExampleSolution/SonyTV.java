package StructuralPatterns.Bridge.ExampleSolution;

public class SonyTV implements Device {

	public void ScanChannels() {
		System.out.println("The Scan was Started");
		System.out.println("The Scan was Completed");
	}

	@Override
	public void SetChannel(int channelId) {
		System.out.println("Sony: The Channel Set to " + Integer.toString(channelId));
	}

	@Override
	public void TurnOn() {
		System.out.println("Sony: Tv On");
	}

	@Override
	public void TurnOff() {
		System.out.println("Sony: Tv Off");
	}

	public void SonyBraviaEngine(){
		System.out.println("Sony Bravia Engine");
	}
}
