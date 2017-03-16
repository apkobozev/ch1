package com.epam.cp;

import com.epam.cp.builder.Filter;
import com.epam.cp.factory.AbstractFactory;
import com.epam.cp.factory.FactoryForDBManager;
import com.epam.cp.factory.FactoryForFileManager;
import com.epam.cp.factory.Person;

public class Main {

	public static void main(String[] args) {
		//Builder
		Filter creatureFilter = new Filter.FilterBuilder()
				.name("CountOfLegsForYourCreature")
				.min(2)
				.max(8)
				.build();
		System.out.println(creatureFilter.toString());
		System.out.println();
		System.out.println("===");
		System.out.println();
		
		
		//Factory
		String name = "Luke Skywutlolno";
		Person p = new Person(name, 34); 
		
		AbstractFactory fileFactory = new FactoryForFileManager("users.txt");
		fileFactory.writePerson(p);
		fileFactory.readPerson(name);
		fileFactory.readPerson();
		
		AbstractFactory dbFactory = new FactoryForDBManager("jdbc.odbc");
		dbFactory.writePerson(p);
		dbFactory.readPerson(name);
		dbFactory.readPerson();
	}

}
