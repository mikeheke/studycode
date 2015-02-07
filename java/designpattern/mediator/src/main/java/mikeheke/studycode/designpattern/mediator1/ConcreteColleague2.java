package mikeheke.studycode.designpattern.mediator1;

public class ConcreteColleague2 extends Colleague {

	public void selfMethod2() {
		System.out.println("ConcreteColleague2-selfMethod2()");
	}
	
	public void dependMethod2() {
		// do self logic
		
		//depend other obj
		super.getMediator().doSomething2();
	}
}
