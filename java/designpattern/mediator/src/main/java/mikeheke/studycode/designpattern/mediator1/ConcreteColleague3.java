package mikeheke.studycode.designpattern.mediator1;

public class ConcreteColleague3 extends Colleague {
	public void selfMethod3() {
		System.out.println("ConcreteColleague3-selfMethod3()");
	}
	
	public void dependMethod3() {
		// do self logic
		
		//depend other obj
		super.getMediator().doSomething3();
	}
}
