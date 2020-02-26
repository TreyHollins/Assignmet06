package people;

import work.Work;

public class Teacher extends Person implements Work{
	
	private Boolean isWorking;

	public Teacher(String LastName, String FirstName) {
		super(LastName, FirstName);
		isWorking = false;
	}
	/***
	 * Get isWorking
	 * @return isWoring
	 */
	public Boolean getIsWorking() {
		return isWorking;
	}
	/***
	 * Set whether the person is working or not
	 * @param isWorking
	 */
	public void setIsWorking(Boolean isWorking) {
		this.isWorking = isWorking;
	}
	
	public String toString() {
		return super.toString() + " Working: " + isWorking;
	}

	@Override
	public void work() {
		
		
	}

	@Override
	public void stopWorking() {
		
		
	}

	

}
