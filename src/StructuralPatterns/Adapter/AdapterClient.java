package StructuralPatterns.Adapter;

import StructuralPatterns.Adapter.Example.BWFilter;
import StructuralPatterns.Adapter.Example.Image;
import StructuralPatterns.Adapter.Example.ImageFilter;
import StructuralPatterns.Adapter.Example.SepiaAdapter;
import StructuralPatterns.Adapter.Exercise.EmailClient;
import StructuralPatterns.Adapter.Exercise.EmailProvider;
import StructuralPatterns.Adapter.Exercise.Gmail.GmailClient;
import StructuralPatterns.Adapter.Exercise.GmailAdapter;

public class AdapterClient {
	public void AdapterExample(){
		Image image = new Image("TestFile.jpg");
		ImageFilter imgFilter = new BWFilter(image);
		imgFilter.Apply();
		imgFilter.Revoke();
		ImageFilter imgFilter2 = new SepiaAdapter(image);
		imgFilter2.Apply();
		imgFilter2.Revoke();
	}

	public void AdapterExercise(){
		EmailProvider emailProvider1 = new GmailAdapter(new GmailClient());
		EmailProvider emailProvider2 = new GmailAdapter(new GmailClient());
		EmailClient emailClient = new EmailClient();
		emailClient.addProvider(emailProvider1);
		emailClient.addProvider(emailProvider2);
		emailClient.downloadEmails();;
	}
}
