package StructuralPatterns.Flyweight;

import StructuralPatterns.Flyweight.Example.PointIconFactory;
import StructuralPatterns.Flyweight.Example.PointService;

public class FlyweightClient {
	public void FlyweightExample(){
		PointService pointService = new PointService(new PointIconFactory());
		for( var point : pointService.getPoints()){
			point.Draw();
		}
	}
}
