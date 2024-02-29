package com.github.maxwelldantas.design.patterns.exploring.singleton;

/**
 * Singleton "Lazy Holder".
 *
 * @see <a href="https://stackoverflow.com/a/24018148">Referencia</a>
 *
 * @author maxwelldantas
 */
public class SingletonLazyHolder {

	private SingletonLazyHolder() {
		super();
	}

	public static SingletonLazyHolder getInstance() {
		return InstanceHolder.instancia;
	}

	private static class InstanceHolder {
		private static final SingletonLazyHolder instancia = new SingletonLazyHolder();
	}
}
