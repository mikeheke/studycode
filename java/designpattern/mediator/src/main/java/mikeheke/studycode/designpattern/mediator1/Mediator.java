package mikeheke.studycode.designpattern.mediator1;

public abstract class Mediator {
	
	private ConcreteColleague1 concreteColleague1;
	
	private ConcreteColleague2 concreteColleague2;
	
	private ConcreteColleague3 concreteColleague3;


	public abstract void doSomething1();
	
	public abstract void doSomething2();
	
	public abstract void doSomething3();
	

	public ConcreteColleague1 getConcreteColleague1() {
		return concreteColleague1;
	}

	public void setConcreteColleague1(ConcreteColleague1 concreteColleague1) {
		this.concreteColleague1 = concreteColleague1;
	}

	public ConcreteColleague2 getConcreteColleague2() {
		return concreteColleague2;
	}

	public void setConcreteColleague2(ConcreteColleague2 concreteColleague2) {
		this.concreteColleague2 = concreteColleague2;
	}

	public ConcreteColleague3 getConcreteColleague3() {
		return concreteColleague3;
	}

	public void setConcreteColleague3(ConcreteColleague3 concreteColleague3) {
		this.concreteColleague3 = concreteColleague3;
	}
	
}
