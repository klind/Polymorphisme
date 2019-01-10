package com.poly;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		List<Vehicle> vehicles = new ArrayList<>();
		
		Vehicle v1 = new Car();
		Vehicle v2 = new Bus();
		Vehicle v3 = new Motorcycle();
		Vehicle v4 = new Vehicle();
				
		vehicles.add(v1);
		vehicles.add(v2);
		vehicles.add(v3);
		vehicles.add(v4);
		vehicles.forEach(v -> v.start());
	}

}
