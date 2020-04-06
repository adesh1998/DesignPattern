package com.example1;

import static org.junit.Assert.*;

import org.junit.Test;

public class Main {

	@Test
	public void whenConvertingMPHToKMPH_thenSuccessfullyConverted() {
	
		Movable bugattiVeyron = new BugattiVeyron();
		MovableAdapter bugattiVeyronAdapter = new MovableAdapterImpl(bugattiVeyron);

		assertEquals(bugattiVeyronAdapter.getSpeed(), 431.30312, 0.00001);
	}
}
