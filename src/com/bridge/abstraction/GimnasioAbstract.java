package com.bridge.abstraction;

import com.bridge.implementor.GimnasioImplementor;

public abstract class GimnasioAbstract {

	private GimnasioImplementor gymImpl;

	public GimnasioAbstract(GimnasioImplementor gymImpl) {
		this.gymImpl = gymImpl;
	}

	public GimnasioImplementor getGymImpl() {
		return gymImpl;
	}

	public void setGymImpl(GimnasioImplementor gymImpl) {
		this.gymImpl = gymImpl;
	}
	
	
	public abstract void hacerCardio();
	
	public abstract void hacerTrenSuperior();
		
	
}
