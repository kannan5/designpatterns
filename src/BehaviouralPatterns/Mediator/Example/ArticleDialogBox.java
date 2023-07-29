package BehaviouralPatterns.Mediator.Example;

public class ArticleDialogBox extends DialogBox {
	private ListBox listBox = new ListBox(this);
	private TitleBox titleBox = new TitleBox(this);
	@Override
	public void changed(UIControl control) {
		if(control == listBox){
			titleBox.setTitleInfo(listBox.getContent());
		}
		if(control == titleBox){
			System.out.println("Printed Successfully");
		}
	}
}
