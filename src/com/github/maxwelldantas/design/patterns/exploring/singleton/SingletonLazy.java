package com.github.maxwelldantas.design.patterns.exploring.singleton;

/**
 * Singleton "preguiçoso".
 *
 * @author maxwelldantas
 */
public class SingletonLazy {

	private static SingletonLazy instancia;

	private SingletonLazy() {
		super();
	}

	public static SingletonLazy getInstance() {
		if (instancia == null) {
			instancia = new SingletonLazy();
		}
		return instancia;
	}
}
