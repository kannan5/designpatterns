package StructuralPatterns.Bridge.ExampleProblem;

public class SonyRemoteControl extends  RemoteControl{

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
