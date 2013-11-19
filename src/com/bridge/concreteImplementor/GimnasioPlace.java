package com.bridge.concreteImplementor;

import com.bridge.implementor.GimnasioImplementor;

public class GimnasioPlace implements GimnasioImplementor {
	
	public void hacerAerobico() {
		System.out.println("Corro 30 minutos");
	}

	public void hacerCinturaPaArriba() {
		System.out.println("Hago 3 series biceps");
	}

}
