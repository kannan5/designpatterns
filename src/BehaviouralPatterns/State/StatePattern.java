package BehaviouralPatterns.State;

import BehaviouralPatterns.State.Example.*;
import BehaviouralPatterns.State.Exercise.*;

import java.util.Scanner;

public class StatePattern {
	public void StateClient() throws Exception {
		try {
			System.out.println("State Pattern");
			CommuteExercise();
		}
		catch (Exception ex){
			throw new Exception("Error in State Client: " + ex.getMessage());
		}
	}


	public void CommuteExercise(){
		Scanner scanner = new Scanner(System.in);
		DirectionService directionService = new DirectionService();
		String inputString;
		do {
			inputString = scanner.nextLine();
			switch (inputString.toLowerCase()){
				case "driving":
					directionService.setTravelMode(new Driving());
					break;
				case "bicycling":
					directionService.setTravelMode(new Bicycling());
					break;
				case "transit":
					directionService.setTravelMode(new Transit());
					break;
				default:
					directionService.setTravelMode(new Walking());
					break;
			}
			System.out.println(inputString);
			System.out.println("The Commute  Started");
			directionService.getDirection();
			directionService.getEta();
		}
		while(!inputString.equals("stop"));
	}
	public void StateToolCreationExample(){
		Scanner scanner = new Scanner(System.in);
		ToolCreation tool = null;
		String inputString;
		do {
			inputString = scanner.nextLine();
			switch (inputString){
				case "Pen":
					tool = new ToolCreation(new Pen());
					break;
				case "Sketch":
					tool = new ToolCreation(new Sketch());
					break;
			}
			System.out.println(inputString);
			System.out.println("The Tool Creation Started");
			tool.StartToolCreation();
		}
		while(!inputString.equals("stop"));
	}
}