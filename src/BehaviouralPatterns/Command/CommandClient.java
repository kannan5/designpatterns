package BehaviouralPatterns.Command;

import BehaviouralPatterns.Command.Example.AddCustomerCommand;
import BehaviouralPatterns.Command.Example.CustomerService;
import BehaviouralPatterns.Command.Example.Framework.Button;
import BehaviouralPatterns.Command.Example2.HtmlDocument;
import BehaviouralPatterns.Command.Example2.SaveCommandExecutor;
import BehaviouralPatterns.Command.Example2.TextBoldCommandExecutor;
import BehaviouralPatterns.Command.Exercise.ContrastCommandExecutor;
import BehaviouralPatterns.Command.Exercise.TextCommandExecutor;
import BehaviouralPatterns.Command.Exercise.VideoEditor;

public class CommandClient {
	public void CommandExample(){
		CustomerService customerService = new CustomerService();
		AddCustomerCommand addCustomerCommand = new AddCustomerCommand(customerService);
		Button button = new Button(addCustomerCommand);
		button.click();
	}

	public void CommandExampleWithUndoMechanism(){
		HtmlDocument htmlDocument = new HtmlDocument();
		SaveCommandExecutor contrastCommandExecutor = new SaveCommandExecutor(htmlDocument);
		System.out.println(htmlDocument.getContent());
		htmlDocument.setContent("Test Text");
		System.out.println("Execution Save Command");
		contrastCommandExecutor.Execute();
		System.out.println("Execution Save Done");

		// With Undo Mechanism.
		TextBoldCommandExecutor textBoldCommand = new TextBoldCommandExecutor(htmlDocument);
		System.out.println("Execution");
		textBoldCommand.Execute();
		System.out.println(htmlDocument.getContent());
		System.out.println("Execution Revert");
		textBoldCommand.Unexecute();
		System.out.println(htmlDocument.getContent());
	}
	public void CommandExerciseWithUndoMechanism(){
		VideoEditor videoEditor = new VideoEditor();
		ContrastCommandExecutor contrastCommandExecutor = new ContrastCommandExecutor(videoEditor);
		videoEditor.setContrast(40);
		System.out.println(videoEditor.getContrast());
		System.out.println("Execution Contrast Command");
		contrastCommandExecutor.Execute();
		System.out.println(videoEditor.getContrast());
		System.out.println("Execution Contrast Revert");
		contrastCommandExecutor.Unexecute();
		System.out.println(videoEditor.getContrast());

		TextCommandExecutor textBoldCommandExecutor = new TextCommandExecutor(videoEditor);
		System.out.println(videoEditor.getText());
		System.out.println("Execution Contrast Command");
		textBoldCommandExecutor.Execute("Nt");
		System.out.println(videoEditor.getText());
		System.out.println("Execution Contrast Revert");
		textBoldCommandExecutor.Unexecute();
		System.out.println(videoEditor.getText());
	}
	public void CommandExercise(){

	}
}
