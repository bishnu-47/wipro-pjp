package test;

import com.automoblie.fourwheeler.Ford;
import com.automoblie.fourwheeler.Logan;
import com.automoblie.twowheeler.Hero;
import com.automoblie.twowheeler.Honda;

public class Test {
	public static void main(String[] args) {
		// two wheeler
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

		System.out.println();
		// four wheelers
		Logan logan = new Logan("Edge Key", "MNO/987", "Ram");
		Ford ford = new Ford("Figgo", "QWER/567", "Shyam");

		System.out.println("Vechicle Name: Logan " + logan.getModelName());
		System.out.println("Registration Number: " + logan.getRegistrationNumber());
		System.out.println("Owner Name: " + logan.getOwnerName());
		System.out.println("Speed: " + logan.getSpeed());
		logan.gps();

		System.out.println();

		System.out.println("Vechicle Name: Ford " + ford.getModelName());
		System.out.println("Registration Number: " + ford.getRegistrationNumber());
		System.out.println("Owner Name: " + ford.getOwnerName());
		System.out.println("Speed: " + ford.getSpeed());
		ford.tempControl();
	}

}
