package com.epam.cp.factory;

public class FactoryForDBManager implements AbstractFactory {
	
	private final String driver;
	
	public FactoryForDBManager(String driver) {
		this.driver = driver;
	}

	@Override
	public void writePerson(Person p) {
		System.out.println("Work with driver: " + getDriver());
		System.out.println("Wrap user " + p.getName() + ":" + p.getAge() + " to a buffer");
		System.out.println("Write to DB!");
		System.out.println();
	}

	@Override
	public Person readPerson() {
		System.out.println("Read nameless Person using driver: " + getDriver());
		System.out.println();
		return null;
	}

	@Override
	public Person readPerson(String name) {
		System.out.println("Work with driver: " + getDriver());
		System.out.println("Search for user: " + name);
		System.out.println("Read from DB!");
		System.out.println();
		return null;
	}

	public String getDriver() {
		return driver;
	}
	
}
