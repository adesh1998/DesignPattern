package com.example1;

public class MovableAdapterImpl implements MovableAdapter {

	private Movable luxuryCars;

	@Override
	public double getSpeed() {
		return convertMPHtoKMPH(luxuryCars.getSpeed());
	}

	private double convertMPHtoKMPH(double mph) {
		return mph * 1.60934;
	}

	// standard constructors
	public MovableAdapterImpl(Movable luxuryCars) {
		super();
		this.luxuryCars = luxuryCars;
	}
}