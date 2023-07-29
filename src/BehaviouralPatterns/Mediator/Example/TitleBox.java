package BehaviouralPatterns.Mediator.Example;

public class TitleBox extends UIControl{
	private String titleInfo;
	public TitleBox(DialogBox owner) {
		super(owner);
	}

	public String getTitleInfo() {
		return titleInfo;
	}

	public void setTitleInfo(String titleInfo) {
		this.titleInfo = titleInfo;
		owner.changed(this);
	}
}
