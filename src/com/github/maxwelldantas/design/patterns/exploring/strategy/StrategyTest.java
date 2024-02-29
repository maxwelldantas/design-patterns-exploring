package com.github.maxwelldantas.design.patterns.exploring.strategy;

public class StrategyTest {

	public static void main(String[] args) {
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento normal = new ComportamentoNormal();
		Comportamento agressivo = new ComportamentoAgressivo();

		Robo robo = new Robo();

		robo.setStrategy(defensivo);

		robo.mover();
		robo.mover();
		robo.mover();

		robo.setStrategy(normal);

		robo.mover();
		robo.mover();

		robo.setStrategy(agressivo);

		robo.mover();
		robo.mover();
		robo.mover();
		robo.mover();
	}
}
