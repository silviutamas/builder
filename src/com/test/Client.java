package com.test;

public class Client {
	public static void main(String[] args) {

		new Student.StudentBuilder("andrei", "gavrila").age(10).height(11)
				.build();
	}

}
