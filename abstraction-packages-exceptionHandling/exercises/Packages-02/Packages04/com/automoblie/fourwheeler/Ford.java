package com.automoblie.fourwheeler;

import com.automoblie.Vehicle;

public class Ford extends Vehicle {
	String modelName;
	String registrationNumber;
	String ownerName;
	int speed;

	public Ford(String modelName, String registrationNumber, String ownerName) {
		this.modelName = modelName;
		this.registrationNumber = registrationNumber;
		this.ownerName = ownerName;
		speed = 120;
	}

	public int getSpeed() {
		return this.speed;
	}

	public void tempControl() {
		System.out.println("Controlling AC.");
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
