package mikeheke.studycode.designpattern.mediator1;

public class ConcreteMediator extends Mediator {

	@Override
	public void doSomething1() {
		// TODO Auto-generated method stub
		super.getConcreteColleague2().selfMethod2();
		super.getConcreteColleague3().selfMethod3();
	}

	@Override
	public void doSomething2() {
		// TODO Auto-generated method stub
		super.getConcreteColleague1().selfMethod1();
		super.getConcreteColleague3().selfMethod3();
	}

	@Override
	public void doSomething3() {
		// TODO Auto-generated method stub
		super.getConcreteColleague1().selfMethod1();
		super.getConcreteColleague2().selfMethod2();
	}

	
}
