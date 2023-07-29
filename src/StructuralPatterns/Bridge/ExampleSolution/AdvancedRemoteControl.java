package StructuralPatterns.Bridge.ExampleSolution;


public class AdvancedRemoteControl extends  RemoteControl{
	public AdvancedRemoteControl(Device device) {
		super(device);
	}

	public void SetChannel(int channelId){
		device.SetChannel(channelId);
	}
}
