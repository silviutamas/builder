package com.test;

public class Student {
	private final String name; // mandatory
	private final String surname; // mandatory
	private final int age;
	private final int height;

	private Student(StudentBuilder st) {
		this.name = st.name;
		this.surname = st.surname;
		this.age = st.age;
		this.height = st.height;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public int getAge() {
		return age;
	}

	public int getHeight() {
		return height;
	}

	public static class StudentBuilder {
		private String name;
		private String surname;
		private int age;
		private int height;

		public StudentBuilder(String name, String surname) {
			this.name = name;
			this.surname = surname;
		}

		public StudentBuilder age(int age) {
			this.age = age;
			return this;
		}

		public StudentBuilder height(int height) {
			this.height = height;
			return this;
		}

		public Student build() {
			return new Student(this);
		}
	}

}