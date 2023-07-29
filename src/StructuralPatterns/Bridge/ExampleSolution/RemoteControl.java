package StructuralPatterns.Bridge.ExampleSolution;

public class RemoteControl{

	protected final Device device;
	public RemoteControl(Device device) {
		this.device = device;
	}

	public void turnOn(){
		device.TurnOn();
	}

	public void turnOff(){
		device.TurnOff();
	}

}
