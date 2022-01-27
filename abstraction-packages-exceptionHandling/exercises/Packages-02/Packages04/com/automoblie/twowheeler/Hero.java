package com.automoblie.twowheeler;

import com.automoblie.Vehicle;

public class Hero extends Vehicle {
	String modelName;
	String registrationNumber;
	String ownerName;
	int speed;

	public Hero(String modelName, String registrationNumber, String ownerName) {
		this.modelName = modelName;
		this.registrationNumber = registrationNumber;
		this.ownerName = ownerName;
		this.speed = 60;
	}

	public int getSpeed() {
		return this.speed;
	}

	public void radio() {
		System.out.println("Controlling radio.");
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
