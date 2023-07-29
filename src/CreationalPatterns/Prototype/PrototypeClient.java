package CreationalPatterns.Prototype;

import CreationalPatterns.Prototype.ExampleProblem.Circle;
import CreationalPatterns.Prototype.ExampleProblem.ContextMenu;
import CreationalPatterns.Prototype.ExerciseSolution.Text;
import CreationalPatterns.Prototype.ExerciseProblem.*;

import static java.lang.System.in;

public class PrototypeClient {

	public void PrototypeExampleProblem(){
		Circle circle1 = new Circle();
		circle1.setRadius(5);
		ContextMenu contextMenu = new ContextMenu();
		Circle Circle2 = (Circle)contextMenu.Duplicate(circle1);
		Circle2.Render();
		System.out.println(Circle2.getRadius());
	}
	public void PrototypeExampleSolution(){
		Circle circle1 = new Circle();
		circle1.setRadius(5);
		ContextMenu contextMenu = new ContextMenu();
		Circle Circle2 = (Circle)contextMenu.Duplicate(circle1);
		Circle2.Render();
		System.out.println(Circle2.getRadius());
	}


	public void PrototypeExerciseProblem(){
		CreationalPatterns.Prototype.ExerciseProblem.Text text1 = new CreationalPatterns.Prototype.ExerciseProblem.Text("Sample Text");
		var timeline = new Timeline();
		timeline.add(text1);
	  CreationalPatterns.Prototype.ExerciseProblem.ContextMenu contextMenu = new CreationalPatterns.Prototype.ExerciseProblem.ContextMenu(timeline);
	}
	public void PrototypeExerciseSolution(){
		CreationalPatterns.Prototype.ExerciseSolution.Text text2 = new CreationalPatterns.Prototype.ExerciseSolution.Text("Sample Text");
		var timeline = new CreationalPatterns.Prototype.ExerciseSolution.Timeline();
		timeline.add(text2);
		CreationalPatterns.Prototype.ExerciseSolution.ContextMenu contextMenu = new CreationalPatterns.Prototype.ExerciseSolution.ContextMenu(timeline);
		var clonedObj = (Text)contextMenu.duplicate(text2);
		System.out.println((clonedObj.getContent()));
	}
}
