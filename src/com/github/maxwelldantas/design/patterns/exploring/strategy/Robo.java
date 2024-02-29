package com.github.maxwelldantas.design.patterns.exploring.strategy;

/**
 * Classe robô.
 */
public class Robo {
	private Comportamento strategy;

	public void setStrategy(Comportamento strategy) {
		this.strategy = strategy;
	}

	public void mover() {
		strategy.mover();
	}
}
