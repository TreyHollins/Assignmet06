package people;

public class Student extends Person{

	private Boolean isWorking = false;
	
	public Student(String LastName, String FirstName) {
		super(LastName, FirstName);
		
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
		isWorking = true;

	}

	@Override
	public void stopWorking() {
		isWorking = false;

	}
	public String toString() {
		return super.toString() + " Working: " + isWorking;
	}

	

}
