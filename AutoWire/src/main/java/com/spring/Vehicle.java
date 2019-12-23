package com.spring;

public class Vehicle {
	Engine engine;

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	void parts() {
		System.out.println("vehicle parts");
	}
	void display() {
		parts();
		engine.parts();
	}
}
