package people;

import work.Work;

public class Student extends Person implements Work{

	private Boolean isWorking;
	
	public Student(String LastName, String FirstName) {
		super(LastName, FirstName);
		isWorking = false;
	}
	/***
	 * Gets isWorking
	 * @return isWorking
	 */
	public Boolean getIsWorking() {
		return isWorking;
	}
	/***
	 * Defines whether the student is working or not
	 * @param isWorking
	 */
	public void setIsWorking(Boolean isWorking) {
		this.isWorking = isWorking;
	}
	@Override
	public void work() {
		

	}

	@Override
	public void stopWorking() {
		

	}
	public String toString() {
		return super.toString() + " Working: " + isWorking;
	}

	

}
