package BehaviouralPatterns.Mediator;

import BehaviouralPatterns.Mediator.Example.*;

import java.util.List;

public class MediatorClient {
	public void MediatorExample(){
		DialogBox dialogBox = new ArticleDialogBox();
		ListBox listBox = new ListBox(dialogBox);
		TitleBox titleBox = new TitleBox(dialogBox);
		listBox.setContent("Test Change");
	}
}
