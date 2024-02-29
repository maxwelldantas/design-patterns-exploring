package com.github.maxwelldantas.design.patterns.exploring.singleton;

/**
 * Singleton "apressado".
 *
 * @author maxwelldantas
 */
public class SingletonEager {

	private static SingletonEager instancia = new SingletonEager();

	private SingletonEager() {
		super();
	}

	public static SingletonEager getInstance() {
		return instancia;
	}
}
