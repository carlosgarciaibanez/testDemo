package com.bridge.concreteImplementor;

import com.bridge.implementor.GimnasioImplementor;

public class GimnasioPublico implements GimnasioImplementor {
	
	public void hacerAerobico() {
		System.out.println("Corro 10 minutos");
	}

	public void hacerCinturaPaArriba() {
		System.out.println("Hago 1 serie biceps");
	}

}
