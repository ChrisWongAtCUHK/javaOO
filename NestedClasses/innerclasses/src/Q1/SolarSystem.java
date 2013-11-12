package Q1;

import java.util.*;

public class SolarSystem {
	static Scanner sc = new Scanner(System.in);
	static Planet[] planets;

	int numPlanets;
	static String SSName;

	public SolarSystem(){
		System.out.println("Name of solar system?");
		SSName = sc.nextLine();
		System.out.println("How many planets in your solar system?");
		numPlanets = sc.nextInt();
		sc.nextLine();
		planets = new Planet[numPlanets];
	}

	public class Planet{
		public String planetName;
		public int disFromSun; //millions of miles

		public Planet(){
			for(int i = 0; i < planets.length; i++ ){
				System.out.println("What is the name of planet number  " + (i+1));
				planetName = sc.nextLine();
				System.out.println("How far is it from the sun?");
				disFromSun = sc.nextInt();
				SolarSystem.this.planets[i] = this;
			}
		}

		public void printDetails(){
			System.out.println("The name of the solar system is " + SolarSystem.this.SSName);
			System.out.println("The number of planets of the solar system is " + SolarSystem.this.planets.length);
			for(int i = 0; i < SolarSystem.this.planets.length; i++){
				System.out.println("Planet name: " + SolarSystem.this.planets[i].planetName + "\nDistance from Sun " + SolarSystem.this.planets[i].disFromSun);
			}
		}
	}

}
