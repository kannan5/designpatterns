package StructuralPatterns.Bridge;
import StructuralPatterns.Bridge.ExampleSolution.*;

public class BridgeClient {

	public void BridgeExample(){
		var sonyRemoteControl = new RemoteControl(new SonyTV());
		sonyRemoteControl.turnOn();
		sonyRemoteControl.turnOff();
		var samsungRemoteControl = new AdvancedRemoteControl(new SamsungTV());
		samsungRemoteControl.turnOn();
		samsungRemoteControl.turnOff();
		samsungRemoteControl.SetChannel(1);
	}

}
