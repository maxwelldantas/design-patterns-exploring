package com.github.maxwelldantas.design.patterns.exploring.strategy;

/**
 * Classe de comportamento agressivo robô.
 */
public class ComportamentoAgressivo implements Comportamento {

	@Override
	public void mover() {
		System.out.println("Movendo-se agressivamente...");
	}
}
