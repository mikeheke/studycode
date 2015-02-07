package mikeheke.studycode.designpattern.mediator1;

public class ConcreteColleague1 extends Colleague {

	public void selfMethod1() {
		System.out.println("ConcreteColleague1-selfMethod1()");
	}
	
	public void dependMethod1() {
		
		// do self logic
		
		//depend other obj
		super.getMediator().doSomething1();
	}
}
