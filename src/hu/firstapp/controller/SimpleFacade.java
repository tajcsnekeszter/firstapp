package hu.firstapp.controller;

import java.util.List;

import hu.firstapp.model.service.SecquenceCalculator;
import hu.firstapp.model.service.SimpleCondition;
import hu.firstapp.model.service.SimpleFind;
import hu.firstapp.model.service.SimpleSelect;
import hu.firstapp.model.service.SimpleStrategy;

public class SimpleFacade {

	private final List<Integer> list;

	public SimpleFacade(List<Integer> list) {
		this.list = list;
	}

	public int getSequenceAdd() {
		SimpleStrategy<Integer> strategy = new SecquenceCalculator(list);
		return strategy.getResult(0);
	}

	public boolean getCondition(int denominator) {
		SimpleStrategy<Boolean> strategy = new SimpleCondition(list);
		return strategy.getResult(denominator);
	}
	
	public int getSelected(int denominator) {
		SimpleStrategy<Integer> strategy = new SimpleSelect(list);
		return strategy.getResult(denominator);
	}
	
	public int getFound(int denominator) {
		SimpleStrategy<Integer> strategy = new SimpleFind(list);
		return strategy.getResult(denominator);
	}
}