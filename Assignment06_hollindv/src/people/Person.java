/*
 * Name: David Hollins
 * Email: hollindv@mail.uc.edu
 * Course: IT 2045C
 * Due Date: 2/27/2020
 * Assignment: 06
 * Description:
 * Citations:
 */
package people;

import work.Work;

public abstract class Person implements Work {
	private String LastName;
	private String FirstName;
	
	public Person(String LastName, String FirstName) {
		setFirstName(FirstName);
		setLastName(LastName);
	}
	
	public Person(Person p) {
		
	}
	
	/***
	 * Get the last name
	 * @return LastName
	 */
	public String getLastName() {
		return LastName;
	}
	/***
	 * Set the LastName
	 * @param lastName
	 */
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	/***
	 * Get the FirstName
	 * @return FirstName
	 */
	public String getFirstName() {
		return FirstName;
	}
	/***
	 * Set the FirstName
	 * @param firstName
	 */
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	
	 public String toString() {
		return "First Name: " + FirstName + " Last Name: " + LastName;
	}
}
