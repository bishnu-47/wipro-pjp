package test;

import com.automoblie.twowheeler.Hero;
import com.automoblie.twowheeler.Honda;

public class Test {
	public static void main(String[] args) {
		Hero hero = new Hero("splendor", "ABCD/123", "Ramesh");
		Honda honda = new Honda("CB500", "XYZ/1234", "Suresh");

		System.out.println("Vechicle Name: Hero " + hero.getModelName());
		System.out.println("Registration Number: " + hero.getRegistrationNumber());
		System.out.println("Owner Name: " + hero.getOwnerName());
		System.out.println("Speed: " + hero.getSpeed());
		hero.radio();

		System.out.println();

		System.out.println("Vechicle Name: Honda " + honda.getModelName());
		System.out.println("Registration Number: " + honda.getRegistrationNumber());
		System.out.println("Owner Name: " + honda.getOwnerName());
		System.out.println("Speed: " + honda.getSpeed());
		honda.cdplayer();
	}

}
