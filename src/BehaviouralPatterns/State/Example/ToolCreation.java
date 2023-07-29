package BehaviouralPatterns.State.Example;

public class ToolCreation {
	private Tool tool;
	public void StartToolCreation(){
		tool.Use();
		System.out.println("The Tool was Used");
		tool.UndoChanges();
		System.out.println("The Tool changes were Reverted");
	}

	public ToolCreation(Tool tool){
		this.tool = tool;
	}
}
