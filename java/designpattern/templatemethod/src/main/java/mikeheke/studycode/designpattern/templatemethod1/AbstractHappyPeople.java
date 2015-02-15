package mikeheke.studycode.designpattern.templatemethod1;

public abstract class AbstractHappyPeople {

	public final void celebrateSpringFestival() {
		//step1. 
		subscribeTicket();
		//step2.
		travel();
		//step3.
		celebrate();
	}
	
	/**
	 * buy ticket
	 */
	public void subscribeTicket() {
		System.out.println("buy ticket...");
	}
	
	/**
	 * travel
	 */
	public abstract void travel();
	
	public void celebrate() {
		 System.out.println("celebrate...");
	}
	
	
}
