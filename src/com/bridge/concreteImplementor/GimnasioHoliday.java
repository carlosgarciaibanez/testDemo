package com.bridge.concreteImplementor;

import com.bridge.implementor.GimnasioImplementor;

public class GimnasioHoliday implements GimnasioImplementor {

	public void hacerAerobico() {
		System.out.println("Corro 50 minutos");
	}

	public void hacerCinturaPaArriba() {
		System.out.println("Hago 5 series biceps");
	}

}
