package com.bridge.refinedabstraction;

import com.bridge.abstraction.GimnasioAbstract;
import com.bridge.implementor.GimnasioImplementor;

public class GimnasioRefinedOne extends GimnasioAbstract {

	public GimnasioRefinedOne(GimnasioImplementor gymImpl) {
		super(gymImpl);
		// TODO Auto-generated constructor stub
	}

	public void hacerCardio() {
		beberAgua();
		this.getGymImpl().hacerAerobico();
	}

	private void beberAgua() {
		System.out.println("Bebo un poco de agua");
		
	}

	public void hacerTrenSuperior() {
		this.getGymImpl().hacerCinturaPaArriba();
	}

}
