package hu.firstapp;

import java.util.List;

import hu.firstapp.controller.SimpleFacade;
import hu.firstapp.model.service.ListGenerator;

public class App {

	private final List<Integer> list;
	private final SimpleFacade facade;
	
	public App() {
		this.list = ListGenerator.getList(100, 100);
		facade = new SimpleFacade(list);
	}
	
	public static void main(String[] args) {
	App app = new App();
	app.run();
	}
	
	private void run() {
		System.out.println(this);
		System.out.println("A sorozat �sszege: " + facade.getSequenceAdd());
		int denominator = 4;
		if (facade.getCondition(denominator)) {
			System.out.println("A sorozatban van " + denominator + "-al oszthat� sz�m");
			System.out.println("A sorozat " + facade.getSelected(denominator) + ". eleme az!");
			
		} else {
			System.out.println("A sorozatban nincs " + denominator + "-al oszthat� sz�m");
		}
		
		denominator = 37;
		System.out.println("A sorozat " + facade.getFound(denominator) + ". eleme oszthat� " + denominator + "-al");
		System.out.println("A sorozatban " + facade.getCount(denominator) + " db " + denominator + "-al oszthat� sz�m van!");
		System.out.println("A sorozat " + facade.getMax() + ". eleme a  legnagyobb, �rt�ke " + list.get(facade.getMax()));
		System.out.println(this);
	}
	
	@Override
	public String toString() {
		return "App [x=" + list + "]";
	}
}


