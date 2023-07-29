package StructuralPatterns.Composite;

import StructuralPatterns.Composite.Example.Circle;
import StructuralPatterns.Composite.Example.Group;
import StructuralPatterns.Composite.Example.Shape;
import StructuralPatterns.Composite.Example.Square;
import StructuralPatterns.Composite.Exercise.HumanResource;
import StructuralPatterns.Composite.Exercise.Team;
import StructuralPatterns.Composite.Exercise.Truck;

public class CompositeClient {
	public void CompositeExample(){
			Group group1 = new Group();
			Shape circle1 = new Circle();
			Shape circle2 = new Circle();
			group1.AddItem(circle1);
			group1.AddItem(circle2);
			Group group2 = new Group();
			Shape square1 = new Square();
			Shape square2 = new Square();
			group2.AddItem(square1);
			group2.AddItem(square2);
			group1.Render();
			group2.Render();
			group1.Move();
			group2.Move();
	}
	public void CompositeExercise(){
			var subTeam1 = new Team();
			subTeam1.add(new Truck());
			subTeam1.add(new HumanResource());
			subTeam1.add(new HumanResource());

			var subTeam2 = new Team();
			subTeam2.add(new Truck());
			subTeam2.add(new HumanResource());
			subTeam2.add(new HumanResource());

			var team = new Team();
			team.add(subTeam1);
			team.add(subTeam2);

			team.deploy();
		}
	}
