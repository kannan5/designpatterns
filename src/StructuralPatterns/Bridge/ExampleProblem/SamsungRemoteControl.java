package StructuralPatterns.Bridge.ExampleProblem;

public class SamsungRemoteControl extends RemoteControl {
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
}
