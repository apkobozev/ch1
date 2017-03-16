package com.epam.cp.factory;

public class FactoryForFileManager implements AbstractFactory {
	
	private final String fileName;
	
	public FactoryForFileManager(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public void writePerson(Person p) {
		System.out.println("Work with file: " + getFileName());
		System.out.println("Wrap user " + p.getName() + ":" + p.getAge() + " to a buffer");
		System.out.println("Write to File!");
		System.out.println();
	}

	@Override
	public Person readPerson() {
		System.out.println("Read nameless Person from file: " + getFileName());
		System.out.println();
		return null;
	}

	@Override
	public Person readPerson(String name) {
		System.out.println("Work with file: " + getFileName());
		System.out.println("Search for user: " + name);
		System.out.println("Read from File!");
		System.out.println();
		return null;
	}

	public String getFileName() {
		return fileName;
	}

}
