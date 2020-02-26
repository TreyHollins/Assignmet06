/*
 * Name: David Hollins
 * Email: hollindv@mail.uc.edu
 * Course: IT 2045C
 * Due Date: 2/27/2020
 * Assignment: 06
 * Description:
 * Citations:
 */
package main;

import people.Student;
import people.Teacher;

public class Main {

	public static void main(String[] args) {
		 Teacher t = new Teacher("Nicholson", "Bill");
		 Student s = new Student("Hollins", "Trey");
		 
		 t.work();
		 s.stopWorking();
		 
		 System.out.println(t.toString());
		 System.out.println(s.toString());

	}

}
