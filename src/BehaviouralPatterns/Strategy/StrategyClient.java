package BehaviouralPatterns.Strategy;

import BehaviouralPatterns.Strategy.Example.BWFilter;
import BehaviouralPatterns.Strategy.Example.ImageStorage;
import BehaviouralPatterns.Strategy.Example.PNGCompressor;
import BehaviouralPatterns.Strategy.Exercise.AESEncryptionAlgorithm;
import BehaviouralPatterns.Strategy.Exercise.ChatClient;

public class StrategyClient {
	public void StrategyExampleClient(){
		ImageStorage imageStorage = new ImageStorage(new PNGCompressor(), new BWFilter());
		imageStorage.StoreImage();
		ChatClient chatClient = new ChatClient(new AESEncryptionAlgorithm());
		chatClient.SendMessage();
		chatClient.ShowMessage();
		ChatClient chatClient2 = new ChatClient(new AESEncryptionAlgorithm());
		chatClient2.SendMessage();
		chatClient2.ShowMessage();
	}
}
