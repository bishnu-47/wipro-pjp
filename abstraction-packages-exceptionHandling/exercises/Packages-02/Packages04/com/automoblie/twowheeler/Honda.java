package com.automoblie.twowheeler;

import com.automoblie.Vehicle;

public class Honda extends Vehicle {
	String modelName;
	String registrationNumber;
	String ownerName;
	int speed;

	public Honda(String modelName, String registrationNumber, String ownerName) {
		this.modelName = modelName;
		this.registrationNumber = registrationNumber;
		this.ownerName = ownerName;
		speed = 70;
	}

	public int getSpeed() {
		return this.speed;
	}

	public void cdplayer() {
		System.out.println("Controlling cd player");
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
