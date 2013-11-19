package com.bridge.concreteImplementor;

import com.bridge.implementor.GimnasioImplementor;

public class GimnasioPrivado implements GimnasioImplementor {
	
	public void hacerAerobico() {
		System.out.println("Corro 20 minutos");
	}

	public void hacerCinturaPaArriba() {
		System.out.println("Hago 2 series biceps");
	}

}
