package BehaviouralPatterns.Observer;

import BehaviouralPatterns.Observer.Exercise.Observer;
import BehaviouralPatterns.Observer.Exercise.StatusBar;
import BehaviouralPatterns.Observer.Exercise.Stock;
import BehaviouralPatterns.Observer.Exercise.StockListView;
import BehaviouralPatterns.Observer.PullMechanism.Example.Chart;
import BehaviouralPatterns.Observer.PullMechanism.Example.DataSource;
import BehaviouralPatterns.Observer.PullMechanism.Example.Observable;
import BehaviouralPatterns.Observer.PullMechanism.Example.SpreadSheet;
import BehaviouralPatterns.Observer.PushMechanism.Example.Chart2;
import BehaviouralPatterns.Observer.PushMechanism.Example.DataSource2;
import BehaviouralPatterns.Observer.PushMechanism.Example.SpreadSheet2;

public class ObserverClient {
	public void ObserverExample(){

		DataSource ds = new DataSource();
		SpreadSheet spreadSheet = new SpreadSheet(ds);
		Chart chart = new Chart();
		ds.AddObserver(spreadSheet);
		ds.AddObserver(chart);
		ds.setDataId(2);

		DataSource2 ds2 = new DataSource2();
		SpreadSheet2 spreadSheet2 = new SpreadSheet2();
		Chart2 chart2 = new Chart2();
		ds2.AddObserver(spreadSheet2);
		ds2.AddObserver(chart2);
		ds2.setDataId(3);

	}

	public void ObserverExercise(){

		Stock stock = new Stock("Test",2);
		Observer stockListView = new StockListView(stock);
		StatusBar statusBar = new StatusBar(stock);
		stock.AddObserver(stockListView);
		stock.AddObserver(statusBar);
		stock.setPrice(5);
	}
}
