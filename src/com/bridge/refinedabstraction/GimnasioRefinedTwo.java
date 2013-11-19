package com.bridge.refinedabstraction;

import com.bridge.abstraction.GimnasioAbstract;
import com.bridge.implementor.GimnasioImplementor;

public class GimnasioRefinedTwo extends GimnasioAbstract {

	public GimnasioRefinedTwo(GimnasioImplementor gymImpl) {
		super(gymImpl);
		// TODO Auto-generated constructor stub
	}

	public void hacerCardio() {
		beberFanta();
		this.getGymImpl().hacerAerobico();
	}

	private void beberFanta() {
		System.out.println("Bebo un poco de fanta");
		
	}

	public void hacerTrenSuperior() {
		this.getGymImpl().hacerCinturaPaArriba();
	}

}
