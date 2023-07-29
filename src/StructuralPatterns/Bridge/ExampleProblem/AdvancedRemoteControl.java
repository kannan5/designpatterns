package StructuralPatterns.Bridge.ExampleProblem;

public abstract class AdvancedRemoteControl extends RemoteControl{
	public abstract void ScanChannels();
	public abstract void SetChannel(int channelId);
}
