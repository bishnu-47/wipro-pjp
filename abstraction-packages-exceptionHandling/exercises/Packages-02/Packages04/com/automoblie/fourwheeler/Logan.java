package com.automoblie.fourwheeler;

import com.automoblie.Vehicle;

public class Logan extends Vehicle {

	String modelName;
	String registrationNumber;
	String ownerName;
	int speed;

	public Logan(String modelName, String registrationNumber, String ownerName) {
		this.modelName = modelName;
		this.registrationNumber = registrationNumber;
		this.ownerName = ownerName;
		speed = 90;
	}

	public int getSpeed() {
		return this.speed;
	}

	public void gps() {
		System.out.println("Controlling GPS.");
	}

	@Override
	public String getModelName() {
		return this.modelName;
	}

	@Override
	public String getRegistrationNumber() {
		return this.registrationNumber;
	}

	@Override
	public String getOwnerName() {
		return this.ownerName;
	}
}
