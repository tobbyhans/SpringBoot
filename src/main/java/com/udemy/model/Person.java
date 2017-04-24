package com.udemy.model;

public class Person {
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	// INICIALIZAR SIN DATOS CONTRUCTOR EN BLANCO
	public Person() {
	}
// generate to string para los logs
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

}
