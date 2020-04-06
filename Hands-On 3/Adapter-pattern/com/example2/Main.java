package com.example2;

import static org.junit.Assert.*;

import org.junit.Test;

public class Main {

	@Test
	public void whenConvertingUSDToEURO_thenSuccessfullyConverted() {
	
		Usd us = new Price();
		Euro usdAdapter = new UsdAdapterImpl(us);

		assertEquals(usdAdapter.getCurr(), 46.24835, 0.00001);
	}
}
