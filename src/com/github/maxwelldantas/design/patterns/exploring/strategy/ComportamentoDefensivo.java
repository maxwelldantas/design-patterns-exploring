package com.github.maxwelldantas.design.patterns.exploring.strategy;

/**
 * Classe de comportamento defensivo robô.
 */
public class ComportamentoDefensivo implements Comportamento {

	@Override
	public void mover() {
		System.out.println("Movendo-se defensivamente...");
	}
}
