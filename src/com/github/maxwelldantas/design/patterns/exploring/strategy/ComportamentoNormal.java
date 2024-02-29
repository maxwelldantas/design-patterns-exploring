package com.github.maxwelldantas.design.patterns.exploring.strategy;

/**
 * Classe de comportamento normal do robô.
 */
public class ComportamentoNormal implements Comportamento {

	@Override
	public void mover() {
		System.out.println("Movendo-se normalmente...");
	}
}
