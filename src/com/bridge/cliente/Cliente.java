package com.bridge.cliente;

import com.bridge.abstraction.GimnasioAbstract;
import com.bridge.concreteImplementor.GimnasioHoliday;
import com.bridge.concreteImplementor.GimnasioHolmes;
import com.bridge.concreteImplementor.GimnasioPlace;
import com.bridge.concreteImplementor.GimnasioPrivado;
import com.bridge.concreteImplementor.GimnasioPublico;
import com.bridge.refinedabstraction.GimnasioRefinedOne;
import com.bridge.refinedabstraction.GimnasioRefinedTwo;

public class Cliente {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		GimnasioAbstract cliente1 = new GimnasioRefinedOne(new GimnasioPublico());		
		
		cliente1.hacerCardio();
		cliente1.hacerTrenSuperior();

		cliente1.setGymImpl(new GimnasioPrivado());
		cliente1.hacerCardio();
		
		cliente1.setGymImpl(new GimnasioHoliday());
		cliente1.hacerCardio();
		
		cliente1.setGymImpl(new GimnasioHolmes());
		cliente1.hacerTrenSuperior();
		cliente1.hacerCardio();
		
		cliente1.setGymImpl(new GimnasioPlace());
		cliente1.hacerCardio();
		cliente1.hacerTrenSuperior();
		cliente1.hacerCardio();
		cliente1.hacerTrenSuperior();
		
//		GimnasioAbstract cliente2 = new GimnasioRefinedFanta(new GimnasioPublico());
//		
//		cliente2.hacerCardio();
//		cliente2.hacerTrenSuperior();
//
//		cliente2.setGymImpl(new GimnasioPrivado());
//		cliente2.hacerCardio();
//		
//		cliente2.setGymImpl(new GimnasioHoliday());
//		cliente2.hacerCardio();
//		
//		cliente2.setGymImpl(new GimnasioHolmes());
//		cliente2.hacerTrenSuperior();
//		cliente2.hacerCardio();
//		
//		cliente2.setGymImpl(new GimnasioPlace());
//		cliente2.hacerCardio();
//		cliente2.hacerTrenSuperior();
//		cliente2.hacerCardio();
//		cliente2.hacerTrenSuperior();
	}

}
