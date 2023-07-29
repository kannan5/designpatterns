package StructuralPatterns.Bridge.ExampleSolution;

import StructuralPatterns.Bridge.ExampleProblem.RemoteControl;

public class SamsungTV implements Device {
	@Override
	public void TurnOn() {
		System.out.println("Samsung: Tv On");
	}

	@Override
	public void TurnOff() {
		System.out.println("Samsung: Tv Off");
	}
	public void toggleSamsungAMOLEDPicture(){
		System.out.println("Samsung Amoled");
	}
	@Override
	public void SetChannel(int channelId) {
		System.out.println("Samsung: The Channel Set to " + Integer.toString(channelId));
	}

}
