package StructuralPatterns.Decorator;

import StructuralPatterns.Decorator.Example.CloudStream;
import StructuralPatterns.Decorator.Example.CompressStream;
import StructuralPatterns.Decorator.Example.EncryptedCloudStream;
import StructuralPatterns.Decorator.Example.Stream;
import StructuralPatterns.Decorator.Exercise.Demo;

public class DecoratorClient {
	public void DecoratorExample(){
		sendData(new EncryptedCloudStream(new CloudStream()));
		sendData(new EncryptedCloudStream(new CompressStream(new CloudStream())));
	}
	public void DecoratorExercise(){
		Demo.show();
	}
	private void sendData(Stream stream){
		stream.Write();
	}
}
