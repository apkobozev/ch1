package com.epam.cp.factory;

public interface AbstractFactory {
	
	public void writePerson(Person p);
	
	public Person readPerson();
	
	public Person readPerson(String name);

}
